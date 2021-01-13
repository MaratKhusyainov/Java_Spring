package ru.geekbrains.Hometask6.Service;

import ru.geekbrains.Hometask6.Dao.ProductDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductDao productDao;


    @Transactional
    public void getProductCustomers(Long id) {
        productDao.getProductCustomers(id);
    }

    @Override
    public void getProductCostumers(Long id) {

    }
}
