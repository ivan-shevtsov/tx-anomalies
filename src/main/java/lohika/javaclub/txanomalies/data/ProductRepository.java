package lohika.javaclub.txanomalies.data;

import lohika.javaclub.txanomalies.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findAllByPriceLessThanEqual(Double price);

}
