package EarlyBasket.Services.EntityServices.implementations;

import EarlyBasket.Services.EntityServices.interfaces.ProductService;
import EarlyBasket.entities.Product;
import EarlyBasket.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return this.save(product);
    }
}
