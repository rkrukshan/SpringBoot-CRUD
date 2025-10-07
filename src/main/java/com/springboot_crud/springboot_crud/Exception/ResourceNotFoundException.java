package com.springboot_crud.springboot_crud.Exception;

public class ResourceNotFoundException extends RuntimeException  {

    public ResourceNotFoundException(String message){
        super(message);
    }

}
