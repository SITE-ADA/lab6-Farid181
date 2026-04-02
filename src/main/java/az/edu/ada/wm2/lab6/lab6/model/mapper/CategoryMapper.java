package az.edu.ada.wm2.lab6.lab6.model.mapper;

import az.edu.ada.wm2.lab6.lab6.model.Category;
import az.edu.ada.wm2.lab6.lab6.model.dto.CategoryRequestDto;
import az.edu.ada.wm2.lab6.lab6.model.dto.CategoryResponseDto;

import java.util.UUID;

public class CategoryMapper {

    public static Category toEntity(CategoryRequestDto dto) {
        Category c = new Category();
        c.setId(UUID.randomUUID());
        c.setName(dto.getName());
        return c;
    }

    public static CategoryResponseDto toResponseDto(Category category) {
        CategoryResponseDto dto = new CategoryResponseDto();
        dto.setId(category.getId());
        dto.setName(category.getName());
        return dto;
    }
}