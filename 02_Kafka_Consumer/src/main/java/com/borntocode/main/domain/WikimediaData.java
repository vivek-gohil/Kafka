package com.borntocode.main.domain;

public class WikimediaData {
	private Long id;
	private String wikiEventData;

	public WikimediaData() {
		// TODO Auto-generated constructor stub
	}

	public WikimediaData(Long id, String wikiEventData) {
		super();
		this.id = id;
		this.wikiEventData = wikiEventData;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWikiEventData() {
		return wikiEventData;
	}

	public void setWikiEventData(String wikiEventData) {
		this.wikiEventData = wikiEventData;
	}

	@Override
	public String toString() {
		return "WikimediaData [id=" + id + ", wikiEventData=" + wikiEventData + "]";
	}

}
