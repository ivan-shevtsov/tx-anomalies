package lohika.javaclub.txanomalies.web;

import lohika.javaclub.txanomalies.cases.PhantomReadCase;
import lohika.javaclub.txanomalies.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PhantomReadController {

    final PhantomReadCase phantomReadCase;

    @GetMapping("/phantom-read/get")
    public List<Product> getById(Double price) throws Exception {
        return phantomReadCase.listProductWithPriceLessThan(price);
    }

    @GetMapping("/phantom-read/get-safe")
    public List<Product> getByIdSafe(Double price) throws Exception {
        return phantomReadCase.safeListProductWithPricesLessThan(price);
    }

    @GetMapping("/phantom-read/twiceprice")
    public Product twicePriceOfProductWithId(Integer id) throws Exception {
        return phantomReadCase.twicePriceOfProduct(id);
    }

}
