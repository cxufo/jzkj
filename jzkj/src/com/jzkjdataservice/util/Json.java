package com.jzkjdataservice.util;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.jzkjdataservice.domain.JobType;
import com.jzkjdataservice.domain.PJob;
import com.jzkjdataservice.domain.PResume;
import com.jzkjdataservice.domain.Pcomment;
import com.jzkjdataservice.domain.Tip;
import com.jzkjdataservice.service.Pcomments;

public class Json {
	public static String toPResumeJson(List<PResume> list) {
		Gson gson = new GsonBuilder().registerTypeAdapter(PResume.class,
				new JsonSerializer<PResume>() {
					@Override
					public JsonElement serialize(PResume arg0, Type arg1,
							JsonSerializationContext arg2) {
						// TODO Auto-generated method stub
						JsonObject o = new JsonObject();
						if (0 != arg0.getPtjId())
							o.addProperty("ptjId", arg0.getPtjId());
						if (null != arg0.getPerson()
								&& 0 != arg0.getPerson().getpId())
							o.addProperty("pId", arg0.getPerson().getpId());
						if (null != arg0.getName())
							o.addProperty("name", arg0.getName());
						if (null != arg0.getSex())
							o.addProperty("sex", arg0.getSex());
						if (null != arg0.getBirthday())
							o.addProperty("birthday", arg0.getBirthday());
						if (null != arg0.getPtjType())
							o.addProperty("ptjType", arg0.getPtjType());
						if (null != arg0.getWorkPlace())
							o.addProperty("workPlace", arg0.getWorkPlace());
						if (null != arg0.getWage())
							o.addProperty("wage", arg0.getWage());
						if (null != arg0.getEducation())
							o.addProperty("education", arg0.getEducation());
						if (null != arg0.getIntroduction())
							o.addProperty("introduction",
									arg0.getIntroduction());
						if (null != arg0.getLocation())
							o.addProperty("location", arg0.getLocation());
						return o;
					}
				}).create();
		return gson.toJson(list);
	}

	public static String toPResumeJson(PResume p) {
		Gson gson = new GsonBuilder().registerTypeAdapter(PResume.class,
				new JsonSerializer<PResume>() {
					@Override
					public JsonElement serialize(PResume arg0, Type arg1,
							JsonSerializationContext arg2) {
						// TODO Auto-generated method stub
						JsonObject o = new JsonObject();
						if (0 != arg0.getPtjId())
							o.addProperty("ptjId", arg0.getPtjId());
						if (null != arg0.getPerson()
								&& 0 != arg0.getPerson().getpId())
							o.addProperty("pId", arg0.getPerson().getpId());
						if (null != arg0.getName())
							o.addProperty("name", arg0.getName());
						if (null != arg0.getSex())
							o.addProperty("sex", arg0.getSex());
						if (null != arg0.getBirthday())
							o.addProperty("birthday", arg0.getBirthday());
						if (null != arg0.getPtjType())
							o.addProperty("ptjType", arg0.getPtjType());
						if (null != arg0.getWorkPlace())
							o.addProperty("workPlace", arg0.getWorkPlace());
						if (null != arg0.getWage())
							o.addProperty("wage", arg0.getWage());
						if (null != arg0.getEducation())
							o.addProperty("education", arg0.getEducation());
						if (null != arg0.getIntroduction())
							o.addProperty("introduction",
									arg0.getIntroduction());
						if (null != arg0.getLocation())
							o.addProperty("location", arg0.getLocation());
						return o;
					}
				}).create();
		return gson.toJson(p);
	}

	public static String toPAreaJson(List<String> area) {
		Gson gson = new GsonBuilder().registerTypeAdapter(String.class,
				new JsonSerializer<String>() {

					@Override
					public JsonElement serialize(String arg0, Type arg1,
							JsonSerializationContext arg2) {
						// TODO Auto-generated method stub
						JsonObject o = new JsonObject();
						o.addProperty("area", arg0);
						return o;
					}
				}).create();
		return gson.toJson(area);
	}

	public static String toDateJson(List<String> dates) {
		Gson gson = new GsonBuilder().registerTypeAdapter(String.class,
				new JsonSerializer<String>() {

					@Override
					public JsonElement serialize(String arg0, Type arg1,
							JsonSerializationContext arg2) {
						// TODO Auto-generated method stub
						JsonObject o = new JsonObject();
						o.addProperty("date", arg0);
						return o;
					}
				}).create();
		return gson.toJson(dates);
	}

	public static String toSignJson(List<String> signs) {
		Gson gson = new GsonBuilder().registerTypeAdapter(String.class,
				new JsonSerializer<String>() {

					@Override
					public JsonElement serialize(String arg0, Type arg1,
							JsonSerializationContext arg2) {
						// TODO Auto-generated method stub
						JsonObject o = new JsonObject();
						o.addProperty("sign", arg0);
						return o;
					}
				}).create();
		return gson.toJson(signs);
	}

	public static String toJson(List<?> list) {
		Gson gson = new Gson();
		String json = gson.toJson(list);
		return json;
	}

	public static String toJson(Class<?> c) {
		Gson gson = new Gson();
		String json = gson.toJson(c);
		return json;
	}

	public static String toJson(JobType j) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		String json = gson.toJson(j);
		return json;
	}

	public static String toPJobJson(List<PJob> list) {
		// TODO Auto-generated method stub
		Gson gson = new GsonBuilder().registerTypeAdapter(PJob.class,
				new JsonSerializer<PJob>() {
					@Override
					public JsonElement serialize(PJob arg0, Type arg1,
							JsonSerializationContext arg2) {
						// TODO Auto-generated method stub
						JsonObject o = new JsonObject();
						o.addProperty("ptJobId", arg0.getPtJobId());
						if (null != arg0.getCompany()
								&& 0 != arg0.getCompany().getcId())
							o.addProperty("cId", arg0.getCompany().getcId());
						if (null != arg0.getTips()
								&& 0 != arg0.getTips().getTipsId())
							o.addProperty("tipsId", arg0.getTips().getTipsId());
						if (null != arg0.getJobTitle())
							o.addProperty("jobTitle", arg0.getJobTitle());
						if (null != arg0.getPtjType())
							o.addProperty("ptjType", arg0.getPtjType());
						if (0 != arg0.getrCount())
							o.addProperty("rCount", arg0.getrCount());
						if (0 != arg0.getbCount())
							o.addProperty("bCount", arg0.getbCount());
						if (null != arg0.getEducation())
							o.addProperty("education", arg0.getEducation());
						if (null != arg0.getJobExperiense())
							o.addProperty("jobExperiense",
									arg0.getJobExperiense());
						o.addProperty("sex", arg0.getSex());
						if (null != arg0.getAge())
							o.addProperty("age", arg0.getAge());
						if (null != arg0.getWorkPlace())
							o.addProperty("workPlace", arg0.getWorkPlace());
						if (null != arg0.getWorkTime())
							o.addProperty("workTime", arg0.getWorkTime());
						if (null != arg0.getWage())
							o.addProperty("wage", arg0.getWage());
						if (null != arg0.getJobSign())
							o.addProperty("jobSign", arg0.getJobSign());
						if (null != arg0.getMeetTime())
							o.addProperty("meetTime", arg0.getMeetTime());
						if (null != arg0.getMeetPlace())
							o.addProperty("meetPlace", arg0.getMeetPlace());
						if (null != arg0.getDetail())
							o.addProperty("detail", arg0.getDetail());
						if (null != arg0.getPublishTime())
							o.addProperty("publishTime", arg0.getPublishTime());
						if (null != arg0.getState())
							o.addProperty("state", arg0.getState());
						return o;
					}
				}).create();
		return gson.toJson(list);
	}

	public static String toPJobJson(PJob pjob) {
		// TODO Auto-generated method stub
		Gson gson = new GsonBuilder().registerTypeAdapter(PJob.class,
				new JsonSerializer<PJob>() {
					@Override
					public JsonElement serialize(PJob arg0, Type arg1,
							JsonSerializationContext arg2) {
						// TODO Auto-generated method stub
						JsonObject o = new JsonObject();
						o.addProperty("ptJobId", arg0.getPtJobId());
						if (null != arg0.getCompany()
								&& 0 != arg0.getCompany().getcId())
							o.addProperty("cId", arg0.getCompany().getcId());
						if (null != arg0.getTips()
								&& 0 != arg0.getTips().getTipsId())
							o.addProperty("tipsId", arg0.getTips().getTipsId());
						if (null != arg0.getJobTitle())
							o.addProperty("jobTitle", arg0.getJobTitle());
						if (null != arg0.getPtjType())
							o.addProperty("ptjType", arg0.getPtjType());
						if (0 != arg0.getrCount())
							o.addProperty("rCount", arg0.getrCount());
						if (0 != arg0.getbCount())
							o.addProperty("bCount", arg0.getbCount());
						if (null != arg0.getEducation())
							o.addProperty("education", arg0.getEducation());
						if (null != arg0.getJobExperiense())
							o.addProperty("jobExperiense",
									arg0.getJobExperiense());
						o.addProperty("sex", arg0.getSex());
						if (null != arg0.getAge())
							o.addProperty("age", arg0.getAge());
						if (null != arg0.getWorkPlace())
							o.addProperty("workPlace", arg0.getWorkPlace());
						if (null != arg0.getWorkTime())
							o.addProperty("workTime", arg0.getWorkTime());
						if (null != arg0.getWage())
							o.addProperty("wage", arg0.getWage());
						if (null != arg0.getJobSign())
							o.addProperty("jobSign", arg0.getJobSign());
						if (null != arg0.getMeetTime())
							o.addProperty("meetTime", arg0.getMeetTime());
						if (null != arg0.getMeetPlace())
							o.addProperty("meetPlace", arg0.getMeetPlace());
						if (null != arg0.getDetail())
							o.addProperty("detail", arg0.getDetail());
						if (null != arg0.getPublishTime())
							o.addProperty("publishTime", arg0.getPublishTime());
						if (null != arg0.getState())
							o.addProperty("state", arg0.getState());
						return o;
					}
				}).create();
		return gson.toJson(pjob);
	}

	public static String toTipsJson(Tip tips) {
		// TODO Auto-generated method stub
		Gson gson = new GsonBuilder().registerTypeAdapter(Tip.class,
				new JsonSerializer<Tip>() {
					@Override
					public JsonElement serialize(Tip arg0, Type arg1,
							JsonSerializationContext arg2) {
						// TODO Auto-generated method stub
						JsonObject o = new JsonObject();
						o.addProperty("tipsId", arg0.getTipsId());
						if (null != arg0.getPjobs())
							o.addProperty("tipsContent", arg0.getTipsContent());		
						return o;
					}
				}).create();
		return gson.toJson(tips);
	}
	
	
	public static String toTipsJson(List<Tip> tips) {
		// TODO Auto-generated method stub
		Gson gson = new GsonBuilder().registerTypeAdapter(Tip.class,
				new JsonSerializer<Tip>() {
					@Override
					public JsonElement serialize(Tip arg0, Type arg1,
							JsonSerializationContext arg2) {
						// TODO Auto-generated method stub
						JsonObject o = new JsonObject();
						o.addProperty("tipsId", arg0.getTipsId());
						if (null != arg0.getPjobs())
							o.addProperty("tipsContent", arg0.getTipsContent());		
						return o;
					}
				}).create();
		return gson.toJson(tips);
	}

	public static String toPcommentsJson(List<Pcomment> plist){
		Gson gson = new GsonBuilder().registerTypeAdapter(Pcomments.class,
				new JsonSerializer<Pcomment>() {
					@Override
					public JsonElement serialize(Pcomment arg0, Type arg1,
							JsonSerializationContext arg2) {
						// TODO Auto-generated method stub
						JsonObject o = new JsonObject();
						o.addProperty("pcommentId", arg0.getCommentId());
						if (null != arg0.getCompany())
							o.addProperty("cId", arg0.getCompany().getcId());	
						if (0 != arg0.getPersonId())
							o.addProperty("personId", arg0.getPersonId());
						if (null != arg0.getcDate())
							o.addProperty("cDate", arg0.getcDate());
						if (0 != arg0.getScore())
							o.addProperty("score", arg0.getScore());
						if (null != arg0.getContent())
							o.addProperty("score", arg0.getContent());
						return o;
					}
				}).create();
		return gson.toJson(plist);
	}
	
	public static String toPcommentsJson(Pcomment p){
		Gson gson = new GsonBuilder().registerTypeAdapter(Pcomments.class,
				new JsonSerializer<Pcomment>() {
					@Override
					public JsonElement serialize(Pcomment arg0, Type arg1,
							JsonSerializationContext arg2) {
						// TODO Auto-generated method stub
						JsonObject o = new JsonObject();
						o.addProperty("pcommentId", arg0.getCommentId());
						if (null != arg0.getCompany())
							o.addProperty("cId", arg0.getCompany().getcId());	
						if (0 != arg0.getPersonId())
							o.addProperty("personId", arg0.getPersonId());
						if (null != arg0.getcDate())
							o.addProperty("cDate", arg0.getcDate());
						if (0 != arg0.getScore())
							o.addProperty("score", arg0.getScore());
						if (null != arg0.getContent())
							o.addProperty("score", arg0.getContent());
						return o;
					}
				}).create();
		return gson.toJson(p);
	}
}
