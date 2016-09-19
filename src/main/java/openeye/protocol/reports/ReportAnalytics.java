package openeye.protocol.reports;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Set;
import openeye.protocol.FileSignature;

public class ReportAnalytics extends ReportEnvironment {
	public static final String TYPE = "analytics";

	@Override
	public String getType() {
		return TYPE;
	}

	@SerializedName("signatures")
	public List<FileSignature> signatures = ImmutableList.of();

	/**
	 * @deprecated Due to bug in versions < 0.8. Use {@link #installedSignatures}
	 */
	@Deprecated
	@SerializedName("addedSignatures")
	public Set<String> addedSignatures = ImmutableSet.of();

	/**
	 * @deprecated Due to bug in versions < 0.8. Use {@link #uninstalledSignatures}
	 */
	@Deprecated
	@SerializedName("removedSignatures")
	public Set<String> removedSignatures = ImmutableSet.of();

	@SerializedName("installedSignatures")
	public Set<String> installedSignatures = ImmutableSet.of();

	@SerializedName("uninstalledSignatures")
	public Set<String> uninstalledSignatures = ImmutableSet.of();

	@SerializedName("workTime")
	public float workTime;

	@SerializedName("language")
	public String language;

	@SerializedName("locale")
	public String locale;

	@SerializedName("timezone")
	public String timezone;
}
