package openeye.protocol.responses;

import com.google.gson.annotations.SerializedName;

public class ResponsePong implements IResponse {
	public static final String TYPE = "pong";

	@Override
	public String getType() {
		return TYPE;
	}

	@SerializedName("payload")
	public String payload;

}
