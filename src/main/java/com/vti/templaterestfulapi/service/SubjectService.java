//package com.vti.templaterestfulapi.service;
//
//import com.vti.templaterestfulapi.repositories.SubjectRepository;
//import com.vti.templaterestfulapi.repositories.ProductTypeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class SubjectService {
//    @Autowired
//    SubjectRepository subjectRepositoryRepository;
//
//    public List<Product> getall() {
//        return productRepository.findAll();
//    }
//
//    @Override
//    public Product getProductById(Integer id) {
//        Product product = productRepository.getProductById(id);
//        return product;
//    }
//
//    @Override
//    public Page<Product> getAllPage(Pageable pageable) {
//        return productRepository.findAll(pageable);
//    }
//
//    @Override
//    public List<Product> getProductByName(String name) {
//        List<Product> products = productRepository.getProductByName(name);
//        return products;
//    }
//
//    @Override
//    public List<Product> findByNameLike(String namelike) {
//        List<Product> products = productRepository.findByNameLike(namelike);
//        return products;
//    }
//
//    @Override
//    public List<Product> findByPriceLessThan(Float pricea) {
//        List<Product> products = productRepository.findByPriceLessThan(pricea);
//        return products;
//    }
//
//    @Override
//    public List<Product> findByPriceGreaterThan(Float priceb) {
//        List<Product> products = productRepository.findByPriceGreaterThan(priceb);
//        return products;
//    }
//
//    @Override
//    public void save(CreateProductForm form) {
//
//        String name = form.getName();
//        String image = form.getImage();
//        String description = form.getDescription();
//        String brand = form.getBrand();
////        Integer categoryId = form.getCategoryId();
//        String category = form.getCategory();
//        Float price = form.getPrice();
//        Integer countInStock =form.getCountInStock();
//        Float rating = form.getRating();
//        Integer numReviews = form.getNumReviews();
//
//
//        Product product = new Product();
//
//        product.setName(name);
//        product.setImage(image);
//        product.setDescription(description);
//        product.setBrand(brand);
//        product.setPrice(price);
//        product.setCountInStock(countInStock);
//        product.setRating(rating);
//        product.setNumReviews(numReviews);
//
//        product.setCategory(category);
////        Category categories = categoryRepository.getCategoryById(categoryId);
////        product.setCategory(categories);
//        productRepository.save(product);
//    }
//
//    @Override
//    public void update(Integer id, UpdateProductForm form) {
//        Product product = productRepository.getProductById(id);
////        Category category = categoryRepository.getCategoryById(form.getCategoryId());
//
//        product.setName(form.getName());
//        product.setImage(form.getImage());
//        product.setDescription(form.getDescription());
//        product.setBrand(form.getBrand());
////        product.setCategory(category);
//        product.setCategory(form.getCategory());
//        product.setPrice(form.getPrice());
//        product.setCountInStock(form.getCountInStock());
//        product.setRating(form.getRating());
//        product.setNumReviews(form.getNumReviews());
//
//        productRepository.save(product);
//    }
//
//    @Override
//    @Transactional
//    public void deleteById(Integer id) {
//        productRepository.deleteById(id);
//
//    }
//
//    @Override
//    public List<Product> getProductDESC() {
//        List<Product> products = productRepository.getProductDESC();
//        return products;
//    }
//
//
//}
