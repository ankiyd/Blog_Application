package com.springboot.blog.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
@Schema(
        description = "PostDto Model Information"
)
public class PostDto {
    private Long id;
    //post title should not be empty
    //post title should have at least 2 character;
    @Schema(
            description = "Blog Post Title"
    )
    @NotEmpty
    @Size(min = 2, message = "Post title should have atleast 2 characters")
    private String title;

    //post description should not be empty
    //post description should have at least 10 character;
    @Schema(
            description = "Blog Post Description"
    )
    @NotEmpty
    @Size(min = 10, message = "Post description should have atleast 10 characters")
    private String description;

    //post content should not be empty
    @NotEmpty
    @Schema(
            description = "Blog Post Content"
    )
    private String content;
    private Set<CommentDto> comment;
    @Schema(
            description = "Blog Post Category"
    )
    private Long categoryId;
}
