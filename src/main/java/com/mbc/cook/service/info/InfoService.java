package com.mbc.cook.service.info;

import com.mbc.cook.entity.info.CategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InfoService {
    List<CategoryEntity> getCategory();

    CategoryEntity getCategoryList(long num);

    void categorySave(CategoryEntity categoryEntity);

    void categoryupdate(CategoryEntity categoryEntity);

    void categorydelete(long num);
}