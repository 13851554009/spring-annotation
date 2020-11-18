package com.example.demo.filter;

import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyTypeFilter implements TypeFilter {

    /**
     * @param metadataReader    获取当前操作类的信息
     * @param metadataReaderFactory 获取上线文信息
     * @return
     * @throws IOException
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        metadataReader.getAnnotationMetadata(); //获取扫描到的类注解信息

        ClassMetadata classMetadata = metadataReader.getClassMetadata();    //获取扫描到的类信息
        String className = classMetadata.getClassName();
        System.out.println("--------------"+className);
        if(className.contains("Person")){
            return true;
        }
        return false;
    }
}
