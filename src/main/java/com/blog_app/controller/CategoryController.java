package com.blog_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog_app.payload.ApiResponse;
import com.blog_app.payload.CategoryDto;
import com.blog_app.service.CategoryService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/cat")
public class CategoryController {
	
@Autowired
private CategoryService categoryService;

@PostMapping("/catcreate")
public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto)
{
	CategoryDto createCat=this.categoryService.createCategory(categoryDto);
	return new ResponseEntity<>(createCat, HttpStatus.OK);
}

//@PutMapping("/{categoryId}")
// public ResponseEntity<CategoryDto> updateCategory(@Valid @RequestBody CategoryDto categoryDto, @PathVariable("categoryId") Integer cid )
// {
//	 CategoryDto updatedCategory = this.categoryService.updateCategory(categoryDto, cid);
//	 return  ResponseEntity.ok(updatedCategory);
// }



@GetMapping("/{categoryId}")
public ResponseEntity<CategoryDto> getCategoryById(@PathVariable("categoryId") Integer cid)
{
	CategoryDto getCat = this.categoryService.getCategory(cid);
	return ResponseEntity.ok(getCat);
}

@GetMapping("/")
public ResponseEntity<List<CategoryDto>> getAllCategory()
{
	return ResponseEntity.ok(this.categoryService.getAllCategory());
}

@DeleteMapping("{categoryId}")

public ResponseEntity<ApiResponse>  deleteUser(@PathVariable("categoryId") Integer cid)
{
	this.categoryService.deleteCategory(cid);
    return new ResponseEntity(new ApiResponse("Category deleted successfully", true),HttpStatus.OK);
}

}
