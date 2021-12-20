package com.showcase.nullability.jetbrains;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("/jb")
@Validated // jetbrain's NotNull won't trigger nullability checker
public class JetBrainController {

	@GetMapping(value = "/{companyId}/{employeeName}.json")
	public Employee companyUser(@PathVariable("companyId") String companyId,
			@NotBlank @PathVariable("employeeName") String employeeName, HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println(("employeeName: " + employeeName == null) ? "null" : employeeName);
		if (companyId == null) {
			response.setStatus(404);
			return new Employee();
		}
		else {
			response.setStatus(200);
			return new Employee(employeeName, 99, "");
		}
	}

}
