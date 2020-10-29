package lohika.javaclub.txanomalies.web;

import lohika.javaclub.txanomalies.cases.NonRepeatableReadCase;
import lohika.javaclub.txanomalies.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class NonRepeatableReadController {

    final NonRepeatableReadCase nonRepeatableReadCase;

    @GetMapping("/nonrepeatable-read/get")
    public List<Product> getById(Integer id) throws Exception {
        return nonRepeatableReadCase.listProductWithId(id);
    }

    @GetMapping("/nonrepeatable-read/twiceprice")
    public Product twicePriceOfProductWithId(Integer id) throws Exception {
        return nonRepeatableReadCase.twicePriceOfProduct(id);
    }

}
