package com.learnsystem.entities;

public enum ResourceType {

	LESSON_ONLY(1), LESSON_TASK(2), FORUM(3), EXTERNAL_LINK(4);

	ResourceType(int i) {
	}

	public int getResourceType() {
		return ordinal() + 1;
	}
}
