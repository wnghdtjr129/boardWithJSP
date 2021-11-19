package domain.board;

import java.sql.Timestamp;

public class Board {
	private int id;
	private String title;
	private String content;
	private int readCount;
	private Timestamp createDate;
	private int userId;
	
	public Board(int id, String title, String content, int readCount, Timestamp createDate, int userId) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.readCount = readCount;
		this.createDate = createDate;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}