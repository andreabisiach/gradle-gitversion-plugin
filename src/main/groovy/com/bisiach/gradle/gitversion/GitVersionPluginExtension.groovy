package com.bisiach.gradle.gitversion;

import groovy.json.JsonSlurper;

class GitVersionPluginExtension {
	public final int Major
	public final int Minor
	public final int Patch
	public final String PreReleaseTag
	public final String PreReleaseTagWithDash
	public final String PreReleaseLabel
	public final int PreReleaseNumber
	public final String BuildMetaData
	public final String BuildMetaDataPadded
	public final String FullBuildMetaData
	public final String MajorMinorPatch
	public final String SemVer
	public final String LegacySemVer
	public final String LegacySemVerPadded
	public final String AssemblySemVer
	public final String AssemblySemFileVer
	public final String FullSemVer
	public final String InformationalVersion
	public final String BranchName
	public final String Sha
	public final String ShortSha
	public final String NuGetVersionV2
	public final String NuGetVersion
	public final String NuGetPreReleaseTagV2
	public final String NuGetPreReleaseTag
	public final int CommitsSinceVersionSource
	public final String CommitsSinceVersionSourcePadded
	public final String CommitDate

	GitVersionPluginExtension(Object json) {
		Major = json.Major
		Minor = json.Minor
		Patch = json.Patch
		PreReleaseTag = json.PreReleaseTag
		PreReleaseTagWithDash = json.PreReleaseTagWithDash
		PreReleaseLabel = json.PreReleaseLabel

		
		if (json.PreReleaseNumber instanceof java.lang.Integer) {
			PreReleaseNumber = json.PreReleaseNumber
		}

		BuildMetaData = json.BuildMetaData
		BuildMetaDataPadded = json.BuildMetaDataPadded
		FullBuildMetaData = json.FullBuildMetaData
		MajorMinorPatch = json.MajorMinorPatch
		SemVer = json.SemVer
		LegacySemVer = json.LegacySemVer
		LegacySemVerPadded = json.LegacySemVerPadded
		AssemblySemVer = json.AssemblySemVer
		AssemblySemFileVer = json.AssemblySemFileVer
		FullSemVer = json.FullSemVer
		InformationalVersion = json.InformationalVersion
		BranchName = json.BranchName
		Sha = json.Sha
		ShortSha = json.ShortSha
		NuGetVersionV2 = json.NuGetVersionV2
		NuGetVersion = json.NuGetVersion
		NuGetPreReleaseTagV2 = json.NuGetPreReleaseTagV2
		NuGetPreReleaseTag = json.NuGetPreReleaseTag
		CommitsSinceVersionSource = json.CommitsSinceVersionSource
		CommitsSinceVersionSourcePadded = json.CommitsSinceVersionSourcePadded
		CommitDate = json.CommitDate
	}
}