package openeye.protocol.reports;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class ReportEnvironment implements IReport {

	@SerializedName("branding")
	public List<String> branding;

	@SerializedName("runtime")
	public Map<String, String> runtime;

	@SerializedName("minecraft")
	public String minecraft;

	@SerializedName("javaVersion")
	public String javaVersion;

	@SerializedName("tags")
	public Set<String> tags;

	@SerializedName("side")
	public String side;

	@SerializedName("obfuscated")
	public boolean obfuscated;

}
