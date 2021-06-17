package com.example.hoangduymanh.model;

public class BaseReponse<T> {
    public int status = 200;
    public String message = "success";
    public T data;
}
