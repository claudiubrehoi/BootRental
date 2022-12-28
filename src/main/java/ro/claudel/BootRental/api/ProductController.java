package ro.claudel.BootRental.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.claudel.BootRental.dto.ProductDto;
import ro.claudel.BootRental.service.ProductService;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping(value = "/product", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity newProduct(@ModelAttribute("productDto") ProductDto productDto) {
        return ResponseEntity.ok(productService.newProduct(productDto));
    }

    @ModelAttribute(value = "productDto")
    public ProductDto newProductDto()
    {
        return new ProductDto();
    }

}
