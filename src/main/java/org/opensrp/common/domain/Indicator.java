package org.opensrp.common.domain;

import static org.apache.commons.lang.StringUtils.equalsIgnoreCase;

public enum Indicator {
    // FP Indicators
	FP_OCP("OCP"),
	FP_IUD("IUD"),
	FP_MALE_STERILIZATION("MALE_STERILIZATION"),
	FP_FEMALE_STERILIZATION("FEMALE_STERILIZATION"),
	FP_CONDOM("CONDOM"),
	FP_DMPA("DMPA"),
	FP_OCP_ST("OCP_ST"),
	FP_OCP_SC("OCP_SC"),
	FP_OCP_CASTE_OTHERS("OCP_C_OTHERS"),
	FP_TRADITIONAL_METHOD("FP_TRADITIONAL"),
	FP_LAM("LAM"),
	FP_FEMALE_STERILIZATION_APL("FS_APL"),
	FP_FEMALE_STERILIZATION_BPL("FS_BPL"),
	CONDOM_QTY("CONDOM_QTY"),
	
    // ANC Indicators
	ANC("ANC"),
	ANC_BEFORE_12_WEEKS("ANC_LT_12"),
	ANC_AFTER_12_WEEKS("ANC_GT_12"),
	ANC4("ANC4"),
	TT1("TT1"),
	TT2("TT2"),
	TTB("TTB"),
	SUB_TT("SUB_TT"),
	
	MTP_LESS_THAN_12_WEEKS("MTP_LT_12"),
	MTP_GREATER_THAN_12_WEEKS("MTP_GT_12"),
	SPONTANEOUS_ABORTION("SPONTANEOUS_ABORTION"),
	
	MOTHER_MORTALITY("MM"),
	MMA("MMA"),
	MMD("MMD"),
	MMP("MMP"),
	
    // Delivery Outcome Indicators
	LIVE_BIRTH("LIVE_BIRTH"),
	STILL_BIRTH("STILL_BIRTH"),
	DELIVERY("DELIVERY"),
	INSTITUTIONAL_DELIVERY("INSTITUTIONAL_DELIVERY"),
	D_HOM("D_HOM"),
	D_SC("D_SC"),
	D_PHC("D_PHC"),
	D_CHC("D_CHC"),
	D_SDH("D_SDH"),
	D_DH("D_DH"),
	D_PRI("D_PRI"),
	CESAREAN("CESAREAN"),
	CESAREAN_PRIVATE_FACILITY("CESAREAN_PRI"),
	CESAREAN_GOVERNMENT_FACILITY("CESAREAN_GOV"),
	
    // PNC Indicators
	PNC3("PNC3"),
	
    // Child Birth Indicators
	LBW("LBW"),
	BF_POST_BIRTH("BF_POST_BIRTH"),
	WEIGHED_AT_BIRTH("WEIGHED_AT_BIRTH"),
	INFANT_REGISTRATION("INFANT_REG"),
	MALE_LIVE_BIRTH("M_LIVE_BIRTH"),
	FEMALE_LIVE_BIRTH("F_LIVE_BIRTH"),
	
	CHILD_DIARRHEA("CHILD_DIARRHEA"),
	
    // Child Immunization Indicators
	DPT("DPT"),
	PENTAVALENT3_OR_OPV3("PENTAVALENT3_OPV3"),
	DPT_BOOSTER_OR_OPV_BOOSTER("DPTB_OPVB"),
	DPT_BOOSTER2("DPT_BOOSTER_2"),
	HEP("HEP"),
	OPV("OPV"),
	MEASLES("MEASLES"),
	BCG("BCG"),
	PENT1("PENT1"),
	PENT2("PENT2"),
	PENT3("PENT3"),
	MMR("MMR"),
	JE("JE"),
	OPV3("OPV3"),
	OPV_BOOSTER("OPV_BOOSTER"),
	DPT_BOOSTER1("DPT_BOOSTER_1"),
	
    // Vitamin A Indicators
	VIT_A_1("VIT_A_1"),
	VIT_A_1_FOR_FEMALE_CHILD("F_VIT_A_1"),
	VIT_A_1_FOR_MALE_CHILD("M_VIT_A_1"),
	VIT_A_2("VIT_A_2"),
	VIT_A_2_FOR_FEMALE_CHILD("F_VIT_A_2"),
	VIT_A_2_FOR_MALE_CHILD("M_VIT_A_2"),
	VIT_A_5_FOR_FEMALE_CHILD("F_VIT_A_5"),
	VIT_A_5_FOR_MALE_CHILD("M_VIT_A_5"),
	VIT_A_9_FOR_FEMALE_CHILD("F_VIT_A_9"),
	VIT_A_9_FOR_MALE_CHILD("M_VIT_A_9"),
	VIT_A_FOR_FEMALE("F_VIT_A"),
	VIT_A_FOR_MALE("M_VIT_A"),
	
    // Child Mortality Indicators
	NM("NM"),
	LNM("LNM"),
	ENM("ENM"),
	INFANT_MORTALITY("IM"),
	CHILD_MORTALITY_DUE_TO_DIARRHEA("CMD"),
	CHILD_MORTALITY("UFM"),
	
    // Infant Balance
	INFANT_BALANCE_TOTAL("IBT"),
	INFANT_BALANCE_ON_HAND("IB_OH"),
	INFANT_LEFT("INFANT_LEFT"),
	INFANT_BALANCE_TURNING_ONE_YEAR("IB_1Y"),
	INFANT_BALANCE_OA_CHILDREN("IB_OA"),
	INFANT_BALANCE_BALANCE("IB_BAL"),
	INFANT_BALANCE_LESS_THAN_ONE_YEAR("IB_LT_1Y"),
	INFANT_BALANCE_LESS_THAN_FIVE_YEAR("IB_LT_5Y"),
	
    // NRHM Indicators
	NRHM_JSY_REG("NRHM_JSY_REG"),
	NRHM_ANC3("NRHM_ANC3"),
	NRHM_SBA("NRHM_SBA"),
	NRHM_NON_SBA("NRHM_NON_SBA"),
	NRHM_HB_LEVEL("NRHM_HB_LEVEL"),
	NRHM_PNC24("NRHM_PNC24"),
	NRHM_SC_DEL("NRHM_SC_DEL"),
	NRHM_48HRS("NRHM_48HRS"),
	NRHM_PNC_V_2D("NRHM_PNC_V_2D"),
	NRHM_PNC_V_14D("NRHM_PNC_V_14D"),
	NRHM_HYPERTENSION("NRHM_HYPERTENSION"),
	NRHM_LIVE_BIRTH("NRHM_LIVE_BIRTH"),
	NRHM_STILL_BIRTH("NRHM_STILL_BIRTH"),
	NRHM_ANC("NRHM_ANC"),
	NRHM_ANC_LT_12("NRHM_ANC_LT_12"),
	NRHM_TT1("NRHM_TT1"),
	NRHM_SUB_TT("NRHM_SUB_TT"),
	NRHM_BF_POST_BIRTH("NRHM_BF_POST_BIRTH"),
	NRHM_SPONTANEOUS_ABORTION("NRHM_SPONTANEOUS_ABORTION"),
	
    // NRHM Child Immunization Indicators
	NRHM_BCG_1YR("NRHM_BCG_1YR"),
	NRHM_PENT_1_1YR("NRHM_PENT_1_1YR"),
	NRHM_PENT_2_1YR("NRHM_PENT_2_1YR"),
	NRHM_PENT_3_1YR("NRHM_PENT_3_1YR"),
	NRHM_OPV_0_1YR("NRHM_OPV_0_1YR"),
	NRHM_OPV_1_1YR("NRHM_OPV_1_1YR"),
	NRHM_OPV_2_1YR("NRHM_OPV_2_1YR"),
	NRHM_OPV_3_1YR("NRHM_OPV_3_1YR"),
	NRHM_HEPB_0_1YR("NRHM_HEPB_0_1YR"),
	NRHM_MEASLES_1YR("NRHM_MEASLES_1YR"),
	NRHM_MEASLES_BOOSTER_1YR("NRHM_MEASLES_BOOSTER_1YR"),
	NRHM_M_ALL_VAC("NRHM_M_ALL_VAC"),
	NRHM_F_ALL_VAC("NRHM_F_ALL_VAC"),
	NRHM_ALL_VAC("NRHM_ALL_VAC"),
	NRHM_DPT("NRHM_DPT"),
	NRHM_OPV("NRHM_OPV"),
	NRHM_M_ALL_VACC_2Y("NRHM_M_ALL_VACC_2Y"),
	NRHM_F_ALL_VACC_2Y("NRHM_F_ALL_VACC_2Y"),
	NRHM_ALL_VACC_2Y("NRHM_ALL_VACC_2Y"),
	NRHM_MMR("NRHM_MMR"),
	
	NRHM_IMMUNIZATION_DEATH("NRHM_IMMUNIZATION_DEATH"),
	NRHM_VIT_A_1("NRHM_VIT_A_1"),
	NRHM_VIT_A_5_3YR("NRHM_VIT_A_5_3YR"),
	NRHM_VIT_A_9_3YR("NRHM_VIT_A_9_3YR"),
	NRHM_DPTBOOSTER_2_5YR("NRHM_DPTBOOSTER_2_5YR"),
	
    // Economic status indicators
	ANCS_AND_PNCS_WITH_BPL("ANCS_AND_PNCS_WITH_BPL"),
	
    // Family planning Indicators
	NRHM_IUDREM("NRHM_IUDREM"),
	NRHM_OCP_STRIPS("NRHM_OCP_STRIPS"),
	NRHM_CENTCHROMAN_PILLS("NRHM_CENTCHROMAN_PILLS"),
	NRHM_ECP("NRHM_ECP"),
	
    // FP complication Indicators
	NRHM_M_S_COMP("NRHM_M_S_COMP"),
	NRHM_F_S_COMP("NRHM_F_S_COMP"),
	NRHM_S_COMP("NRHM_S_COMP"),
	
    // FP failure Indicators
	NRHM_M_S_FAILURE("NRHM_M_S_FAILURE"),
	NRHM_F_S_FAILURE("NRHM_F_S_FAILURE"),
	NRHM_S_FAILURE("NRHM_S_FAILURE"),
	
    // FP Death Indicators
	NRHM_M_S_DEATH("NRHM_M_S_DEATH"),
	NRHM_F_S_DEATH("NRHM_F_S_DEATH"),
	NRHM_S_DEATH("NRHM_S_DEATH"),
	
	NRHM_IFA_100("NRHM_IFA_100"),
	
    // Child disease Indicators
	NRHM_MEASLES("NRHM_MEASLES"),
	NRHM_DIARRHEA_DEHYDRATION("NRHM_DIARRHEA_DEHYDRATION"),
	NRHM_MALARIA("NRHM_MALARIA"),
	
    // Infant Death Indicators
	NRHM_ID_24HRS("NRHM_ID_24HRS"),
	NRHM_ID_SEPSIS("NRHM_ID_SEPSIS"),
	NRHM_ID_ASPHYXIA("NRHM_ID_ASPHYXIA"),
	NRHM_ID_LBW("NRHM_ID_LBW"),
	NRHM_ID_PNEUMONIA("NRHM_ID_PNEUMONIA"),
	NRHM_ID_DIARRHEA("NRHM_ID_DIARRHEA"),
	NRHM_ID_FEVER_RELATED("NRHM_ID_FEVER_RELATED"),
	NRHM_ID_MEASLES("NRHM_ID_MEASLES"),
	NRHM_ID_OTHERS("NRHM_ID_OTHERS"),
	
    // Maternal Death Indicators
	NRHM_MD_ABORTION("NRHM_MD_ABORTION"),
	NRHM_MD_LABOR("NRHM_MD_LABOR"),
	NRHM_MD_FITS("NRHM_MD_FITS"),
	NRHM_MD_BLEEDING("NRHM_MD_BLEEDING"),
	NRHM_MD_H_FEVER("NRHM_MD_H_FEVER"),
	NRHM_MD_OTHER("NRHM_MD_OTHER");
	
	private String value;
	
	Indicator(String value) {
		this.value = value;
	}
	
	public String value() {
		return value;
	}
	
	public static Indicator from(String name) {
		Indicator[] indicators = values();
		for (Indicator indicator : indicators) {
			if (equalsIgnoreCase(indicator.value(), name)) {
				return indicator;
			}
		}
		return null;
	}
}
