package com.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.misc.NotNull;

import com.blog.entities.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
//@Getter
@Setter
@Getter
public class UserDto {
	
	private int id;
	
	@NotEmpty
	@Size(min = 4, message = "User must have 4 chars name")
	private String name;
	
	@Email(message="Please enter valid email")
	private String email;
	
	@NotEmpty
	@Size(min = 3,max = 10, message="Passwrod length should be in between 3 and 10 inclusive")
	private String password;
	
	@NotEmpty
	private String about;

	private Set<RoleDto> roles = new HashSet<>();
}
