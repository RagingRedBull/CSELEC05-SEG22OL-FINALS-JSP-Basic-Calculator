package icu.randomdev.finals.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import icu.randomdev.finals.enums.ErrorMessages;
import icu.randomdev.finals.enums.Links;
import icu.randomdev.finals.exceptions.InvalidOptionException;
import icu.randomdev.finals.model.Calculator;

@WebServlet(name = "OperationController", urlPatterns = "/calculate")
public class OperationController extends HttpServlet {
	private static final long serialVersionUID = -5836760794095275840L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Calculator userCalc = new Calculator();
		RequestDispatcher dispatcher = request.getRequestDispatcher(Links.INDEX_PAGE.getUrl());
		/*
		 * Try converting inputs to double data type, if NumberFormatException occurs redirect to index.jsp and print error msg
		 * Also try validating inputs: division by 0 and invalid inputs (OperationCode is out of range).
		 */
		try {
			userCalc.setFirstInput(Double.parseDouble(request.getParameter("firstInput")));
			userCalc.setSecondInput(Double.parseDouble(request.getParameter("secondInput")));
			userCalc.setOperationCode(Integer.parseInt(request.getParameter("operatorSelector")));
			if(userCalc.validateInputs()) {
				request.setAttribute("answer", Double.toString(userCalc.doOperation()));
			}
		} catch (NumberFormatException nfe) {
			// Too lazy to check per input, might as well catch them all
			request.setAttribute("errorMsg", ErrorMessages.INVALID_INPUT.getMsg());
			//nfe.printStackTrace();
		} catch (ArithmeticException | InvalidOptionException inputEx) {
			request.setAttribute("errorMsg", inputEx.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
//			e.printStackTrace();
		} finally {
			//After doing everything, refresh the page aka INDEX.JSP
			dispatcher.forward(request, response);
		}
	}
}
