package com.abenbel.giflib.data;

import com.abenbel.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {
    private final static List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(15, "Funny"),
            new Category(16, "Educational"),
            new Category(10, "Artistic")
    );

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public Category findById(int id) {
        for(Category category : ALL_CATEGORIES) {
            if(category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}
