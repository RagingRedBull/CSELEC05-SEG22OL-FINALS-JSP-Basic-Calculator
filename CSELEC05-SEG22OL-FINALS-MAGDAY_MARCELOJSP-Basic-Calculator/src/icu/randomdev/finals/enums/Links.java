package icu.randomdev.finals.enums;

public enum Links {
	OPERATION_CONTROLLER("/calculate"),
	RESULT_PAGE("/pages/result.jsp"),
	INDEX_PAGE("index.jsp");
	private String url;
	private Links(String url) {
		this.url = url;
	}
	public String getUrl() {
		return url;
	}
}
