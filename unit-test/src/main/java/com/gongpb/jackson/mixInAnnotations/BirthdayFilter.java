package com.gongpb.jackson.mixInAnnotations;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(value={"ID"})
public interface BirthdayFilter {

}
