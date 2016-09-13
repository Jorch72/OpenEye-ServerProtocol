package openeye.protocol.reports;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ReportFileContents implements IReport {
	public static final String TYPE = "file_contents";

	@Override
	public String getType() {
		return TYPE;
	}

	@SerializedName("signature")
	public String signature;

	public static class ArchiveEntry {
		@SerializedName("filename")
		public String filename;

		@SerializedName("comment")
		public String comment;

		@SerializedName("timestamp")
		public long timestamp;
	}

	public static class ArchiveFileEntry extends ArchiveEntry {
		@SerializedName("crc")
		public String crc;

		@SerializedName("signature")
		public String signature;

		@SerializedName("size")
		public long size;

	}

	public static class ArchiveDirEntry extends ArchiveEntry {}

	@SerializedName("files")
	public List<ArchiveFileEntry> files;

	@SerializedName("dirs")
	public List<ArchiveDirEntry> dirs;
}
