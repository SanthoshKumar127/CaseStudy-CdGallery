package com.cd.casestudy.service;

import java.util.List;
import java.util.Optional;

import com.cd.casestudy.model.User;

public interface Validator {

	public void userValidate(String email, String password);
}
