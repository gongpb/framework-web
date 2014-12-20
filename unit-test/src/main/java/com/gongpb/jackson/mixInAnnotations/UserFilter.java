package com.gongpb.jackson.mixInAnnotations;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@JsonIgnoreProperties(value={"NAME"})
public interface UserFilter {

}
