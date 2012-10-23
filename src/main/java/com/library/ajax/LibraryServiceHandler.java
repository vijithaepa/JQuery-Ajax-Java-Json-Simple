package com.library.ajax;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LibraryServiceHandler extends HttpServlet {

	private static final long serialVersionUID = -1740429102030512071L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSONObject packet = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		System.out.println("######### : " + request.getParameter("data"));

		try {
			jsonArray.put(new JSONObject().put("id", 1).put("name", "Branch 01").put("weight", 10));
			jsonArray.put(new JSONObject().put("id", 2).put("name", "Branch 02").put("weight", 11));
			jsonArray.put(new JSONObject().put("id", 3).put("name", "Branch 03").put("weight", 12));
			packet.put("branches", jsonArray);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		response.setContentType("text/plain");

		response.getWriter().print(packet);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSONObject packet = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		System.out.println("######### : " + request.getAttribute("data"));

		try {
			jsonArray.put(new JSONObject().put("id", 1).put("name", "Branch 01").put("weight", 10));
			jsonArray.put(new JSONObject().put("id", 2).put("name", "Branch 02").put("weight", 11));
			jsonArray.put(new JSONObject().put("id", 3).put("name", "Branch 03").put("weight", 12));
			packet.put("branches", jsonArray);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		response.setContentType("text/plain");

		response.getWriter().print(packet);
		System.out.println("################ in POST ");
	}
}
