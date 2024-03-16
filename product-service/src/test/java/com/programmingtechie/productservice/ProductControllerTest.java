//package com.programmingtechie.productservice;
//
//import com.programmingtechie.productservice.controller.ProductController;
//import com.programmingtechie.productservice.dto.ProductRequest;
//import com.programmingtechie.productservice.repository.ProductRepository;
//import com.programmingtechie.productservice.service.ProductService;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.math.BigDecimal;
//
//import static org.mockito.Mockito.*;
//
//@ExtendWith(MockitoExtension.class)
//public class ProductControllerTest {
//
//    @Mock
//    private ProductService productService;
//
//    @Mock
//    private ProductRepository productRepository;
//
//    @Mock
//    private ProductController productController;
//
//    public ProductControllerTest() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    void testIfcreateProductBeingCalledwithproperdata() {
//
//        ProductRequest productRequest = new ProductRequest("Iphone13", "This is an iphone", BigDecimal.valueOf(1200));
//
//        doNothing().when(productController).createProduct(productRequest);
//
//        productController.createProduct(productRequest);
//
//        verify(productService).createProduct(productRequest);
//
//
//    }
//}
