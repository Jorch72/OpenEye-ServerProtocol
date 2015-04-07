package openeye.protocol.responses;

import com.google.gson.annotations.SerializedName;

public class ResponseModMsg implements IResponse {
	public static final String TYPE = "note";

	@Override
	public String getType() {
		return TYPE;
	}

	@SerializedName("signature")
	public String signature;

	@SerializedName("level")
	public int level;

	@SerializedName("payload")
	public String payload;

	@SerializedName("description")
	public String description;

}
