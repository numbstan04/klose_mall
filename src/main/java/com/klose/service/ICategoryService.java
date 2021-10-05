package com.klose.service;

import com.klose.common.ServerResponse;
import com.klose.pojo.Category;

import java.util.List;

/**
 * @author Klose
 * @create 2021-10-05-0:05
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse selectCategoryAndChildrenById(Integer categoryId);
}
