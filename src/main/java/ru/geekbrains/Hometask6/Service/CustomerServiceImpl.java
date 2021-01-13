package ru.geekbrains.Hometask6.Service;


import ru.geekbrains.Hometask6.Dao.CustomerDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerDao customerDao;


    @Transactional
    public void getCustomerProducts(int id) {
        customerDao.getCustomerProducts(id);
    }

    @Override
    public void getCostumerProducts(int id) {

    }
}
