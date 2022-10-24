package com.example.demo.service.comment;

import com.example.demo.model.Comment;
import com.example.demo.model.Products;
import com.example.demo.service.IService;

public interface ICommentService extends IService<Comment> {
    Iterable<Comment> findAllByProduct(Products products);
    Integer countAllByProduct(Products products);
}
