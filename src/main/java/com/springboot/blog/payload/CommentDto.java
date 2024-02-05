package com.springboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {
    private long id;
    //name should not be null or Empty
    @NotEmpty(message = "Name should not be null or Empty")
    private String name;
    //email should not be null or empty
    //email field validation
    @NotEmpty(message = "Email should not be null or Empty")
    @Email
    private String email;
    //body should not be null or empty
    //body should have at least 10 character
    @NotEmpty
    @Size(min = 10, message = "Comment body should have atleast 10 characters")
    private String body;
}
