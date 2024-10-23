package com.blog_app.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Data
public class UserDto {
	
	private int id;
	@NotBlank(message = "Name is Empty!!")
	@Size(min = 4, message = "Minimun name size should be 4 character!!")
	private String name;
	@Email(message = "Wrong Email!!")
	private String email;
	@NotBlank(message = "Passord is Empty!!")
	@Size(min=4, max = 10, message="Password size 4 to 10 character")
	private String password;
	@NotBlank(message = "Write Something in about Section!!")
	private String about;

}
