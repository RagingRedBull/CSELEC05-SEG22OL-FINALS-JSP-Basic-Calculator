package icu.randomdev.finals.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import icu.randomdev.finals.model.Calculator;

@WebServlet(name = "OperationController",urlPatterns = "/calculate")
public class OperationController extends HttpServlet{
	private static final long serialVersionUID = -5836760794095275840L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Calculator userCalc = new Calculator();
		userCalc.setFirstInput(Double.parseDouble(request.getParameter("firstInput").toString()));
		userCalc.setSecondInput(Double.parseDouble(request.getParameter("secondInput").toString()));
		System.out.println(userCalc.doAddition());
	}
}
