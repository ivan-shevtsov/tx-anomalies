package lohika.javaclub.txanomalies.web;

import lohika.javaclub.txanomalies.cases.DirtyReadCase;
import lohika.javaclub.txanomalies.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class DirtyReadController {

    final DirtyReadCase dirtyReadCase;

    @GetMapping("/dirty-read/update")
    public void dirtyReadUpdate(Product product) throws Exception {
        dirtyReadCase.updateAndFail(product);
    }

    @GetMapping("/dirty-read/get")
    public Product dirtyReadUpdate(Integer id) throws Exception {
        return dirtyReadCase.getDirtyProduct(id);
    }

}
