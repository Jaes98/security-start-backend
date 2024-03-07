package dat3.security_demo.api;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class CategoryController {

    @RestController

    public List<String> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map((c) => new String(c.getName())).toList();
    }

//    @PreAuthorize( hasAuthority('ADMIN')
    @PostMapping("/{category}")
    public List<String> addCategory(@PathVariable String category) {
        return categoryService.addCategory(category);
    }
}
