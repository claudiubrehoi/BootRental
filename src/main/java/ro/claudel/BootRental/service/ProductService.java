package ro.claudel.BootRental.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.claudel.BootRental.dto.ClientDto;
import ro.claudel.BootRental.dto.ProductDto;
import ro.claudel.BootRental.entity.Client;
import ro.claudel.BootRental.entity.Product;
import ro.claudel.BootRental.repository.ClientRepository;
import ro.claudel.BootRental.repository.ProductRepository;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public ProductDto newProduct(ProductDto productDto) {
        return mapToProductDto(productRepository.save(mapToProduct(productDto)));
    }

    private Product mapToProduct(ProductDto productDto) {
        Product product = new Product();
        product.setName(productDto.getName());
        product.setProductType(productDto.getProductType());
        product.setSize(productDto.getSize());
        product.setComments(productDto.getComments());
        return product;
    }

    private ProductDto mapToProductDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setName(product.getName());
        productDto.setProductType(product.getProductType());
        productDto.setSize(product.getSize());
        productDto.setComments(product.getComments());
        return productDto;
    }

}
