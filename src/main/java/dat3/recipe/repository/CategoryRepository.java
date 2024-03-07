package dat3.recipe.repository;

import dat3.recipe.entity.Category;
import dat3.recipe.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Recipe, Integer> {
    Optional<Category> findByCategoryName(String categoryName);


}
