package br.com.dorotech.service;

import br.com.dorotech.model.ProductEntity;
import br.com.dorotech.repository.ProductRepository;
import br.com.dorotech.service.domain.ProductDomain;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Override
    public ProductDomain create(ProductDomain domain) {
        var entity = this.productRepository.save(domain.createProductEntity());
        return  domain.toProductDomain(entity);
    }
}
