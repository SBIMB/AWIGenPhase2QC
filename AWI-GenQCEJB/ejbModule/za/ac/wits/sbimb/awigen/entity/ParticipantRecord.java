package za.ac.wits.sbimb.awigen.entity;

import java.util.Date;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Session Bean implementation class ParticipantRecord
 */
@Stateless
@LocalBean
public class ParticipantRecord {

    private String studyId;
	private String siteId;
	private Integer site;
	private String enrolmentDate;
	private String interviewerCode;
	private Date startTime;
	private Boolean dateOfBirthKnown;
	private Double age;
	private Integer sex;
	private String country;
	private Integer homeLanguage;
	private String otherEthnicity;
	private Integer ethnicity;
	private Integer fatherEthnicity;
	private String fatherEthnicityOther;
	private Integer fatherLanguage;
	private String fatherLanguageOther;
	private Integer patGfatherEthnicity;
	private String patGfatherEthnicityOther;
	private Integer patGfatherLanguage;
	private String patGfatherLanguageOther;
	private Integer patGmotherEthnicity;
	private String patGmotherEthnicityOther;
	private Integer patGmotherLanguage;
	private String patGmotherLanguageOther;
	private Integer motherEthnicity;
	private String motherEthnicityOther;
	private Integer motherLanguage;
	private String motherLanguageOther;
	private Integer matGfatherEthnicity;
	private String matGfatherEthnicityOther;
	private Integer matGfatherLanguage;
	private String matGfatherLanguageOther;
	private Integer matGmotherEthnicity;
	private String matGmotherEthnicityOther;
	private Integer matGmotherLanguage;
	private String matGmotherLanguageOther;
	private Boolean siblings;
	private Double numberOfBrothers;
	private Double numberOfSisters;
	private Boolean children;
	private Double numberOfSons;
	private Double numberOfDaughters;
	private Boolean pregnant;
	private Double numberOfPregnancies;
	private Double numberOfLiveBirths;
	private Integer regularPeriods;
	private String lastPeriod;
	private Integer maritalStatus;
	private Integer highestLevelOfEducation;
	private Double yearsHighestEducation;
	private Integer occupation;
	private Double householdSize;
	private Integer person1Sex;
	private Double person1Age;
	private String person1Relationship;
	private Integer person2Sex;
	private Double person2Age;
	private String person2Relationship;
	private Integer person3Sex;
	private Double person3Age;
	private String person3Relationship;
	private Integer person4Sex;
	private Double person4Age;
	private String person4Relationship;
	private Integer person5Sex;
	private Double person5Age;
	private String person5Relationship;
	private Integer person6Sex;
	private Double person6Age;
	private String person6Relationship;
	private Integer person7Sex;
	private Double person7Age;
	private String person7Relationship;
	private Integer person8Sex;
	private Double person8Age;
	private String person8Relationship;
	private Integer person9Sex;
	private Double person9Age;
	private String person9Relationship;
	private Integer person10Sex;
	private Double person10Age;
	private String person10Relationship;
	private Integer person11Sex;
	private Double person11Age;
	private String person11Relationship;
	private Double person12Age;
	private Integer person12Sex;
	private String person12Relationship;
	private Double person13Age;
	private Integer person13Sex;
	private String person13Relationship;
	private Double person14Age;
	private Integer person14Sex;
	private String person14Relationship;
	private Double person15Age;
	private Integer person15Sex;
	private String person15Relationship;
	private Double person16Age;
	private Integer person16Sex;
	private String person16Relationship;
	private Double person17Age;
	private Integer person17Sex;
	private String person17Relationship;
	private Double person18Age;
	private Integer person18Sex;
	private String person18Relationship;
	private Double person19Age;
	private Integer person19Sex;
	private String person19Relationship;
	private Double person20Age;
	private Integer person20Sex;
	private String person20Relationship;
	private Double person21Age;
	private Integer person21Sex;
	private String person21Relationship;
	private Double person22Age;
	private Integer person22Sex;
	private String person22Relationship;
	private Double person23Age;
	private Integer person23Sex;
	private String person23Relationship;
	private Double person24Age;
	private Integer person24Sex;
	private String person24Relationship;
	private Double person25Age;
	private Integer person25Sex;
	private String person25Relationship;
	private Double person26Age;
	private Integer person26Sex;
	private String person26Relationship;
	private Double person27Age;
	private Integer person27Sex;
	private String person27Relationship;
	private Double person28Age;
	private Integer person28Sex;
	private String person28Relationship;
	private Double person29Age;
	private Integer person29Sex;
	private String person29Relationship;
	private Double person30Age;
	private Integer person30Sex;
	private String person30Relationship;
	private Double numberOfRooms;
	private Double numberOfBedrooms;
	private Integer electricity;
	private Integer solarEnergy;
	private Integer powerGenerator;
	private Integer alternativePowerSource;
	private Integer television;
	private Integer radio;
	private Integer motorVehicle;
	private Integer motorcycle;
	private Integer bicycle;
	private Integer refrigerator;
	private Integer washingMachine;
	private Integer sewingMachine;
	private Integer telephone;
	private Integer mobilePhone;
	private Integer microwave;
	private Integer dvdPlayer;
	private Integer satelliteTvOrDstv;
	private Integer computerOrLaptop;
	private Integer internetByComputer;
	private Integer internetByMobilePhone;
	private Integer electricIron;
	private Integer fan;
	private Integer electricOrGasStove;
	private Integer keroseneStove;
	private Integer plateGas;
	private Integer electricPlate;
	private Integer torch;
	private Integer gasLamp;
	private Integer keroseneLampWithGlass;
	private Integer toiletFacilities;
	private Integer portableWater;
	private Integer grindingMill;
	private Integer tableh;
	private Integer sofaSet;
	private Integer wallClock;
	private Integer bed;
	private Integer mattress;
	private Integer blankets;
	private Integer cattle;
	private Integer otherLivestock;
	private Integer poultry;
	private Integer tractor;
	private Integer plough;
	private Integer tobaccoUse;
	private Integer currentSmoker;
	private Integer whatSmokeCigarettes;
	private Integer whatSmokePipe;
	private Integer whatSmokeHandRolled;
	private Integer whatSmokeCigars;
	private Integer whatSmokeECigarettes;
	private Integer smokingFrequence;
	private Integer smokePerDay;
	private Integer ageStartSmoking;
	private Integer yearStopSmoking;
	private Integer smokelessTobaccoUse;
	private Boolean snuffUse;
	private Integer snuffMethodNose;
	private Integer snuffMethodMouth;
	private Integer frequenceOfSnuffUse;
	private Integer frequenceOfSnuffUsePerDay;
	private Boolean chewingTobaccoUse;
	private Integer frequenceOfChewingTobaccoUse;
	private Integer frequenceOfChewingTobaccoUsePerDay;
	private Integer consumeAlcohol;
	private Boolean currentAlcoholConsumer;
	private Integer frequenceOfAlcoholConsumption;
	private String amountOfAlcoholConsumedPerDay;
	private Integer considerAlcoholCutdown;
	private Integer criticisedForDrinking;
	private Integer guiltyForDrinking;
	private Integer hadHangover;
	private Integer drinkingPastYear;
	private Integer alcoholTypeConsumedBeer;
	private Integer alcoholTypeConsumedWine;
	private Integer alcoholTypeConsumedSpirits;
	private Integer alcoholTypeConsumedHomeBrew;
	private Integer alcoholTypeConsumedOther;
	private String specifyAlcoholTypeConsumed;
	private Integer useDrug;
	private Integer breastCancer;
	private Integer cervicalCancer;
	private Integer prostateCancer;
	private Integer asthma;
	private Integer treatmentGenHealth;
	private Integer medication;
	private String listMedication;
	private Integer traditionalMed;
	private Integer obesityMom;
	private Integer HBloodPressureMom;
	private Integer HCholesterolMom;
	private Integer breastCancerMom;
	private Integer cervicalCancerMom;
	private Integer otherCancersMom;
	private Integer asthmaMom;
	private Integer obesityDad;
	private Integer HBloodPressureDad;
	private Integer HCholesterolDad;
	private Integer prostateCancerDad;
	private Integer otherCancersDad;
	private Integer asthmaDad;
	private Double daysFruit;
	private Double fruitServings;
	private Double daysVeg;
	private Double servingsVeg;
	private Double vendorMeals;
	private Double daysBread;
	private Double slicesBread;
	private Double sugardrinks;
	private Double juice;
	private Integer changeDiet;
	private Integer loseWeight;
	private Integer pesticide;
	private Double yearsPesticide;
	private Integer regionPesticide;
	private Integer pesticideType;
	private String pesticideList;
	private Integer malaria;
	private Integer malariaMonth;
	private Integer malariaArea;
	private Integer tb;
	private Integer tb12months;
	private Integer tbDiagnosed;
	private Integer tbTreatment;
	private Integer tbMeds;
	private Integer tbCounselling;
	private Integer tbTraditionalMed;
	private Integer bloodSugar;
	private Integer diabetes;
	private Integer diabetes12months;
	private Integer diabetesTreatment;
	private Integer diabetesTreatCurr;
	private Integer diabetesTreatInsulin;
	private Integer diabetesTreatPills;
	private Integer diabetesTreatDiet;
	private Integer diabetesTreatWeightLoss;
	private Integer diabetesTreatOther;
	private String diabetesMedsSpecify;
	private Integer diabetesTraditional;
	private Integer diabetesHistory;
	private Integer motherDiabetes;
	private Integer fatherDiabetes;
	private Integer brotherDiabetes;
	private Integer brother2Diabetes;
	private Integer brother3Diabetes;
	private Integer brother4Diabetes;
	private Integer sisterDiabetes;
	private Integer sister2Diabetes;
	private Integer sister3Diabetes;
	private Integer sister4Diabetes;
	private Integer sonDiabetes;
	private Integer son2Diabetes;
	private Integer son3Diabetes;
	private Integer son4Diabetes;
	private Integer daughterDiabetes;
	private Integer daughter2Diabetes;
	private Integer daughter3Diabetes;
	private Integer daughter4Diabetes;
	private Integer otherDiabetes;
	private String otherDiabetesSpecify;
	private Integer stroke;
	private Double strokeDiagnosed;
	private Integer transientIschemicAttack;
	private Integer weakness;
	private Integer numbness;
	private Integer blindness;
	private Integer halfVisionLoss;
	private Integer understandingLoss;
	private Integer expressionLoss;
	private Integer bpMeasure;
	private Integer hypertension;
	private Integer hypertension12monthsYn;
	private Integer hypertensionTreatmentYn;
	private Integer hypertensionMedsYn;
	private String hypertensionMeds;
	private Integer hypertensionTraditional;
	private Integer angina;
	private Integer anginaTreatmentYn;
	private Integer anginaTreatNow;
	private String anginaMeds;
	private Integer anginaTraditional;
	private Integer pain;
	private Integer pain2;
	private Integer painActionStopOrSlow;
	private Integer painActionRest;
	private Integer painActionMedicine;
	private Integer painActionCarryOn;
	private Integer reliefStandstill;
	private Integer painLocation1;
	private Integer painLocation2;
	private Integer painLocation3;
	private Integer painLocation4;
	private Integer painLocation5;
	private Integer painLocation6;
	private Integer painLocation7;
	private Integer painLocation8;
	private Integer painLocation9;
	private Integer painLocation10;
	private Integer painLocation11;
	private Integer painLocation12;
	private Integer painLocation13;
	private Integer painLocation14;
	private Integer painLocation15;
	private Integer painLocation16;
	private Integer painLocation17;
	private Integer painLocation18;
	private Integer heartattack;
	private Integer heartattackTreatment;
	private Integer heartattackTraditional;
	private Integer congestiveHeartFailure;
	private Integer chfTreatmentYn;
	private Integer chfTreatNow;
	private String chfMeds;
	private Integer chfTraditional;
	private Integer cholesterol;
	private Integer HCholesterol;
	private Integer cholesterolTreatment;
	private Integer cholesterolMedsSpecialDiet;
	private Integer cholesterolMedsWeightLoss;
	private Integer cholesterolMedsMedicine;
	private Integer cholesterolMedsOther;
	private Integer cholesterolTraditional;
	private Integer thyroid;
	private Integer thyroidType;
	private String thryroidSpecify;
	private Integer thyroidTreatmentYn;
	private Integer thyroidTreatmentHormone;
	private Integer thyroidTreatmentSurgery;
	private Integer thyroidTreatmentIodine;
	private Integer thyroidTreatmentDrugs;
	private Integer parentsThyroid;
	private Integer specifyThyroidParent;
	private Integer kidneyDisease;
	private Integer knowTypeKidneyDisease;
	private String typeKidneyDisease;
	private Integer lowKidneyFunction;
	private Integer kidneyFamily;
	private Integer familyKidneyMother;
	private Integer familyKidneyFather;
	private Integer familyKidneyOther;
	private String familyKidneyOtherSpecify;
	private Integer kidneyFamilyType;
	private String familyKidneyType;
	private Double workDays;
	private Integer workWeekend;
	private Integer workSedentary;
	private Integer workVigorous;
	private Double workVigorousDays;
	private Double workVigorousHours;
	private Double workVigorousMinutes;
	private Double workVigorousTotal;
	private Integer workModerate;
	private Double workModerateDays;
	private Double workModerateHours;
	private Double workModerateMins;
	private Double workModerateTotal;
	private Double workDayHours;
	private Double workDayMins;
	private Double workDayTotal;
	private Integer transportPhysical;
	private Double transportPhysicalDays;
	private Double transportPhysicalHours;
	private Double transportPhysicalMins;
	private Double transportPhysicalTotal;
	private Integer leisurePhysical;
	private Integer leisureVigorous;
	private Double leisureVigorousDays;
	private Double leisureVigorousHours;
	private Double leisureVigorousMins;
	private Double leisureVigorousTotal;
	private Integer leisureModerate;
	private Double leisureModerateDays;
	private Double leisureModerateHours;
	private Double leisureModerateMins;
	private Double leisureModerateTotal;
	private Double sittingHours;
	private Double sittingWorkHours;
	private Double sittingWorkMins;
	private Double sittingWorkTotal;
	private Double tvWeekHours;
	private Double tvWeekMins;
	private Double tvWeekTotal;
	private Double tvWeekendHours;
	private Double tvWeekendMins;
	private Double tvWeekendTotal;
	private Double pcWeekHours;
	private Double pcWeekMins;
	private Double pcWeekTotal;
	private Double pcWeekendHours;
	private Double pcWeekendMins;
	private Double pcWeekendTotal;
	private Double sitTravelWeekHours;
	private Double sitTravelWeekMins;
	private Double sitTravelWeekTotal;
	private Double sitTravelWeekendHours;
	private Double sitTravelWeekendMins;
	private Double sitTravelWeekendTotal;
	private Double sitSocialWeekHours;
	private Double sitSocialWeekMins;
	private Double sitSocialWeekTotal;
	private Double sitSocialWeekendHours;
	private Double sitSocialWeekendMins;
	private Double sitSocialWeekendTotal;
	private Double hoursRelaxWeek;
	private Double minsRelaxWeek;
	private Double totalRelaxWeek;
	private Double hoursRelaxWeekend;
	private Double minsRelaxWeekend;
	private Double totalRelaxWeekend;
	private Double hoursChurch;
	private Double minsChurch;
	private Double totalChurchWeek;
	private Double hoursChurchWeekend;
	private Double minsChurchWeekend;
	private Double totalChurchWeekend;
	private Date sleepTimeWeek;
	private Date wakeupTimeWeek;
	private Double hoursSleepWeek;
	private Date sleepTimeWeekend;
	private Date wakeupTimeWeekend;
	private Double hoursSleepWeekend;
	private Date endTime;
	private Double standingHeightMm;
	private Float weightKg;
	private Double waistCircumferenceMm;
	private Double hipCircumferenceMm;
	private Double systolic1;
	private Double systolic2;
	private Double systolic3;
	private Float bpSysAvg;
	private Double diastolic1;
	private Double diastolic2;
	private Double diastolic3;
	private Float bpDiaAvg;
	private Date timeBp;
	private Double pulse1;
	private Double pulse2;
	private Double pulse3;
	private Float pulseAvg;
	private String collectorMeasurements;
	private String notesAnthropometry;
	private Integer ultrasound;
	private Float visceralFat;
	private Float subcutaneousFat;
	private String ultrasoundOperator;
	private String dateUltrasoundTaken;
	private Integer cimt;
	private Float minCimtRight;
	private Float maxCimtRight;
	private Float meanCimtRight;
	private Float minCimtLeft;
	private Float maxCimtLeft;
	private Float meanCimtLeft;
	private String ultrasoundNotes;
	private Integer fasting;
	private Date timeAte;
	private Integer fastingConfirmation;
	private Integer red;
	private Double noRedTubes;
	private Integer purple;
	private Double noPurpleTubes;
	private Integer grey;
	private Double noGreyTubes;
	private String notesBlood;
	private String phelbotomist;
	private String dateBloodTaken;
	private Date timeBloodTaken;
	private String comments;
	private Integer testedHiv;
	private Integer hivStatus;
	private Integer hivPositive;
	private Integer hivMedication;
	private Integer traditionalMedHiv;
	private Integer agreeHivtest;
	private Integer resultHiv;
	private Integer plasmaBatch;
	private String plasmaBox;
	private Date datePlasmaReceived;
	private Boolean isHaemolysed;
	private String biomarkerNotes;
	private String serumTechName;
	private Double glucose;
	private Double glucose2;
	private Double glucose3;
	private Date dateGlucose;
	private String glucoseComments;
	private Integer serumBatch;
	private String serumBox;
	private Date dateSerumReceived;
	private Boolean isSerumTestable;
	private String serumComments;
	private Double SCreatinine;
	private String plasmaTechName;
	private Double insulin;
	private Double insulin2;
	private Double insulin3;
	private Date dateInsulinTested;
	private String insulinComments;
	private Double hdl;
	private Double hdl2;
	private Double hdl3;
	private Double ldl;
	private Double ldl2;
	private Double ldl3;
	private Double cholesterol1;
	private Double cholesterol2;
	private Double cholesterol3;
	private Double triglycerides;
	private Double triglycerides2;
	private Double triglycerides3;
	private Date dateLipidsTested;
	private String lipidComments;
	private Integer urineBatch;
	private String urineBox;
	private Date dateUrineReceived;
	private String urineTechName;
	private Double urCreatinine;
	private Double urAlbumin;
	private Double acr;
	private Double urProtein;
	private Date dateUrineTested;
	private String urineComments;
	private Integer urineSample;
	private Integer informedConsent;
	private Integer questionnaire;
	private Integer anthropometrics;
	private Integer bloodPressureDone;
	private Integer pulseDone;
	private Integer bloodSamples;
	private Integer abdominalUltrasound;
	private Integer tableCimt;
	private Integer hivTest;
	private Integer urine;
	private String qualityControllerId;
	private Integer reimbursement;
	private String testResultsNotes;
	private Double bmiC;
	private Float fastingGlucose;
	private String dmPresentC;
	private String htnPresentC;
	private Integer mvpaC;
	private Integer mvpaCatC;
	private Float wstHipRC;
	private Integer bmiCatC;
	private Float householdDensityC;
	private Integer hivFinalStatusC;
	private Integer sesC;
	private Integer sesSiteQuintileC;
	private String otherLanguage;
	private Integer numInHouseC;
	private Float peopleToRoomsDensityC;
	private Float peopleToBedroomsDensityC;
	private Integer partnershipStatusC;
	private Integer employmentStatusC;
	private Integer smokingStatusC;
	private Integer alcoholStatusC;
	private Float avgSleepPerNightC;
	private Integer numberOfSiblingsC;
	private Integer numberOfChildrenC;
	private Integer monthsSinceLastPeriodC;
	private String menopausalStatusC;
	private String lastPeriodComments;
	private Integer monthsLastPeriodC;
	private Date dateGlucose2;
	private Double SCreatinine2;
	private Date dateInsulinTested2;
	private Date dateLipidsTested2;
	private Integer allResultsStatus;
	private Integer isComplete;
	private Integer menopauseStatusC;
	private Integer menopauseManual;
	private Integer htnJnc7;

	 /**
     * Default constructor. 
     */
    public ParticipantRecord() {
        // TODO Auto-generated constructor stub
    }
    	
	@Id
	@Column(name = "study_id")
	public String getStudyId() {
		return this.studyId;
	}

	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}

	@Column(name = "site_id")
	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	@Column(name = "site")
	public Integer getSite() {
		return this.site;
	}

	public void setSite(Integer site) {
		this.site = site;
	}

	@Column(name = "enrolment_date")
	public String getEnrolmentDate() {
		return this.enrolmentDate;
	}

	public void setEnrolmentDate(String enrolmentDate) {
		this.enrolmentDate = enrolmentDate;
	}

	@Column(name = "interviewer_code")
	public String getInterviewerCode() {
		return this.interviewerCode;
	}

	public void setInterviewerCode(String interviewerCode) {
		this.interviewerCode = interviewerCode;
	}

	@Column(name = "start_time", length = 15)
	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Column(name = "date_of_birth_known")
	public Boolean getDateOfBirthKnown() {
		return this.dateOfBirthKnown;
	}

	public void setDateOfBirthKnown(Boolean dateOfBirthKnown) {
		this.dateOfBirthKnown = dateOfBirthKnown;
	}

	@Column(name = "age", precision = 17, scale = 17)
	public Double getAge() {
		return this.age;
	}

	public void setAge(Double age) {
		this.age = age;
	}

	@Column(name = "sex")
	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	@Column(name = "country")
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "home_language")
	public Integer getHomeLanguage() {
		return this.homeLanguage;
	}

	public void setHomeLanguage(Integer homeLanguage) {
		this.homeLanguage = homeLanguage;
	}

	@Column(name = "other_ethnicity")
	public String getOtherEthnicity() {
		return this.otherEthnicity;
	}

	public void setOtherEthnicity(String otherEthnicity) {
		this.otherEthnicity = otherEthnicity;
	}

	@Column(name = "ethnicity")
	public Integer getEthnicity() {
		return this.ethnicity;
	}

	public void setEthnicity(Integer ethnicity) {
		this.ethnicity = ethnicity;
	}

	@Column(name = "father_ethnicity")
	public Integer getFatherEthnicity() {
		return this.fatherEthnicity;
	}

	public void setFatherEthnicity(Integer fatherEthnicity) {
		this.fatherEthnicity = fatherEthnicity;
	}

	@Column(name = "father_ethnicity_other")
	public String getFatherEthnicityOther() {
		return this.fatherEthnicityOther;
	}

	public void setFatherEthnicityOther(String fatherEthnicityOther) {
		this.fatherEthnicityOther = fatherEthnicityOther;
	}

	@Column(name = "father_language")
	public Integer getFatherLanguage() {
		return this.fatherLanguage;
	}

	public void setFatherLanguage(Integer fatherLanguage) {
		this.fatherLanguage = fatherLanguage;
	}

	@Column(name = "father_language_other")
	public String getFatherLanguageOther() {
		return this.fatherLanguageOther;
	}

	public void setFatherLanguageOther(String fatherLanguageOther) {
		this.fatherLanguageOther = fatherLanguageOther;
	}

	@Column(name = "pat_gfather_ethnicity")
	public Integer getPatGfatherEthnicity() {
		return this.patGfatherEthnicity;
	}

	public void setPatGfatherEthnicity(Integer patGfatherEthnicity) {
		this.patGfatherEthnicity = patGfatherEthnicity;
	}

	@Column(name = "pat_gfather_ethnicity_other")
	public String getPatGfatherEthnicityOther() {
		return this.patGfatherEthnicityOther;
	}

	public void setPatGfatherEthnicityOther(String patGfatherEthnicityOther) {
		this.patGfatherEthnicityOther = patGfatherEthnicityOther;
	}

	@Column(name = "pat_gfather_language")
	public Integer getPatGfatherLanguage() {
		return this.patGfatherLanguage;
	}

	public void setPatGfatherLanguage(Integer patGfatherLanguage) {
		this.patGfatherLanguage = patGfatherLanguage;
	}

	@Column(name = "pat_gfather_language_other")
	public String getPatGfatherLanguageOther() {
		return this.patGfatherLanguageOther;
	}

	public void setPatGfatherLanguageOther(String patGfatherLanguageOther) {
		this.patGfatherLanguageOther = patGfatherLanguageOther;
	}

	@Column(name = "pat_gmother_ethnicity")
	public Integer getPatGmotherEthnicity() {
		return this.patGmotherEthnicity;
	}

	public void setPatGmotherEthnicity(Integer patGmotherEthnicity) {
		this.patGmotherEthnicity = patGmotherEthnicity;
	}

	@Column(name = "pat_gmother_ethnicity_other")
	public String getPatGmotherEthnicityOther() {
		return this.patGmotherEthnicityOther;
	}

	public void setPatGmotherEthnicityOther(String patGmotherEthnicityOther) {
		this.patGmotherEthnicityOther = patGmotherEthnicityOther;
	}

	@Column(name = "pat_gmother_language")
	public Integer getPatGmotherLanguage() {
		return this.patGmotherLanguage;
	}

	public void setPatGmotherLanguage(Integer patGmotherLanguage) {
		this.patGmotherLanguage = patGmotherLanguage;
	}

	@Column(name = "pat_gmother_language_other")
	public String getPatGmotherLanguageOther() {
		return this.patGmotherLanguageOther;
	}

	public void setPatGmotherLanguageOther(String patGmotherLanguageOther) {
		this.patGmotherLanguageOther = patGmotherLanguageOther;
	}

	@Column(name = "mother_ethnicity")
	public Integer getMotherEthnicity() {
		return this.motherEthnicity;
	}

	public void setMotherEthnicity(Integer motherEthnicity) {
		this.motherEthnicity = motherEthnicity;
	}

	@Column(name = "mother_ethnicity_other")
	public String getMotherEthnicityOther() {
		return this.motherEthnicityOther;
	}

	public void setMotherEthnicityOther(String motherEthnicityOther) {
		this.motherEthnicityOther = motherEthnicityOther;
	}

	@Column(name = "mother_language")
	public Integer getMotherLanguage() {
		return this.motherLanguage;
	}

	public void setMotherLanguage(Integer motherLanguage) {
		this.motherLanguage = motherLanguage;
	}

	@Column(name = "mother_language_other")
	public String getMotherLanguageOther() {
		return this.motherLanguageOther;
	}

	public void setMotherLanguageOther(String motherLanguageOther) {
		this.motherLanguageOther = motherLanguageOther;
	}

	@Column(name = "mat_gfather_ethnicity")
	public Integer getMatGfatherEthnicity() {
		return this.matGfatherEthnicity;
	}

	public void setMatGfatherEthnicity(Integer matGfatherEthnicity) {
		this.matGfatherEthnicity = matGfatherEthnicity;
	}

	@Column(name = "mat_gfather_ethnicity_other")
	public String getMatGfatherEthnicityOther() {
		return this.matGfatherEthnicityOther;
	}

	public void setMatGfatherEthnicityOther(String matGfatherEthnicityOther) {
		this.matGfatherEthnicityOther = matGfatherEthnicityOther;
	}

	@Column(name = "mat_gfather_language")
	public Integer getMatGfatherLanguage() {
		return this.matGfatherLanguage;
	}

	public void setMatGfatherLanguage(Integer matGfatherLanguage) {
		this.matGfatherLanguage = matGfatherLanguage;
	}

	@Column(name = "mat_gfather_language_other")
	public String getMatGfatherLanguageOther() {
		return this.matGfatherLanguageOther;
	}

	public void setMatGfatherLanguageOther(String matGfatherLanguageOther) {
		this.matGfatherLanguageOther = matGfatherLanguageOther;
	}

	@Column(name = "mat_gmother_ethnicity")
	public Integer getMatGmotherEthnicity() {
		return this.matGmotherEthnicity;
	}

	public void setMatGmotherEthnicity(Integer matGmotherEthnicity) {
		this.matGmotherEthnicity = matGmotherEthnicity;
	}

	@Column(name = "mat_gmother_ethnicity_other")
	public String getMatGmotherEthnicityOther() {
		return this.matGmotherEthnicityOther;
	}

	public void setMatGmotherEthnicityOther(String matGmotherEthnicityOther) {
		this.matGmotherEthnicityOther = matGmotherEthnicityOther;
	}

	@Column(name = "mat_gmother_language")
	public Integer getMatGmotherLanguage() {
		return this.matGmotherLanguage;
	}

	public void setMatGmotherLanguage(Integer matGmotherLanguage) {
		this.matGmotherLanguage = matGmotherLanguage;
	}

	@Column(name = "mat_gmother_language_other")
	public String getMatGmotherLanguageOther() {
		return this.matGmotherLanguageOther;
	}

	public void setMatGmotherLanguageOther(String matGmotherLanguageOther) {
		this.matGmotherLanguageOther = matGmotherLanguageOther;
	}

	@Column(name = "siblings")
	public Boolean getSiblings() {
		return this.siblings;
	}

	public void setSiblings(Boolean siblings) {
		this.siblings = siblings;
	}

	@Column(name = "number_of_brothers", precision = 17, scale = 17)
	public Double getNumberOfBrothers() {
		return this.numberOfBrothers;
	}

	public void setNumberOfBrothers(Double numberOfBrothers) {
		this.numberOfBrothers = numberOfBrothers;
	}

	@Column(name = "number_of_sisters", precision = 17, scale = 17)
	public Double getNumberOfSisters() {
		return this.numberOfSisters;
	}

	public void setNumberOfSisters(Double numberOfSisters) {
		this.numberOfSisters = numberOfSisters;
	}

	@Column(name = "children")
	public Boolean getChildren() {
		return this.children;
	}

	public void setChildren(Boolean children) {
		this.children = children;
	}

	@Column(name = "number_of_sons", precision = 17, scale = 17)
	public Double getNumberOfSons() {
		return this.numberOfSons;
	}

	public void setNumberOfSons(Double numberOfSons) {
		this.numberOfSons = numberOfSons;
	}

	@Column(name = "number_of_daughters", precision = 17, scale = 17)
	public Double getNumberOfDaughters() {
		return this.numberOfDaughters;
	}

	public void setNumberOfDaughters(Double numberOfDaughters) {
		this.numberOfDaughters = numberOfDaughters;
	}

	@Column(name = "pregnant")
	public Boolean getPregnant() {
		return this.pregnant;
	}

	public void setPregnant(Boolean pregnant) {
		this.pregnant = pregnant;
	}

	@Column(name = "number_of_pregnancies", precision = 17, scale = 17)
	public Double getNumberOfPregnancies() {
		return this.numberOfPregnancies;
	}

	public void setNumberOfPregnancies(Double numberOfPregnancies) {
		this.numberOfPregnancies = numberOfPregnancies;
	}

	@Column(name = "number_of_live_births", precision = 17, scale = 17)
	public Double getNumberOfLiveBirths() {
		return this.numberOfLiveBirths;
	}

	public void setNumberOfLiveBirths(Double numberOfLiveBirths) {
		this.numberOfLiveBirths = numberOfLiveBirths;
	}

	@Column(name = "regular_periods")
	public Integer getRegularPeriods() {
		return this.regularPeriods;
	}

	public void setRegularPeriods(Integer regularPeriods) {
		this.regularPeriods = regularPeriods;
	}

	@Column(name = "last_period")
	public String getLastPeriod() {
		return this.lastPeriod;
	}

	public void setLastPeriod(String lastPeriod) {
		this.lastPeriod = lastPeriod;
	}

	@Column(name = "marital_status")
	public Integer getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(Integer maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Column(name = "highest_level_of_education")
	public Integer getHighestLevelOfEducation() {
		return this.highestLevelOfEducation;
	}

	public void setHighestLevelOfEducation(Integer highestLevelOfEducation) {
		this.highestLevelOfEducation = highestLevelOfEducation;
	}

	@Column(name = "years_highest_education", precision = 17, scale = 17)
	public Double getYearsHighestEducation() {
		return this.yearsHighestEducation;
	}

	public void setYearsHighestEducation(Double yearsHighestEducation) {
		this.yearsHighestEducation = yearsHighestEducation;
	}

	@Column(name = "occupation")
	public Integer getOccupation() {
		return this.occupation;
	}

	public void setOccupation(Integer occupation) {
		this.occupation = occupation;
	}

	@Column(name = "household_size", precision = 17, scale = 17)
	public Double getHouseholdSize() {
		return this.householdSize;
	}

	public void setHouseholdSize(Double householdSize) {
		this.householdSize = householdSize;
	}

	@Column(name = "person1_sex")
	public Integer getPerson1Sex() {
		return this.person1Sex;
	}

	public void setPerson1Sex(Integer person1Sex) {
		this.person1Sex = person1Sex;
	}

	@Column(name = "person1_age", precision = 17, scale = 17)
	public Double getPerson1Age() {
		return this.person1Age;
	}

	public void setPerson1Age(Double person1Age) {
		this.person1Age = person1Age;
	}

	@Column(name = "person1_relationship")
	public String getPerson1Relationship() {
		return this.person1Relationship;
	}

	public void setPerson1Relationship(String person1Relationship) {
		this.person1Relationship = person1Relationship;
	}

	@Column(name = "person2_sex")
	public Integer getPerson2Sex() {
		return this.person2Sex;
	}

	public void setPerson2Sex(Integer person2Sex) {
		this.person2Sex = person2Sex;
	}

	@Column(name = "person2_age", precision = 17, scale = 17)
	public Double getPerson2Age() {
		return this.person2Age;
	}

	public void setPerson2Age(Double person2Age) {
		this.person2Age = person2Age;
	}

	@Column(name = "person2_relationship")
	public String getPerson2Relationship() {
		return this.person2Relationship;
	}

	public void setPerson2Relationship(String person2Relationship) {
		this.person2Relationship = person2Relationship;
	}

	@Column(name = "person3_sex")
	public Integer getPerson3Sex() {
		return this.person3Sex;
	}

	public void setPerson3Sex(Integer person3Sex) {
		this.person3Sex = person3Sex;
	}

	@Column(name = "person3_age", precision = 17, scale = 17)
	public Double getPerson3Age() {
		return this.person3Age;
	}

	public void setPerson3Age(Double person3Age) {
		this.person3Age = person3Age;
	}

	@Column(name = "person3_relationship")
	public String getPerson3Relationship() {
		return this.person3Relationship;
	}

	public void setPerson3Relationship(String person3Relationship) {
		this.person3Relationship = person3Relationship;
	}

	@Column(name = "person4_sex")
	public Integer getPerson4Sex() {
		return this.person4Sex;
	}

	public void setPerson4Sex(Integer person4Sex) {
		this.person4Sex = person4Sex;
	}

	@Column(name = "person_4_age", precision = 17, scale = 17)
	public Double getPerson4Age() {
		return this.person4Age;
	}

	public void setPerson4Age(Double person4Age) {
		this.person4Age = person4Age;
	}

	@Column(name = "person4_relationship")
	public String getPerson4Relationship() {
		return this.person4Relationship;
	}

	public void setPerson4Relationship(String person4Relationship) {
		this.person4Relationship = person4Relationship;
	}

	@Column(name = "person5_sex")
	public Integer getPerson5Sex() {
		return this.person5Sex;
	}

	public void setPerson5Sex(Integer person5Sex) {
		this.person5Sex = person5Sex;
	}

	@Column(name = "person5_age", precision = 17, scale = 17)
	public Double getPerson5Age() {
		return this.person5Age;
	}

	public void setPerson5Age(Double person5Age) {
		this.person5Age = person5Age;
	}

	@Column(name = "person5_relationship")
	public String getPerson5Relationship() {
		return this.person5Relationship;
	}

	public void setPerson5Relationship(String person5Relationship) {
		this.person5Relationship = person5Relationship;
	}

	@Column(name = "person6_sex")
	public Integer getPerson6Sex() {
		return this.person6Sex;
	}

	public void setPerson6Sex(Integer person6Sex) {
		this.person6Sex = person6Sex;
	}

	@Column(name = "person6_age", precision = 17, scale = 17)
	public Double getPerson6Age() {
		return this.person6Age;
	}

	public void setPerson6Age(Double person6Age) {
		this.person6Age = person6Age;
	}

	@Column(name = "person6_relationship")
	public String getPerson6Relationship() {
		return this.person6Relationship;
	}

	public void setPerson6Relationship(String person6Relationship) {
		this.person6Relationship = person6Relationship;
	}

	@Column(name = "person7_sex")
	public Integer getPerson7Sex() {
		return this.person7Sex;
	}

	public void setPerson7Sex(Integer person7Sex) {
		this.person7Sex = person7Sex;
	}

	@Column(name = "person7_age", precision = 17, scale = 17)
	public Double getPerson7Age() {
		return this.person7Age;
	}

	public void setPerson7Age(Double person7Age) {
		this.person7Age = person7Age;
	}

	@Column(name = "person7_relationship")
	public String getPerson7Relationship() {
		return this.person7Relationship;
	}

	public void setPerson7Relationship(String person7Relationship) {
		this.person7Relationship = person7Relationship;
	}

	@Column(name = "person8_sex")
	public Integer getPerson8Sex() {
		return this.person8Sex;
	}

	public void setPerson8Sex(Integer person8Sex) {
		this.person8Sex = person8Sex;
	}

	@Column(name = "person8_age", precision = 17, scale = 17)
	public Double getPerson8Age() {
		return this.person8Age;
	}

	public void setPerson8Age(Double person8Age) {
		this.person8Age = person8Age;
	}

	@Column(name = "person8_relationship")
	public String getPerson8Relationship() {
		return this.person8Relationship;
	}

	public void setPerson8Relationship(String person8Relationship) {
		this.person8Relationship = person8Relationship;
	}

	@Column(name = "person9_sex")
	public Integer getPerson9Sex() {
		return this.person9Sex;
	}

	public void setPerson9Sex(Integer person9Sex) {
		this.person9Sex = person9Sex;
	}

	@Column(name = "person9_age", precision = 17, scale = 17)
	public Double getPerson9Age() {
		return this.person9Age;
	}

	public void setPerson9Age(Double person9Age) {
		this.person9Age = person9Age;
	}

	@Column(name = "person9_relationship")
	public String getPerson9Relationship() {
		return this.person9Relationship;
	}

	public void setPerson9Relationship(String person9Relationship) {
		this.person9Relationship = person9Relationship;
	}

	@Column(name = "person10_sex")
	public Integer getPerson10Sex() {
		return this.person10Sex;
	}

	public void setPerson10Sex(Integer person10Sex) {
		this.person10Sex = person10Sex;
	}

	@Column(name = "person10_age", precision = 17, scale = 17)
	public Double getPerson10Age() {
		return this.person10Age;
	}

	public void setPerson10Age(Double person10Age) {
		this.person10Age = person10Age;
	}

	@Column(name = "person10_relationship")
	public String getPerson10Relationship() {
		return this.person10Relationship;
	}

	public void setPerson10Relationship(String person10Relationship) {
		this.person10Relationship = person10Relationship;
	}

	@Column(name = "person11_sex")
	public Integer getPerson11Sex() {
		return this.person11Sex;
	}

	public void setPerson11Sex(Integer person11Sex) {
		this.person11Sex = person11Sex;
	}

	@Column(name = "person11_age", precision = 17, scale = 17)
	public Double getPerson11Age() {
		return this.person11Age;
	}

	public void setPerson11Age(Double person11Age) {
		this.person11Age = person11Age;
	}

	@Column(name = "person11_relationship")
	public String getPerson11Relationship() {
		return this.person11Relationship;
	}

	public void setPerson11Relationship(String person11Relationship) {
		this.person11Relationship = person11Relationship;
	}

	@Column(name = "person12_age", precision = 17, scale = 17)
	public Double getPerson12Age() {
		return this.person12Age;
	}

	public void setPerson12Age(Double person12Age) {
		this.person12Age = person12Age;
	}

	@Column(name = "person12_sex")
	public Integer getPerson12Sex() {
		return this.person12Sex;
	}

	public void setPerson12Sex(Integer person12Sex) {
		this.person12Sex = person12Sex;
	}

	@Column(name = "person12_relationship")
	public String getPerson12Relationship() {
		return this.person12Relationship;
	}

	public void setPerson12Relationship(String person12Relationship) {
		this.person12Relationship = person12Relationship;
	}

	@Column(name = "person13_age", precision = 17, scale = 17)
	public Double getPerson13Age() {
		return this.person13Age;
	}

	public void setPerson13Age(Double person13Age) {
		this.person13Age = person13Age;
	}

	@Column(name = "person13_sex")
	public Integer getPerson13Sex() {
		return this.person13Sex;
	}

	public void setPerson13Sex(Integer person13Sex) {
		this.person13Sex = person13Sex;
	}

	@Column(name = "person13_relationship")
	public String getPerson13Relationship() {
		return this.person13Relationship;
	}

	public void setPerson13Relationship(String person13Relationship) {
		this.person13Relationship = person13Relationship;
	}

	@Column(name = "person14_age", precision = 17, scale = 17)
	public Double getPerson14Age() {
		return this.person14Age;
	}

	public void setPerson14Age(Double person14Age) {
		this.person14Age = person14Age;
	}

	@Column(name = "person14_sex")
	public Integer getPerson14Sex() {
		return this.person14Sex;
	}

	public void setPerson14Sex(Integer person14Sex) {
		this.person14Sex = person14Sex;
	}

	@Column(name = "person14_relationship")
	public String getPerson14Relationship() {
		return this.person14Relationship;
	}

	public void setPerson14Relationship(String person14Relationship) {
		this.person14Relationship = person14Relationship;
	}

	@Column(name = "person15_age", precision = 17, scale = 17)
	public Double getPerson15Age() {
		return this.person15Age;
	}

	public void setPerson15Age(Double person15Age) {
		this.person15Age = person15Age;
	}

	@Column(name = "person15_sex")
	public Integer getPerson15Sex() {
		return this.person15Sex;
	}

	public void setPerson15Sex(Integer person15Sex) {
		this.person15Sex = person15Sex;
	}

	@Column(name = "person15_relationship")
	public String getPerson15Relationship() {
		return this.person15Relationship;
	}

	public void setPerson15Relationship(String person15Relationship) {
		this.person15Relationship = person15Relationship;
	}

	@Column(name = "person16_age", precision = 17, scale = 17)
	public Double getPerson16Age() {
		return this.person16Age;
	}

	public void setPerson16Age(Double person16Age) {
		this.person16Age = person16Age;
	}

	@Column(name = "person16_sex")
	public Integer getPerson16Sex() {
		return this.person16Sex;
	}

	public void setPerson16Sex(Integer person16Sex) {
		this.person16Sex = person16Sex;
	}

	@Column(name = "person16_relationship")
	public String getPerson16Relationship() {
		return this.person16Relationship;
	}

	public void setPerson16Relationship(String person16Relationship) {
		this.person16Relationship = person16Relationship;
	}

	@Column(name = "person17_age", precision = 17, scale = 17)
	public Double getPerson17Age() {
		return this.person17Age;
	}

	public void setPerson17Age(Double person17Age) {
		this.person17Age = person17Age;
	}

	@Column(name = "person17_sex")
	public Integer getPerson17Sex() {
		return this.person17Sex;
	}

	public void setPerson17Sex(Integer person17Sex) {
		this.person17Sex = person17Sex;
	}

	@Column(name = "person17_relationship")
	public String getPerson17Relationship() {
		return this.person17Relationship;
	}

	public void setPerson17Relationship(String person17Relationship) {
		this.person17Relationship = person17Relationship;
	}

	@Column(name = "person18_age", precision = 17, scale = 17)
	public Double getPerson18Age() {
		return this.person18Age;
	}

	public void setPerson18Age(Double person18Age) {
		this.person18Age = person18Age;
	}

	@Column(name = "person18_sex")
	public Integer getPerson18Sex() {
		return this.person18Sex;
	}

	public void setPerson18Sex(Integer person18Sex) {
		this.person18Sex = person18Sex;
	}

	@Column(name = "person18_relationship")
	public String getPerson18Relationship() {
		return this.person18Relationship;
	}

	public void setPerson18Relationship(String person18Relationship) {
		this.person18Relationship = person18Relationship;
	}

	@Column(name = "person19_age", precision = 17, scale = 17)
	public Double getPerson19Age() {
		return this.person19Age;
	}

	public void setPerson19Age(Double person19Age) {
		this.person19Age = person19Age;
	}

	@Column(name = "person19_sex")
	public Integer getPerson19Sex() {
		return this.person19Sex;
	}

	public void setPerson19Sex(Integer person19Sex) {
		this.person19Sex = person19Sex;
	}

	@Column(name = "person19_relationship")
	public String getPerson19Relationship() {
		return this.person19Relationship;
	}

	public void setPerson19Relationship(String person19Relationship) {
		this.person19Relationship = person19Relationship;
	}

	@Column(name = "person20_age", precision = 17, scale = 17)
	public Double getPerson20Age() {
		return this.person20Age;
	}

	public void setPerson20Age(Double person20Age) {
		this.person20Age = person20Age;
	}

	@Column(name = "person20_sex")
	public Integer getPerson20Sex() {
		return this.person20Sex;
	}

	public void setPerson20Sex(Integer person20Sex) {
		this.person20Sex = person20Sex;
	}

	@Column(name = "person20_relationship")
	public String getPerson20Relationship() {
		return this.person20Relationship;
	}

	public void setPerson20Relationship(String person20Relationship) {
		this.person20Relationship = person20Relationship;
	}

	@Column(name = "person21_age", precision = 17, scale = 17)
	public Double getPerson21Age() {
		return this.person21Age;
	}

	public void setPerson21Age(Double person21Age) {
		this.person21Age = person21Age;
	}

	@Column(name = "person21_sex")
	public Integer getPerson21Sex() {
		return this.person21Sex;
	}

	public void setPerson21Sex(Integer person21Sex) {
		this.person21Sex = person21Sex;
	}

	@Column(name = "person21_relationship")
	public String getPerson21Relationship() {
		return this.person21Relationship;
	}

	public void setPerson21Relationship(String person21Relationship) {
		this.person21Relationship = person21Relationship;
	}

	@Column(name = "person22_age", precision = 17, scale = 17)
	public Double getPerson22Age() {
		return this.person22Age;
	}

	public void setPerson22Age(Double person22Age) {
		this.person22Age = person22Age;
	}

	@Column(name = "person22_sex")
	public Integer getPerson22Sex() {
		return this.person22Sex;
	}

	public void setPerson22Sex(Integer person22Sex) {
		this.person22Sex = person22Sex;
	}

	@Column(name = "person22_relationship")
	public String getPerson22Relationship() {
		return this.person22Relationship;
	}

	public void setPerson22Relationship(String person22Relationship) {
		this.person22Relationship = person22Relationship;
	}

	@Column(name = "person23_age", precision = 17, scale = 17)
	public Double getPerson23Age() {
		return this.person23Age;
	}

	public void setPerson23Age(Double person23Age) {
		this.person23Age = person23Age;
	}

	@Column(name = "person23_sex")
	public Integer getPerson23Sex() {
		return this.person23Sex;
	}

	public void setPerson23Sex(Integer person23Sex) {
		this.person23Sex = person23Sex;
	}

	@Column(name = "person23_relationship")
	public String getPerson23Relationship() {
		return this.person23Relationship;
	}

	public void setPerson23Relationship(String person23Relationship) {
		this.person23Relationship = person23Relationship;
	}

	@Column(name = "person24_age", precision = 17, scale = 17)
	public Double getPerson24Age() {
		return this.person24Age;
	}

	public void setPerson24Age(Double person24Age) {
		this.person24Age = person24Age;
	}

	@Column(name = "person24_sex")
	public Integer getPerson24Sex() {
		return this.person24Sex;
	}

	public void setPerson24Sex(Integer person24Sex) {
		this.person24Sex = person24Sex;
	}

	@Column(name = "person24_relationship")
	public String getPerson24Relationship() {
		return this.person24Relationship;
	}

	public void setPerson24Relationship(String person24Relationship) {
		this.person24Relationship = person24Relationship;
	}

	@Column(name = "person25_age", precision = 17, scale = 17)
	public Double getPerson25Age() {
		return this.person25Age;
	}

	public void setPerson25Age(Double person25Age) {
		this.person25Age = person25Age;
	}

	@Column(name = "person25_sex")
	public Integer getPerson25Sex() {
		return this.person25Sex;
	}

	public void setPerson25Sex(Integer person25Sex) {
		this.person25Sex = person25Sex;
	}

	@Column(name = "person25_relationship")
	public String getPerson25Relationship() {
		return this.person25Relationship;
	}

	public void setPerson25Relationship(String person25Relationship) {
		this.person25Relationship = person25Relationship;
	}

	@Column(name = "person26_age", precision = 17, scale = 17)
	public Double getPerson26Age() {
		return this.person26Age;
	}

	public void setPerson26Age(Double person26Age) {
		this.person26Age = person26Age;
	}

	@Column(name = "person26_sex")
	public Integer getPerson26Sex() {
		return this.person26Sex;
	}

	public void setPerson26Sex(Integer person26Sex) {
		this.person26Sex = person26Sex;
	}

	@Column(name = "person26_relationship")
	public String getPerson26Relationship() {
		return this.person26Relationship;
	}

	public void setPerson26Relationship(String person26Relationship) {
		this.person26Relationship = person26Relationship;
	}

	@Column(name = "person27_age", precision = 17, scale = 17)
	public Double getPerson27Age() {
		return this.person27Age;
	}

	public void setPerson27Age(Double person27Age) {
		this.person27Age = person27Age;
	}

	@Column(name = "person27_sex")
	public Integer getPerson27Sex() {
		return this.person27Sex;
	}

	public void setPerson27Sex(Integer person27Sex) {
		this.person27Sex = person27Sex;
	}

	@Column(name = "person27_relationship")
	public String getPerson27Relationship() {
		return this.person27Relationship;
	}

	public void setPerson27Relationship(String person27Relationship) {
		this.person27Relationship = person27Relationship;
	}

	@Column(name = "person28_age", precision = 17, scale = 17)
	public Double getPerson28Age() {
		return this.person28Age;
	}

	public void setPerson28Age(Double person28Age) {
		this.person28Age = person28Age;
	}

	@Column(name = "person28_sex")
	public Integer getPerson28Sex() {
		return this.person28Sex;
	}

	public void setPerson28Sex(Integer person28Sex) {
		this.person28Sex = person28Sex;
	}

	@Column(name = "person28_relationship")
	public String getPerson28Relationship() {
		return this.person28Relationship;
	}

	public void setPerson28Relationship(String person28Relationship) {
		this.person28Relationship = person28Relationship;
	}

	@Column(name = "person29_age", precision = 17, scale = 17)
	public Double getPerson29Age() {
		return this.person29Age;
	}

	public void setPerson29Age(Double person29Age) {
		this.person29Age = person29Age;
	}

	@Column(name = "person29_sex")
	public Integer getPerson29Sex() {
		return this.person29Sex;
	}

	public void setPerson29Sex(Integer person29Sex) {
		this.person29Sex = person29Sex;
	}

	@Column(name = "person29_relationship")
	public String getPerson29Relationship() {
		return this.person29Relationship;
	}

	public void setPerson29Relationship(String person29Relationship) {
		this.person29Relationship = person29Relationship;
	}

	@Column(name = "person30_age", precision = 17, scale = 17)
	public Double getPerson30Age() {
		return this.person30Age;
	}

	public void setPerson30Age(Double person30Age) {
		this.person30Age = person30Age;
	}

	@Column(name = "person30_sex")
	public Integer getPerson30Sex() {
		return this.person30Sex;
	}

	public void setPerson30Sex(Integer person30Sex) {
		this.person30Sex = person30Sex;
	}

	@Column(name = "person30_relationship")
	public String getPerson30Relationship() {
		return this.person30Relationship;
	}

	public void setPerson30Relationship(String person30Relationship) {
		this.person30Relationship = person30Relationship;
	}

	@Column(name = "number_of_rooms", precision = 17, scale = 17)
	public Double getNumberOfRooms() {
		return this.numberOfRooms;
	}

	public void setNumberOfRooms(Double numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	@Column(name = "number_of_bedrooms", precision = 17, scale = 17)
	public Double getNumberOfBedrooms() {
		return this.numberOfBedrooms;
	}

	public void setNumberOfBedrooms(Double numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	@Column(name = "electricity")
	public Integer getElectricity() {
		return this.electricity;
	}

	public void setElectricity(Integer electricity) {
		this.electricity = electricity;
	}

	@Column(name = "solar_energy")
	public Integer getSolarEnergy() {
		return this.solarEnergy;
	}

	public void setSolarEnergy(Integer solarEnergy) {
		this.solarEnergy = solarEnergy;
	}

	@Column(name = "power_generator")
	public Integer getPowerGenerator() {
		return this.powerGenerator;
	}

	public void setPowerGenerator(Integer powerGenerator) {
		this.powerGenerator = powerGenerator;
	}

	@Column(name = "alternative_power_source")
	public Integer getAlternativePowerSource() {
		return this.alternativePowerSource;
	}

	public void setAlternativePowerSource(Integer alternativePowerSource) {
		this.alternativePowerSource = alternativePowerSource;
	}

	@Column(name = "television")
	public Integer getTelevision() {
		return this.television;
	}

	public void setTelevision(Integer television) {
		this.television = television;
	}

	@Column(name = "radio")
	public Integer getRadio() {
		return this.radio;
	}

	public void setRadio(Integer radio) {
		this.radio = radio;
	}

	@Column(name = "motor_vehicle")
	public Integer getMotorVehicle() {
		return this.motorVehicle;
	}

	public void setMotorVehicle(Integer motorVehicle) {
		this.motorVehicle = motorVehicle;
	}

	@Column(name = "motorcycle")
	public Integer getMotorcycle() {
		return this.motorcycle;
	}

	public void setMotorcycle(Integer motorcycle) {
		this.motorcycle = motorcycle;
	}

	@Column(name = "bicycle")
	public Integer getBicycle() {
		return this.bicycle;
	}

	public void setBicycle(Integer bicycle) {
		this.bicycle = bicycle;
	}

	@Column(name = "refrigerator")
	public Integer getRefrigerator() {
		return this.refrigerator;
	}

	public void setRefrigerator(Integer refrigerator) {
		this.refrigerator = refrigerator;
	}

	@Column(name = "washing_machine")
	public Integer getWashingMachine() {
		return this.washingMachine;
	}

	public void setWashingMachine(Integer washingMachine) {
		this.washingMachine = washingMachine;
	}

	@Column(name = "sewing_machine")
	public Integer getSewingMachine() {
		return this.sewingMachine;
	}

	public void setSewingMachine(Integer sewingMachine) {
		this.sewingMachine = sewingMachine;
	}

	@Column(name = "telephone")
	public Integer getTelephone() {
		return this.telephone;
	}

	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}

	@Column(name = "mobile_phone")
	public Integer getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(Integer mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	@Column(name = "microwave")
	public Integer getMicrowave() {
		return this.microwave;
	}

	public void setMicrowave(Integer microwave) {
		this.microwave = microwave;
	}

	@Column(name = "dvd_player")
	public Integer getDvdPlayer() {
		return this.dvdPlayer;
	}

	public void setDvdPlayer(Integer dvdPlayer) {
		this.dvdPlayer = dvdPlayer;
	}

	@Column(name = "satellite_tv_or_dstv")
	public Integer getSatelliteTvOrDstv() {
		return this.satelliteTvOrDstv;
	}

	public void setSatelliteTvOrDstv(Integer satelliteTvOrDstv) {
		this.satelliteTvOrDstv = satelliteTvOrDstv;
	}

	@Column(name = "computer_or_laptop")
	public Integer getComputerOrLaptop() {
		return this.computerOrLaptop;
	}

	public void setComputerOrLaptop(Integer computerOrLaptop) {
		this.computerOrLaptop = computerOrLaptop;
	}

	@Column(name = "internet_by_computer")
	public Integer getInternetByComputer() {
		return this.internetByComputer;
	}

	public void setInternetByComputer(Integer internetByComputer) {
		this.internetByComputer = internetByComputer;
	}

	@Column(name = "internet_by_mobile_phone")
	public Integer getInternetByMobilePhone() {
		return this.internetByMobilePhone;
	}

	public void setInternetByMobilePhone(Integer internetByMobilePhone) {
		this.internetByMobilePhone = internetByMobilePhone;
	}

	@Column(name = "electric_iron")
	public Integer getElectricIron() {
		return this.electricIron;
	}

	public void setElectricIron(Integer electricIron) {
		this.electricIron = electricIron;
	}

	@Column(name = "fan")
	public Integer getFan() {
		return this.fan;
	}

	public void setFan(Integer fan) {
		this.fan = fan;
	}

	@Column(name = "electric_or_gas_stove")
	public Integer getElectricOrGasStove() {
		return this.electricOrGasStove;
	}

	public void setElectricOrGasStove(Integer electricOrGasStove) {
		this.electricOrGasStove = electricOrGasStove;
	}

	@Column(name = "kerosene_stove")
	public Integer getKeroseneStove() {
		return this.keroseneStove;
	}

	public void setKeroseneStove(Integer keroseneStove) {
		this.keroseneStove = keroseneStove;
	}

	@Column(name = "plate_gas")
	public Integer getPlateGas() {
		return this.plateGas;
	}

	public void setPlateGas(Integer plateGas) {
		this.plateGas = plateGas;
	}

	@Column(name = "electric_plate")
	public Integer getElectricPlate() {
		return this.electricPlate;
	}

	public void setElectricPlate(Integer electricPlate) {
		this.electricPlate = electricPlate;
	}

	@Column(name = "torch")
	public Integer getTorch() {
		return this.torch;
	}

	public void setTorch(Integer torch) {
		this.torch = torch;
	}

	@Column(name = "gas_lamp")
	public Integer getGasLamp() {
		return this.gasLamp;
	}

	public void setGasLamp(Integer gasLamp) {
		this.gasLamp = gasLamp;
	}

	@Column(name = "kerosene_lamp_with_glass")
	public Integer getKeroseneLampWithGlass() {
		return this.keroseneLampWithGlass;
	}

	public void setKeroseneLampWithGlass(Integer keroseneLampWithGlass) {
		this.keroseneLampWithGlass = keroseneLampWithGlass;
	}

	@Column(name = "toilet_facilities")
	public Integer getToiletFacilities() {
		return this.toiletFacilities;
	}

	public void setToiletFacilities(Integer toiletFacilities) {
		this.toiletFacilities = toiletFacilities;
	}

	@Column(name = "portable_water")
	public Integer getPortableWater() {
		return this.portableWater;
	}

	public void setPortableWater(Integer portableWater) {
		this.portableWater = portableWater;
	}

	@Column(name = "grinding_mill")
	public Integer getGrindingMill() {
		return this.grindingMill;
	}

	public void setGrindingMill(Integer grindingMill) {
		this.grindingMill = grindingMill;
	}

	@Column(name = "tableh")
	public Integer getTableh() {
		return this.tableh;
	}

	public void setTableh(Integer tableh) {
		this.tableh = tableh;
	}

	@Column(name = "sofa_set")
	public Integer getSofaSet() {
		return this.sofaSet;
	}

	public void setSofaSet(Integer sofaSet) {
		this.sofaSet = sofaSet;
	}

	@Column(name = "wall_clock")
	public Integer getWallClock() {
		return this.wallClock;
	}

	public void setWallClock(Integer wallClock) {
		this.wallClock = wallClock;
	}

	@Column(name = "bed")
	public Integer getBed() {
		return this.bed;
	}

	public void setBed(Integer bed) {
		this.bed = bed;
	}

	@Column(name = "mattress")
	public Integer getMattress() {
		return this.mattress;
	}

	public void setMattress(Integer mattress) {
		this.mattress = mattress;
	}

	@Column(name = "blankets")
	public Integer getBlankets() {
		return this.blankets;
	}

	public void setBlankets(Integer blankets) {
		this.blankets = blankets;
	}

	@Column(name = "cattle")
	public Integer getCattle() {
		return this.cattle;
	}

	public void setCattle(Integer cattle) {
		this.cattle = cattle;
	}

	@Column(name = "other_livestock")
	public Integer getOtherLivestock() {
		return this.otherLivestock;
	}

	public void setOtherLivestock(Integer otherLivestock) {
		this.otherLivestock = otherLivestock;
	}

	@Column(name = "poultry")
	public Integer getPoultry() {
		return this.poultry;
	}

	public void setPoultry(Integer poultry) {
		this.poultry = poultry;
	}

	@Column(name = "tractor")
	public Integer getTractor() {
		return this.tractor;
	}

	public void setTractor(Integer tractor) {
		this.tractor = tractor;
	}

	@Column(name = "plough")
	public Integer getPlough() {
		return this.plough;
	}

	public void setPlough(Integer plough) {
		this.plough = plough;
	}

	@Column(name = "tobacco_use")
	public Integer getTobaccoUse() {
		return this.tobaccoUse;
	}

	public void setTobaccoUse(Integer tobaccoUse) {
		this.tobaccoUse = tobaccoUse;
	}

	@Column(name = "current_smoker")
	public Integer getCurrentSmoker() {
		return this.currentSmoker;
	}

	public void setCurrentSmoker(Integer currentSmoker) {
		this.currentSmoker = currentSmoker;
	}

	@Column(name = "what_smoke_cigarettes")
	public Integer getWhatSmokeCigarettes() {
		return this.whatSmokeCigarettes;
	}

	public void setWhatSmokeCigarettes(Integer whatSmokeCigarettes) {
		this.whatSmokeCigarettes = whatSmokeCigarettes;
	}

	@Column(name = "what_smoke_pipe")
	public Integer getWhatSmokePipe() {
		return this.whatSmokePipe;
	}

	public void setWhatSmokePipe(Integer whatSmokePipe) {
		this.whatSmokePipe = whatSmokePipe;
	}

	@Column(name = "what_smoke_hand_rolled")
	public Integer getWhatSmokeHandRolled() {
		return this.whatSmokeHandRolled;
	}

	public void setWhatSmokeHandRolled(Integer whatSmokeHandRolled) {
		this.whatSmokeHandRolled = whatSmokeHandRolled;
	}

	@Column(name = "what_smoke_cigars")
	public Integer getWhatSmokeCigars() {
		return this.whatSmokeCigars;
	}

	public void setWhatSmokeCigars(Integer whatSmokeCigars) {
		this.whatSmokeCigars = whatSmokeCigars;
	}

	@Column(name = "what_smoke_e_cigarettes")
	public Integer getWhatSmokeECigarettes() {
		return this.whatSmokeECigarettes;
	}

	public void setWhatSmokeECigarettes(Integer whatSmokeECigarettes) {
		this.whatSmokeECigarettes = whatSmokeECigarettes;
	}

	@Column(name = "smoking_frequence")
	public Integer getSmokingFrequence() {
		return this.smokingFrequence;
	}

	public void setSmokingFrequence(Integer smokingFrequence) {
		this.smokingFrequence = smokingFrequence;
	}

	@Column(name = "smoke_per_day")
	public Integer getSmokePerDay() {
		return this.smokePerDay;
	}

	public void setSmokePerDay(Integer smokePerDay) {
		this.smokePerDay = smokePerDay;
	}

	@Column(name = "age_start_smoking")
	public Integer getAgeStartSmoking() {
		return this.ageStartSmoking;
	}

	public void setAgeStartSmoking(Integer ageStartSmoking) {
		this.ageStartSmoking = ageStartSmoking;
	}

	@Column(name = "year_stop_smoking")
	public Integer getYearStopSmoking() {
		return this.yearStopSmoking;
	}

	public void setYearStopSmoking(Integer yearStopSmoking) {
		this.yearStopSmoking = yearStopSmoking;
	}

	@Column(name = "smokeless_tobacco_use")
	public Integer getSmokelessTobaccoUse() {
		return this.smokelessTobaccoUse;
	}

	public void setSmokelessTobaccoUse(Integer smokelessTobaccoUse) {
		this.smokelessTobaccoUse = smokelessTobaccoUse;
	}

	@Column(name = "snuff_use")
	public Boolean getSnuffUse() {
		return this.snuffUse;
	}

	public void setSnuffUse(Boolean snuffUse) {
		this.snuffUse = snuffUse;
	}

	@Column(name = "snuff_method_nose")
	public Integer getSnuffMethodNose() {
		return this.snuffMethodNose;
	}

	public void setSnuffMethodNose(Integer snuffMethodNose) {
		this.snuffMethodNose = snuffMethodNose;
	}

	@Column(name = "snuff_method_mouth")
	public Integer getSnuffMethodMouth() {
		return this.snuffMethodMouth;
	}

	public void setSnuffMethodMouth(Integer snuffMethodMouth) {
		this.snuffMethodMouth = snuffMethodMouth;
	}

	@Column(name = "frequence_of_snuff_use")
	public Integer getFrequenceOfSnuffUse() {
		return this.frequenceOfSnuffUse;
	}

	public void setFrequenceOfSnuffUse(Integer frequenceOfSnuffUse) {
		this.frequenceOfSnuffUse = frequenceOfSnuffUse;
	}

	@Column(name = "frequence_of_snuff_use_per_day")
	public Integer getFrequenceOfSnuffUsePerDay() {
		return this.frequenceOfSnuffUsePerDay;
	}

	public void setFrequenceOfSnuffUsePerDay(Integer frequenceOfSnuffUsePerDay) {
		this.frequenceOfSnuffUsePerDay = frequenceOfSnuffUsePerDay;
	}

	@Column(name = "chewing_tobacco_use")
	public Boolean getChewingTobaccoUse() {
		return this.chewingTobaccoUse;
	}

	public void setChewingTobaccoUse(Boolean chewingTobaccoUse) {
		this.chewingTobaccoUse = chewingTobaccoUse;
	}

	@Column(name = "frequence_of_chewing_tobacco_use")
	public Integer getFrequenceOfChewingTobaccoUse() {
		return this.frequenceOfChewingTobaccoUse;
	}

	public void setFrequenceOfChewingTobaccoUse(
			Integer frequenceOfChewingTobaccoUse) {
		this.frequenceOfChewingTobaccoUse = frequenceOfChewingTobaccoUse;
	}

	@Column(name = "frequence_of_chewing_tobacco_use_per_day")
	public Integer getFrequenceOfChewingTobaccoUsePerDay() {
		return this.frequenceOfChewingTobaccoUsePerDay;
	}

	public void setFrequenceOfChewingTobaccoUsePerDay(
			Integer frequenceOfChewingTobaccoUsePerDay) {
		this.frequenceOfChewingTobaccoUsePerDay = frequenceOfChewingTobaccoUsePerDay;
	}

	@Column(name = "consume_alcohol")
	public Integer getConsumeAlcohol() {
		return this.consumeAlcohol;
	}

	public void setConsumeAlcohol(Integer consumeAlcohol) {
		this.consumeAlcohol = consumeAlcohol;
	}

	@Column(name = "current_alcohol_consumer")
	public Boolean getCurrentAlcoholConsumer() {
		return this.currentAlcoholConsumer;
	}

	public void setCurrentAlcoholConsumer(Boolean currentAlcoholConsumer) {
		this.currentAlcoholConsumer = currentAlcoholConsumer;
	}

	@Column(name = "frequence_of_alcohol_consumption")
	public Integer getFrequenceOfAlcoholConsumption() {
		return this.frequenceOfAlcoholConsumption;
	}

	public void setFrequenceOfAlcoholConsumption(
			Integer frequenceOfAlcoholConsumption) {
		this.frequenceOfAlcoholConsumption = frequenceOfAlcoholConsumption;
	}

	@Column(name = "amount_of_alcohol_consumed_per_day")
	public String getAmountOfAlcoholConsumedPerDay() {
		return this.amountOfAlcoholConsumedPerDay;
	}

	public void setAmountOfAlcoholConsumedPerDay(
			String amountOfAlcoholConsumedPerDay) {
		this.amountOfAlcoholConsumedPerDay = amountOfAlcoholConsumedPerDay;
	}

	@Column(name = "consider_alcohol_cutdown")
	public Integer getConsiderAlcoholCutdown() {
		return this.considerAlcoholCutdown;
	}

	public void setConsiderAlcoholCutdown(Integer considerAlcoholCutdown) {
		this.considerAlcoholCutdown = considerAlcoholCutdown;
	}

	@Column(name = "criticised_for_drinking")
	public Integer getCriticisedForDrinking() {
		return this.criticisedForDrinking;
	}

	public void setCriticisedForDrinking(Integer criticisedForDrinking) {
		this.criticisedForDrinking = criticisedForDrinking;
	}

	@Column(name = "guilty_for_drinking")
	public Integer getGuiltyForDrinking() {
		return this.guiltyForDrinking;
	}

	public void setGuiltyForDrinking(Integer guiltyForDrinking) {
		this.guiltyForDrinking = guiltyForDrinking;
	}

	@Column(name = "had_hangover")
	public Integer getHadHangover() {
		return this.hadHangover;
	}

	public void setHadHangover(Integer hadHangover) {
		this.hadHangover = hadHangover;
	}

	@Column(name = "drinking_past_year")
	public Integer getDrinkingPastYear() {
		return this.drinkingPastYear;
	}

	public void setDrinkingPastYear(Integer drinkingPastYear) {
		this.drinkingPastYear = drinkingPastYear;
	}

	@Column(name = "alcohol_type_consumed_beer")
	public Integer getAlcoholTypeConsumedBeer() {
		return this.alcoholTypeConsumedBeer;
	}

	public void setAlcoholTypeConsumedBeer(Integer alcoholTypeConsumedBeer) {
		this.alcoholTypeConsumedBeer = alcoholTypeConsumedBeer;
	}

	@Column(name = "alcohol_type_consumed_wine")
	public Integer getAlcoholTypeConsumedWine() {
		return this.alcoholTypeConsumedWine;
	}

	public void setAlcoholTypeConsumedWine(Integer alcoholTypeConsumedWine) {
		this.alcoholTypeConsumedWine = alcoholTypeConsumedWine;
	}

	@Column(name = "alcohol_type_consumed_spirits")
	public Integer getAlcoholTypeConsumedSpirits() {
		return this.alcoholTypeConsumedSpirits;
	}

	public void setAlcoholTypeConsumedSpirits(Integer alcoholTypeConsumedSpirits) {
		this.alcoholTypeConsumedSpirits = alcoholTypeConsumedSpirits;
	}

	@Column(name = "alcohol_type_consumed_home_brew")
	public Integer getAlcoholTypeConsumedHomeBrew() {
		return this.alcoholTypeConsumedHomeBrew;
	}

	public void setAlcoholTypeConsumedHomeBrew(
			Integer alcoholTypeConsumedHomeBrew) {
		this.alcoholTypeConsumedHomeBrew = alcoholTypeConsumedHomeBrew;
	}

	@Column(name = "alcohol_type_consumed_other")
	public Integer getAlcoholTypeConsumedOther() {
		return this.alcoholTypeConsumedOther;
	}

	public void setAlcoholTypeConsumedOther(Integer alcoholTypeConsumedOther) {
		this.alcoholTypeConsumedOther = alcoholTypeConsumedOther;
	}

	@Column(name = "specify_alcohol_type_consumed")
	public String getSpecifyAlcoholTypeConsumed() {
		return this.specifyAlcoholTypeConsumed;
	}

	public void setSpecifyAlcoholTypeConsumed(String specifyAlcoholTypeConsumed) {
		this.specifyAlcoholTypeConsumed = specifyAlcoholTypeConsumed;
	}

	@Column(name = "use_drug")
	public Integer getUseDrug() {
		return this.useDrug;
	}

	public void setUseDrug(Integer useDrug) {
		this.useDrug = useDrug;
	}

	@Column(name = "breast_cancer")
	public Integer getBreastCancer() {
		return this.breastCancer;
	}

	public void setBreastCancer(Integer breastCancer) {
		this.breastCancer = breastCancer;
	}

	@Column(name = "cervical_cancer")
	public Integer getCervicalCancer() {
		return this.cervicalCancer;
	}

	public void setCervicalCancer(Integer cervicalCancer) {
		this.cervicalCancer = cervicalCancer;
	}

	@Column(name = "prostate_cancer")
	public Integer getProstateCancer() {
		return this.prostateCancer;
	}

	public void setProstateCancer(Integer prostateCancer) {
		this.prostateCancer = prostateCancer;
	}

	@Column(name = "asthma")
	public Integer getAsthma() {
		return this.asthma;
	}

	public void setAsthma(Integer asthma) {
		this.asthma = asthma;
	}

	@Column(name = "treatment_gen_health")
	public Integer getTreatmentGenHealth() {
		return this.treatmentGenHealth;
	}

	public void setTreatmentGenHealth(Integer treatmentGenHealth) {
		this.treatmentGenHealth = treatmentGenHealth;
	}

	@Column(name = "medication")
	public Integer getMedication() {
		return this.medication;
	}

	public void setMedication(Integer medication) {
		this.medication = medication;
	}

	@Column(name = "list_medication")
	public String getListMedication() {
		return this.listMedication;
	}

	public void setListMedication(String listMedication) {
		this.listMedication = listMedication;
	}

	@Column(name = "traditional_med")
	public Integer getTraditionalMed() {
		return this.traditionalMed;
	}

	public void setTraditionalMed(Integer traditionalMed) {
		this.traditionalMed = traditionalMed;
	}

	@Column(name = "obesity_mom")
	public Integer getObesityMom() {
		return this.obesityMom;
	}

	public void setObesityMom(Integer obesityMom) {
		this.obesityMom = obesityMom;
	}

	@Column(name = "h_blood_pressure_mom")
	public Integer getHBloodPressureMom() {
		return this.HBloodPressureMom;
	}

	public void setHBloodPressureMom(Integer HBloodPressureMom) {
		this.HBloodPressureMom = HBloodPressureMom;
	}

	@Column(name = "h_cholesterol_mom")
	public Integer getHCholesterolMom() {
		return this.HCholesterolMom;
	}

	public void setHCholesterolMom(Integer HCholesterolMom) {
		this.HCholesterolMom = HCholesterolMom;
	}

	@Column(name = "breast_cancer_mom")
	public Integer getBreastCancerMom() {
		return this.breastCancerMom;
	}

	public void setBreastCancerMom(Integer breastCancerMom) {
		this.breastCancerMom = breastCancerMom;
	}

	@Column(name = "cervical_cancer_mom")
	public Integer getCervicalCancerMom() {
		return this.cervicalCancerMom;
	}

	public void setCervicalCancerMom(Integer cervicalCancerMom) {
		this.cervicalCancerMom = cervicalCancerMom;
	}

	@Column(name = "other_cancers_mom")
	public Integer getOtherCancersMom() {
		return this.otherCancersMom;
	}

	public void setOtherCancersMom(Integer otherCancersMom) {
		this.otherCancersMom = otherCancersMom;
	}

	@Column(name = "asthma_mom")
	public Integer getAsthmaMom() {
		return this.asthmaMom;
	}

	public void setAsthmaMom(Integer asthmaMom) {
		this.asthmaMom = asthmaMom;
	}

	@Column(name = "obesity_dad")
	public Integer getObesityDad() {
		return this.obesityDad;
	}

	public void setObesityDad(Integer obesityDad) {
		this.obesityDad = obesityDad;
	}

	@Column(name = "h_blood_pressure_dad")
	public Integer getHBloodPressureDad() {
		return this.HBloodPressureDad;
	}

	public void setHBloodPressureDad(Integer HBloodPressureDad) {
		this.HBloodPressureDad = HBloodPressureDad;
	}

	@Column(name = "h_cholesterol_dad")
	public Integer getHCholesterolDad() {
		return this.HCholesterolDad;
	}

	public void setHCholesterolDad(Integer HCholesterolDad) {
		this.HCholesterolDad = HCholesterolDad;
	}

	@Column(name = "prostate_cancer_dad")
	public Integer getProstateCancerDad() {
		return this.prostateCancerDad;
	}

	public void setProstateCancerDad(Integer prostateCancerDad) {
		this.prostateCancerDad = prostateCancerDad;
	}

	@Column(name = "other_cancers_dad")
	public Integer getOtherCancersDad() {
		return this.otherCancersDad;
	}

	public void setOtherCancersDad(Integer otherCancersDad) {
		this.otherCancersDad = otherCancersDad;
	}

	@Column(name = "asthma_dad")
	public Integer getAsthmaDad() {
		return this.asthmaDad;
	}

	public void setAsthmaDad(Integer asthmaDad) {
		this.asthmaDad = asthmaDad;
	}

	@Column(name = "days_fruit", precision = 17, scale = 17)
	public Double getDaysFruit() {
		return this.daysFruit;
	}

	public void setDaysFruit(Double daysFruit) {
		this.daysFruit = daysFruit;
	}

	@Column(name = "fruit_servings", precision = 17, scale = 17)
	public Double getFruitServings() {
		return this.fruitServings;
	}

	public void setFruitServings(Double fruitServings) {
		this.fruitServings = fruitServings;
	}

	@Column(name = "days_veg", precision = 17, scale = 17)
	public Double getDaysVeg() {
		return this.daysVeg;
	}

	public void setDaysVeg(Double daysVeg) {
		this.daysVeg = daysVeg;
	}

	@Column(name = "servings_veg", precision = 17, scale = 17)
	public Double getServingsVeg() {
		return this.servingsVeg;
	}

	public void setServingsVeg(Double servingsVeg) {
		this.servingsVeg = servingsVeg;
	}

	@Column(name = "vendor_meals", precision = 17, scale = 17)
	public Double getVendorMeals() {
		return this.vendorMeals;
	}

	public void setVendorMeals(Double vendorMeals) {
		this.vendorMeals = vendorMeals;
	}

	@Column(name = "days_bread", precision = 17, scale = 17)
	public Double getDaysBread() {
		return this.daysBread;
	}

	public void setDaysBread(Double daysBread) {
		this.daysBread = daysBread;
	}

	@Column(name = "slices_bread", precision = 17, scale = 17)
	public Double getSlicesBread() {
		return this.slicesBread;
	}

	public void setSlicesBread(Double slicesBread) {
		this.slicesBread = slicesBread;
	}

	@Column(name = "sugardrinks", precision = 17, scale = 17)
	public Double getSugardrinks() {
		return this.sugardrinks;
	}

	public void setSugardrinks(Double sugardrinks) {
		this.sugardrinks = sugardrinks;
	}

	@Column(name = "juice", precision = 17, scale = 17)
	public Double getJuice() {
		return this.juice;
	}

	public void setJuice(Double juice) {
		this.juice = juice;
	}

	@Column(name = "change_diet")
	public Integer getChangeDiet() {
		return this.changeDiet;
	}

	public void setChangeDiet(Integer changeDiet) {
		this.changeDiet = changeDiet;
	}

	@Column(name = "lose_weight")
	public Integer getLoseWeight() {
		return this.loseWeight;
	}

	public void setLoseWeight(Integer loseWeight) {
		this.loseWeight = loseWeight;
	}

	@Column(name = "pesticide")
	public Integer getPesticide() {
		return this.pesticide;
	}

	public void setPesticide(Integer pesticide) {
		this.pesticide = pesticide;
	}

	@Column(name = "years_pesticide", precision = 17, scale = 17)
	public Double getYearsPesticide() {
		return this.yearsPesticide;
	}

	public void setYearsPesticide(Double yearsPesticide) {
		this.yearsPesticide = yearsPesticide;
	}

	@Column(name = "region_pesticide")
	public Integer getRegionPesticide() {
		return this.regionPesticide;
	}

	public void setRegionPesticide(Integer regionPesticide) {
		this.regionPesticide = regionPesticide;
	}

	@Column(name = "pesticide_type")
	public Integer getPesticideType() {
		return this.pesticideType;
	}

	public void setPesticideType(Integer pesticideType) {
		this.pesticideType = pesticideType;
	}

	@Column(name = "pesticide_list")
	public String getPesticideList() {
		return this.pesticideList;
	}

	public void setPesticideList(String pesticideList) {
		this.pesticideList = pesticideList;
	}

	@Column(name = "malaria")
	public Integer getMalaria() {
		return this.malaria;
	}

	public void setMalaria(Integer malaria) {
		this.malaria = malaria;
	}

	@Column(name = "malaria_month")
	public Integer getMalariaMonth() {
		return this.malariaMonth;
	}

	public void setMalariaMonth(Integer malariaMonth) {
		this.malariaMonth = malariaMonth;
	}

	@Column(name = "malaria_area")
	public Integer getMalariaArea() {
		return this.malariaArea;
	}

	public void setMalariaArea(Integer malariaArea) {
		this.malariaArea = malariaArea;
	}

	@Column(name = "tb")
	public Integer getTb() {
		return this.tb;
	}

	public void setTb(Integer tb) {
		this.tb = tb;
	}

	@Column(name = "tb_12months")
	public Integer getTb12months() {
		return this.tb12months;
	}

	public void setTb12months(Integer tb12months) {
		this.tb12months = tb12months;
	}

	@Column(name = "tb_diagnosed")
	public Integer getTbDiagnosed() {
		return this.tbDiagnosed;
	}

	public void setTbDiagnosed(Integer tbDiagnosed) {
		this.tbDiagnosed = tbDiagnosed;
	}

	@Column(name = "tb_treatment")
	public Integer getTbTreatment() {
		return this.tbTreatment;
	}

	public void setTbTreatment(Integer tbTreatment) {
		this.tbTreatment = tbTreatment;
	}

	@Column(name = "tb_meds")
	public Integer getTbMeds() {
		return this.tbMeds;
	}

	public void setTbMeds(Integer tbMeds) {
		this.tbMeds = tbMeds;
	}

	@Column(name = "tb_counselling")
	public Integer getTbCounselling() {
		return this.tbCounselling;
	}

	public void setTbCounselling(Integer tbCounselling) {
		this.tbCounselling = tbCounselling;
	}

	@Column(name = "tb_traditional_med")
	public Integer getTbTraditionalMed() {
		return this.tbTraditionalMed;
	}

	public void setTbTraditionalMed(Integer tbTraditionalMed) {
		this.tbTraditionalMed = tbTraditionalMed;
	}

	@Column(name = "blood_sugar")
	public Integer getBloodSugar() {
		return this.bloodSugar;
	}

	public void setBloodSugar(Integer bloodSugar) {
		this.bloodSugar = bloodSugar;
	}

	@Column(name = "diabetes")
	public Integer getDiabetes() {
		return this.diabetes;
	}

	public void setDiabetes(Integer diabetes) {
		this.diabetes = diabetes;
	}

	@Column(name = "diabetes_12months")
	public Integer getDiabetes12months() {
		return this.diabetes12months;
	}

	public void setDiabetes12months(Integer diabetes12months) {
		this.diabetes12months = diabetes12months;
	}

	@Column(name = "diabetes_treatment")
	public Integer getDiabetesTreatment() {
		return this.diabetesTreatment;
	}

	public void setDiabetesTreatment(Integer diabetesTreatment) {
		this.diabetesTreatment = diabetesTreatment;
	}

	@Column(name = "diabetes_treat_curr")
	public Integer getDiabetesTreatCurr() {
		return this.diabetesTreatCurr;
	}

	public void setDiabetesTreatCurr(Integer diabetesTreatCurr) {
		this.diabetesTreatCurr = diabetesTreatCurr;
	}

	@Column(name = "diabetes_treat_insulin")
	public Integer getDiabetesTreatInsulin() {
		return this.diabetesTreatInsulin;
	}

	public void setDiabetesTreatInsulin(Integer diabetesTreatInsulin) {
		this.diabetesTreatInsulin = diabetesTreatInsulin;
	}

	@Column(name = "diabetes_treat_pills")
	public Integer getDiabetesTreatPills() {
		return this.diabetesTreatPills;
	}

	public void setDiabetesTreatPills(Integer diabetesTreatPills) {
		this.diabetesTreatPills = diabetesTreatPills;
	}

	@Column(name = "diabetes_treat_diet")
	public Integer getDiabetesTreatDiet() {
		return this.diabetesTreatDiet;
	}

	public void setDiabetesTreatDiet(Integer diabetesTreatDiet) {
		this.diabetesTreatDiet = diabetesTreatDiet;
	}

	@Column(name = "diabetes_treat_weight_loss")
	public Integer getDiabetesTreatWeightLoss() {
		return this.diabetesTreatWeightLoss;
	}

	public void setDiabetesTreatWeightLoss(Integer diabetesTreatWeightLoss) {
		this.diabetesTreatWeightLoss = diabetesTreatWeightLoss;
	}

	@Column(name = "diabetes_treat_other")
	public Integer getDiabetesTreatOther() {
		return this.diabetesTreatOther;
	}

	public void setDiabetesTreatOther(Integer diabetesTreatOther) {
		this.diabetesTreatOther = diabetesTreatOther;
	}

	@Column(name = "diabetes_meds_specify")
	public String getDiabetesMedsSpecify() {
		return this.diabetesMedsSpecify;
	}

	public void setDiabetesMedsSpecify(String diabetesMedsSpecify) {
		this.diabetesMedsSpecify = diabetesMedsSpecify;
	}

	@Column(name = "diabetes_traditional")
	public Integer getDiabetesTraditional() {
		return this.diabetesTraditional;
	}

	public void setDiabetesTraditional(Integer diabetesTraditional) {
		this.diabetesTraditional = diabetesTraditional;
	}

	@Column(name = "diabetes_history")
	public Integer getDiabetesHistory() {
		return this.diabetesHistory;
	}

	public void setDiabetesHistory(Integer diabetesHistory) {
		this.diabetesHistory = diabetesHistory;
	}

	@Column(name = "mother_diabetes")
	public Integer getMotherDiabetes() {
		return this.motherDiabetes;
	}

	public void setMotherDiabetes(Integer motherDiabetes) {
		this.motherDiabetes = motherDiabetes;
	}

	@Column(name = "father_diabetes")
	public Integer getFatherDiabetes() {
		return this.fatherDiabetes;
	}

	public void setFatherDiabetes(Integer fatherDiabetes) {
		this.fatherDiabetes = fatherDiabetes;
	}

	@Column(name = "brother_diabetes")
	public Integer getBrotherDiabetes() {
		return this.brotherDiabetes;
	}

	public void setBrotherDiabetes(Integer brotherDiabetes) {
		this.brotherDiabetes = brotherDiabetes;
	}

	@Column(name = "brother_2_diabetes")
	public Integer getBrother2Diabetes() {
		return this.brother2Diabetes;
	}

	public void setBrother2Diabetes(Integer brother2Diabetes) {
		this.brother2Diabetes = brother2Diabetes;
	}

	@Column(name = "brother_3_diabetes")
	public Integer getBrother3Diabetes() {
		return this.brother3Diabetes;
	}

	public void setBrother3Diabetes(Integer brother3Diabetes) {
		this.brother3Diabetes = brother3Diabetes;
	}

	@Column(name = "brother_4_diabetes")
	public Integer getBrother4Diabetes() {
		return this.brother4Diabetes;
	}

	public void setBrother4Diabetes(Integer brother4Diabetes) {
		this.brother4Diabetes = brother4Diabetes;
	}

	@Column(name = "sister_diabetes")
	public Integer getSisterDiabetes() {
		return this.sisterDiabetes;
	}

	public void setSisterDiabetes(Integer sisterDiabetes) {
		this.sisterDiabetes = sisterDiabetes;
	}

	@Column(name = "sister_2_diabetes")
	public Integer getSister2Diabetes() {
		return this.sister2Diabetes;
	}

	public void setSister2Diabetes(Integer sister2Diabetes) {
		this.sister2Diabetes = sister2Diabetes;
	}

	@Column(name = "sister_3_diabetes")
	public Integer getSister3Diabetes() {
		return this.sister3Diabetes;
	}

	public void setSister3Diabetes(Integer sister3Diabetes) {
		this.sister3Diabetes = sister3Diabetes;
	}

	@Column(name = "sister_4_diabetes")
	public Integer getSister4Diabetes() {
		return this.sister4Diabetes;
	}

	public void setSister4Diabetes(Integer sister4Diabetes) {
		this.sister4Diabetes = sister4Diabetes;
	}

	@Column(name = "son_diabetes")
	public Integer getSonDiabetes() {
		return this.sonDiabetes;
	}

	public void setSonDiabetes(Integer sonDiabetes) {
		this.sonDiabetes = sonDiabetes;
	}

	@Column(name = "son_2_diabetes")
	public Integer getSon2Diabetes() {
		return this.son2Diabetes;
	}

	public void setSon2Diabetes(Integer son2Diabetes) {
		this.son2Diabetes = son2Diabetes;
	}

	@Column(name = "son_3_diabetes")
	public Integer getSon3Diabetes() {
		return this.son3Diabetes;
	}

	public void setSon3Diabetes(Integer son3Diabetes) {
		this.son3Diabetes = son3Diabetes;
	}

	@Column(name = "son_4_diabetes")
	public Integer getSon4Diabetes() {
		return this.son4Diabetes;
	}

	public void setSon4Diabetes(Integer son4Diabetes) {
		this.son4Diabetes = son4Diabetes;
	}

	@Column(name = "daughter_diabetes")
	public Integer getDaughterDiabetes() {
		return this.daughterDiabetes;
	}

	public void setDaughterDiabetes(Integer daughterDiabetes) {
		this.daughterDiabetes = daughterDiabetes;
	}

	@Column(name = "daughter_2_diabetes")
	public Integer getDaughter2Diabetes() {
		return this.daughter2Diabetes;
	}

	public void setDaughter2Diabetes(Integer daughter2Diabetes) {
		this.daughter2Diabetes = daughter2Diabetes;
	}

	@Column(name = "daughter_3_diabetes")
	public Integer getDaughter3Diabetes() {
		return this.daughter3Diabetes;
	}

	public void setDaughter3Diabetes(Integer daughter3Diabetes) {
		this.daughter3Diabetes = daughter3Diabetes;
	}

	@Column(name = "daughter_4_diabetes")
	public Integer getDaughter4Diabetes() {
		return this.daughter4Diabetes;
	}

	public void setDaughter4Diabetes(Integer daughter4Diabetes) {
		this.daughter4Diabetes = daughter4Diabetes;
	}

	@Column(name = "other_diabetes")
	public Integer getOtherDiabetes() {
		return this.otherDiabetes;
	}

	public void setOtherDiabetes(Integer otherDiabetes) {
		this.otherDiabetes = otherDiabetes;
	}

	@Column(name = "other_diabetes_specify")
	public String getOtherDiabetesSpecify() {
		return this.otherDiabetesSpecify;
	}

	public void setOtherDiabetesSpecify(String otherDiabetesSpecify) {
		this.otherDiabetesSpecify = otherDiabetesSpecify;
	}

	@Column(name = "stroke")
	public Integer getStroke() {
		return this.stroke;
	}

	public void setStroke(Integer stroke) {
		this.stroke = stroke;
	}

	@Column(name = "stroke_diagnosed", precision = 17, scale = 17)
	public Double getStrokeDiagnosed() {
		return this.strokeDiagnosed;
	}

	public void setStrokeDiagnosed(Double strokeDiagnosed) {
		this.strokeDiagnosed = strokeDiagnosed;
	}

	@Column(name = "transient_ischemic_attack")
	public Integer getTransientIschemicAttack() {
		return this.transientIschemicAttack;
	}

	public void setTransientIschemicAttack(Integer transientIschemicAttack) {
		this.transientIschemicAttack = transientIschemicAttack;
	}

	@Column(name = "weakness")
	public Integer getWeakness() {
		return this.weakness;
	}

	public void setWeakness(Integer weakness) {
		this.weakness = weakness;
	}

	@Column(name = "numbness")
	public Integer getNumbness() {
		return this.numbness;
	}

	public void setNumbness(Integer numbness) {
		this.numbness = numbness;
	}

	@Column(name = "blindness")
	public Integer getBlindness() {
		return this.blindness;
	}

	public void setBlindness(Integer blindness) {
		this.blindness = blindness;
	}

	@Column(name = "half_vision_loss")
	public Integer getHalfVisionLoss() {
		return this.halfVisionLoss;
	}

	public void setHalfVisionLoss(Integer halfVisionLoss) {
		this.halfVisionLoss = halfVisionLoss;
	}

	@Column(name = "understanding_loss")
	public Integer getUnderstandingLoss() {
		return this.understandingLoss;
	}

	public void setUnderstandingLoss(Integer understandingLoss) {
		this.understandingLoss = understandingLoss;
	}

	@Column(name = "expression_loss")
	public Integer getExpressionLoss() {
		return this.expressionLoss;
	}

	public void setExpressionLoss(Integer expressionLoss) {
		this.expressionLoss = expressionLoss;
	}

	@Column(name = "bp_measure")
	public Integer getBpMeasure() {
		return this.bpMeasure;
	}

	public void setBpMeasure(Integer bpMeasure) {
		this.bpMeasure = bpMeasure;
	}

	@Column(name = "hypertension")
	public Integer getHypertension() {
		return this.hypertension;
	}

	public void setHypertension(Integer hypertension) {
		this.hypertension = hypertension;
	}

	@Column(name = "hypertension_12months_yn")
	public Integer getHypertension12monthsYn() {
		return this.hypertension12monthsYn;
	}

	public void setHypertension12monthsYn(Integer hypertension12monthsYn) {
		this.hypertension12monthsYn = hypertension12monthsYn;
	}

	@Column(name = "hypertension_treatment_yn")
	public Integer getHypertensionTreatmentYn() {
		return this.hypertensionTreatmentYn;
	}

	public void setHypertensionTreatmentYn(Integer hypertensionTreatmentYn) {
		this.hypertensionTreatmentYn = hypertensionTreatmentYn;
	}

	@Column(name = "hypertension_meds_yn")
	public Integer getHypertensionMedsYn() {
		return this.hypertensionMedsYn;
	}

	public void setHypertensionMedsYn(Integer hypertensionMedsYn) {
		this.hypertensionMedsYn = hypertensionMedsYn;
	}

	@Column(name = "hypertension_meds")
	public String getHypertensionMeds() {
		return this.hypertensionMeds;
	}

	public void setHypertensionMeds(String hypertensionMeds) {
		this.hypertensionMeds = hypertensionMeds;
	}

	@Column(name = "hypertension_traditional")
	public Integer getHypertensionTraditional() {
		return this.hypertensionTraditional;
	}

	public void setHypertensionTraditional(Integer hypertensionTraditional) {
		this.hypertensionTraditional = hypertensionTraditional;
	}

	@Column(name = "angina")
	public Integer getAngina() {
		return this.angina;
	}

	public void setAngina(Integer angina) {
		this.angina = angina;
	}

	@Column(name = "angina_treatment_yn")
	public Integer getAnginaTreatmentYn() {
		return this.anginaTreatmentYn;
	}

	public void setAnginaTreatmentYn(Integer anginaTreatmentYn) {
		this.anginaTreatmentYn = anginaTreatmentYn;
	}

	@Column(name = "angina_treat_now")
	public Integer getAnginaTreatNow() {
		return this.anginaTreatNow;
	}

	public void setAnginaTreatNow(Integer anginaTreatNow) {
		this.anginaTreatNow = anginaTreatNow;
	}

	@Column(name = "angina_meds")
	public String getAnginaMeds() {
		return this.anginaMeds;
	}

	public void setAnginaMeds(String anginaMeds) {
		this.anginaMeds = anginaMeds;
	}

	@Column(name = "angina_traditional")
	public Integer getAnginaTraditional() {
		return this.anginaTraditional;
	}

	public void setAnginaTraditional(Integer anginaTraditional) {
		this.anginaTraditional = anginaTraditional;
	}

	@Column(name = "pain")
	public Integer getPain() {
		return this.pain;
	}

	public void setPain(Integer pain) {
		this.pain = pain;
	}

	@Column(name = "pain2")
	public Integer getPain2() {
		return this.pain2;
	}

	public void setPain2(Integer pain2) {
		this.pain2 = pain2;
	}

	@Column(name = "pain_action_stop_or_slow")
	public Integer getPainActionStopOrSlow() {
		return this.painActionStopOrSlow;
	}

	public void setPainActionStopOrSlow(Integer painActionStopOrSlow) {
		this.painActionStopOrSlow = painActionStopOrSlow;
	}

	@Column(name = "pain_action_rest")
	public Integer getPainActionRest() {
		return this.painActionRest;
	}

	public void setPainActionRest(Integer painActionRest) {
		this.painActionRest = painActionRest;
	}

	@Column(name = "pain_action_medicine")
	public Integer getPainActionMedicine() {
		return this.painActionMedicine;
	}

	public void setPainActionMedicine(Integer painActionMedicine) {
		this.painActionMedicine = painActionMedicine;
	}

	@Column(name = "pain_action_carry_on")
	public Integer getPainActionCarryOn() {
		return this.painActionCarryOn;
	}

	public void setPainActionCarryOn(Integer painActionCarryOn) {
		this.painActionCarryOn = painActionCarryOn;
	}

	@Column(name = "relief_standstill")
	public Integer getReliefStandstill() {
		return this.reliefStandstill;
	}

	public void setReliefStandstill(Integer reliefStandstill) {
		this.reliefStandstill = reliefStandstill;
	}

	@Column(name = "pain_location_1")
	public Integer getPainLocation1() {
		return this.painLocation1;
	}

	public void setPainLocation1(Integer painLocation1) {
		this.painLocation1 = painLocation1;
	}

	@Column(name = "pain_location_2")
	public Integer getPainLocation2() {
		return this.painLocation2;
	}

	public void setPainLocation2(Integer painLocation2) {
		this.painLocation2 = painLocation2;
	}

	@Column(name = "pain_location_3")
	public Integer getPainLocation3() {
		return this.painLocation3;
	}

	public void setPainLocation3(Integer painLocation3) {
		this.painLocation3 = painLocation3;
	}

	@Column(name = "pain_location_4")
	public Integer getPainLocation4() {
		return this.painLocation4;
	}

	public void setPainLocation4(Integer painLocation4) {
		this.painLocation4 = painLocation4;
	}

	@Column(name = "pain_location_5")
	public Integer getPainLocation5() {
		return this.painLocation5;
	}

	public void setPainLocation5(Integer painLocation5) {
		this.painLocation5 = painLocation5;
	}

	@Column(name = "pain_location_6")
	public Integer getPainLocation6() {
		return this.painLocation6;
	}

	public void setPainLocation6(Integer painLocation6) {
		this.painLocation6 = painLocation6;
	}

	@Column(name = "pain_location_7")
	public Integer getPainLocation7() {
		return this.painLocation7;
	}

	public void setPainLocation7(Integer painLocation7) {
		this.painLocation7 = painLocation7;
	}

	@Column(name = "pain_location_8")
	public Integer getPainLocation8() {
		return this.painLocation8;
	}

	public void setPainLocation8(Integer painLocation8) {
		this.painLocation8 = painLocation8;
	}

	@Column(name = "pain_location_9")
	public Integer getPainLocation9() {
		return this.painLocation9;
	}

	public void setPainLocation9(Integer painLocation9) {
		this.painLocation9 = painLocation9;
	}

	@Column(name = "pain_location_10")
	public Integer getPainLocation10() {
		return this.painLocation10;
	}

	public void setPainLocation10(Integer painLocation10) {
		this.painLocation10 = painLocation10;
	}

	@Column(name = "pain_location_11")
	public Integer getPainLocation11() {
		return this.painLocation11;
	}

	public void setPainLocation11(Integer painLocation11) {
		this.painLocation11 = painLocation11;
	}

	@Column(name = "pain_location_12")
	public Integer getPainLocation12() {
		return this.painLocation12;
	}

	public void setPainLocation12(Integer painLocation12) {
		this.painLocation12 = painLocation12;
	}

	@Column(name = "pain_location_13")
	public Integer getPainLocation13() {
		return this.painLocation13;
	}

	public void setPainLocation13(Integer painLocation13) {
		this.painLocation13 = painLocation13;
	}

	@Column(name = "pain_location_14")
	public Integer getPainLocation14() {
		return this.painLocation14;
	}

	public void setPainLocation14(Integer painLocation14) {
		this.painLocation14 = painLocation14;
	}

	@Column(name = "pain_location_15")
	public Integer getPainLocation15() {
		return this.painLocation15;
	}

	public void setPainLocation15(Integer painLocation15) {
		this.painLocation15 = painLocation15;
	}

	@Column(name = "pain_location_16")
	public Integer getPainLocation16() {
		return this.painLocation16;
	}

	public void setPainLocation16(Integer painLocation16) {
		this.painLocation16 = painLocation16;
	}

	@Column(name = "pain_location_17")
	public Integer getPainLocation17() {
		return this.painLocation17;
	}

	public void setPainLocation17(Integer painLocation17) {
		this.painLocation17 = painLocation17;
	}

	@Column(name = "pain_location_18")
	public Integer getPainLocation18() {
		return this.painLocation18;
	}

	public void setPainLocation18(Integer painLocation18) {
		this.painLocation18 = painLocation18;
	}

	@Column(name = "heartattack")
	public Integer getHeartattack() {
		return this.heartattack;
	}

	public void setHeartattack(Integer heartattack) {
		this.heartattack = heartattack;
	}

	@Column(name = "heartattack_treatment")
	public Integer getHeartattackTreatment() {
		return this.heartattackTreatment;
	}

	public void setHeartattackTreatment(Integer heartattackTreatment) {
		this.heartattackTreatment = heartattackTreatment;
	}

	@Column(name = "heartattack_traditional")
	public Integer getHeartattackTraditional() {
		return this.heartattackTraditional;
	}

	public void setHeartattackTraditional(Integer heartattackTraditional) {
		this.heartattackTraditional = heartattackTraditional;
	}

	@Column(name = "congestive_heart_failure")
	public Integer getCongestiveHeartFailure() {
		return this.congestiveHeartFailure;
	}

	public void setCongestiveHeartFailure(Integer congestiveHeartFailure) {
		this.congestiveHeartFailure = congestiveHeartFailure;
	}

	@Column(name = "chf_treatment_yn")
	public Integer getChfTreatmentYn() {
		return this.chfTreatmentYn;
	}

	public void setChfTreatmentYn(Integer chfTreatmentYn) {
		this.chfTreatmentYn = chfTreatmentYn;
	}

	@Column(name = "chf_treat_now")
	public Integer getChfTreatNow() {
		return this.chfTreatNow;
	}

	public void setChfTreatNow(Integer chfTreatNow) {
		this.chfTreatNow = chfTreatNow;
	}

	@Column(name = "chf_meds")
	public String getChfMeds() {
		return this.chfMeds;
	}

	public void setChfMeds(String chfMeds) {
		this.chfMeds = chfMeds;
	}

	@Column(name = "chf_traditional")
	public Integer getChfTraditional() {
		return this.chfTraditional;
	}

	public void setChfTraditional(Integer chfTraditional) {
		this.chfTraditional = chfTraditional;
	}

	@Column(name = "cholesterol")
	public Integer getCholesterol() {
		return this.cholesterol;
	}

	public void setCholesterol(Integer cholesterol) {
		this.cholesterol = cholesterol;
	}

	@Column(name = "h_cholesterol")
	public Integer getHCholesterol() {
		return this.HCholesterol;
	}

	public void setHCholesterol(Integer HCholesterol) {
		this.HCholesterol = HCholesterol;
	}

	@Column(name = "cholesterol_treatment")
	public Integer getCholesterolTreatment() {
		return this.cholesterolTreatment;
	}

	public void setCholesterolTreatment(Integer cholesterolTreatment) {
		this.cholesterolTreatment = cholesterolTreatment;
	}

	@Column(name = "cholesterol_meds_special_diet")
	public Integer getCholesterolMedsSpecialDiet() {
		return this.cholesterolMedsSpecialDiet;
	}

	public void setCholesterolMedsSpecialDiet(Integer cholesterolMedsSpecialDiet) {
		this.cholesterolMedsSpecialDiet = cholesterolMedsSpecialDiet;
	}

	@Column(name = "cholesterol_meds_weight_loss")
	public Integer getCholesterolMedsWeightLoss() {
		return this.cholesterolMedsWeightLoss;
	}

	public void setCholesterolMedsWeightLoss(Integer cholesterolMedsWeightLoss) {
		this.cholesterolMedsWeightLoss = cholesterolMedsWeightLoss;
	}

	@Column(name = "cholesterol_meds_medicine")
	public Integer getCholesterolMedsMedicine() {
		return this.cholesterolMedsMedicine;
	}

	public void setCholesterolMedsMedicine(Integer cholesterolMedsMedicine) {
		this.cholesterolMedsMedicine = cholesterolMedsMedicine;
	}

	@Column(name = "cholesterol_meds_other")
	public Integer getCholesterolMedsOther() {
		return this.cholesterolMedsOther;
	}

	public void setCholesterolMedsOther(Integer cholesterolMedsOther) {
		this.cholesterolMedsOther = cholesterolMedsOther;
	}

	@Column(name = "cholesterol_traditional")
	public Integer getCholesterolTraditional() {
		return this.cholesterolTraditional;
	}

	public void setCholesterolTraditional(Integer cholesterolTraditional) {
		this.cholesterolTraditional = cholesterolTraditional;
	}

	@Column(name = "thyroid")
	public Integer getThyroid() {
		return this.thyroid;
	}

	public void setThyroid(Integer thyroid) {
		this.thyroid = thyroid;
	}

	@Column(name = "thyroid_type")
	public Integer getThyroidType() {
		return this.thyroidType;
	}

	public void setThyroidType(Integer thyroidType) {
		this.thyroidType = thyroidType;
	}

	@Column(name = "thryroid_specify")
	public String getThryroidSpecify() {
		return this.thryroidSpecify;
	}

	public void setThryroidSpecify(String thryroidSpecify) {
		this.thryroidSpecify = thryroidSpecify;
	}

	@Column(name = "thyroid_treatment_yn")
	public Integer getThyroidTreatmentYn() {
		return this.thyroidTreatmentYn;
	}

	public void setThyroidTreatmentYn(Integer thyroidTreatmentYn) {
		this.thyroidTreatmentYn = thyroidTreatmentYn;
	}

	@Column(name = "thyroid_treatment_hormone")
	public Integer getThyroidTreatmentHormone() {
		return this.thyroidTreatmentHormone;
	}

	public void setThyroidTreatmentHormone(Integer thyroidTreatmentHormone) {
		this.thyroidTreatmentHormone = thyroidTreatmentHormone;
	}

	@Column(name = "thyroid_treatment_surgery")
	public Integer getThyroidTreatmentSurgery() {
		return this.thyroidTreatmentSurgery;
	}

	public void setThyroidTreatmentSurgery(Integer thyroidTreatmentSurgery) {
		this.thyroidTreatmentSurgery = thyroidTreatmentSurgery;
	}

	@Column(name = "thyroid_treatment_iodine")
	public Integer getThyroidTreatmentIodine() {
		return this.thyroidTreatmentIodine;
	}

	public void setThyroidTreatmentIodine(Integer thyroidTreatmentIodine) {
		this.thyroidTreatmentIodine = thyroidTreatmentIodine;
	}

	@Column(name = "thyroid_treatment_drugs")
	public Integer getThyroidTreatmentDrugs() {
		return this.thyroidTreatmentDrugs;
	}

	public void setThyroidTreatmentDrugs(Integer thyroidTreatmentDrugs) {
		this.thyroidTreatmentDrugs = thyroidTreatmentDrugs;
	}

	@Column(name = "parents_thyroid")
	public Integer getParentsThyroid() {
		return this.parentsThyroid;
	}

	public void setParentsThyroid(Integer parentsThyroid) {
		this.parentsThyroid = parentsThyroid;
	}

	@Column(name = "specify_thyroid_parent")
	public Integer getSpecifyThyroidParent() {
		return this.specifyThyroidParent;
	}

	public void setSpecifyThyroidParent(Integer specifyThyroidParent) {
		this.specifyThyroidParent = specifyThyroidParent;
	}

	@Column(name = "kidney_disease")
	public Integer getKidneyDisease() {
		return this.kidneyDisease;
	}

	public void setKidneyDisease(Integer kidneyDisease) {
		this.kidneyDisease = kidneyDisease;
	}

	@Column(name = "know_type_kidney_disease")
	public Integer getKnowTypeKidneyDisease() {
		return this.knowTypeKidneyDisease;
	}

	public void setKnowTypeKidneyDisease(Integer knowTypeKidneyDisease) {
		this.knowTypeKidneyDisease = knowTypeKidneyDisease;
	}

	@Column(name = "type_kidney_disease")
	public String getTypeKidneyDisease() {
		return this.typeKidneyDisease;
	}

	public void setTypeKidneyDisease(String typeKidneyDisease) {
		this.typeKidneyDisease = typeKidneyDisease;
	}

	@Column(name = "low_kidney_function")
	public Integer getLowKidneyFunction() {
		return this.lowKidneyFunction;
	}

	public void setLowKidneyFunction(Integer lowKidneyFunction) {
		this.lowKidneyFunction = lowKidneyFunction;
	}

	@Column(name = "kidney_family")
	public Integer getKidneyFamily() {
		return this.kidneyFamily;
	}

	public void setKidneyFamily(Integer kidneyFamily) {
		this.kidneyFamily = kidneyFamily;
	}

	@Column(name = "family_kidney_mother")
	public Integer getFamilyKidneyMother() {
		return this.familyKidneyMother;
	}

	public void setFamilyKidneyMother(Integer familyKidneyMother) {
		this.familyKidneyMother = familyKidneyMother;
	}

	@Column(name = "family_kidney_father")
	public Integer getFamilyKidneyFather() {
		return this.familyKidneyFather;
	}

	public void setFamilyKidneyFather(Integer familyKidneyFather) {
		this.familyKidneyFather = familyKidneyFather;
	}

	@Column(name = "family_kidney_other")
	public Integer getFamilyKidneyOther() {
		return this.familyKidneyOther;
	}

	public void setFamilyKidneyOther(Integer familyKidneyOther) {
		this.familyKidneyOther = familyKidneyOther;
	}

	@Column(name = "family_kidney_other_specify")
	public String getFamilyKidneyOtherSpecify() {
		return this.familyKidneyOtherSpecify;
	}

	public void setFamilyKidneyOtherSpecify(String familyKidneyOtherSpecify) {
		this.familyKidneyOtherSpecify = familyKidneyOtherSpecify;
	}

	@Column(name = "kidney_family_type")
	public Integer getKidneyFamilyType() {
		return this.kidneyFamilyType;
	}

	public void setKidneyFamilyType(Integer kidneyFamilyType) {
		this.kidneyFamilyType = kidneyFamilyType;
	}

	@Column(name = "family_kidney_type")
	public String getFamilyKidneyType() {
		return this.familyKidneyType;
	}

	public void setFamilyKidneyType(String familyKidneyType) {
		this.familyKidneyType = familyKidneyType;
	}

	@Column(name = "work_days", precision = 17, scale = 17)
	public Double getWorkDays() {
		return this.workDays;
	}

	public void setWorkDays(Double workDays) {
		this.workDays = workDays;
	}

	@Column(name = "work_weekend")
	public Integer getWorkWeekend() {
		return this.workWeekend;
	}

	public void setWorkWeekend(Integer workWeekend) {
		this.workWeekend = workWeekend;
	}

	@Column(name = "work_sedentary")
	public Integer getWorkSedentary() {
		return this.workSedentary;
	}

	public void setWorkSedentary(Integer workSedentary) {
		this.workSedentary = workSedentary;
	}

	@Column(name = "work_vigorous")
	public Integer getWorkVigorous() {
		return this.workVigorous;
	}

	public void setWorkVigorous(Integer workVigorous) {
		this.workVigorous = workVigorous;
	}

	@Column(name = "work_vigorous_days", precision = 17, scale = 17)
	public Double getWorkVigorousDays() {
		return this.workVigorousDays;
	}

	public void setWorkVigorousDays(Double workVigorousDays) {
		this.workVigorousDays = workVigorousDays;
	}

	@Column(name = "work_vigorous_hours", precision = 17, scale = 17)
	public Double getWorkVigorousHours() {
		return this.workVigorousHours;
	}

	public void setWorkVigorousHours(Double workVigorousHours) {
		this.workVigorousHours = workVigorousHours;
	}

	@Column(name = "work_vigorous_minutes", precision = 17, scale = 17)
	public Double getWorkVigorousMinutes() {
		return this.workVigorousMinutes;
	}

	public void setWorkVigorousMinutes(Double workVigorousMinutes) {
		this.workVigorousMinutes = workVigorousMinutes;
	}

	@Column(name = "work_vigorous_total", precision = 17, scale = 17)
	public Double getWorkVigorousTotal() {
		return this.workVigorousTotal;
	}

	public void setWorkVigorousTotal(Double workVigorousTotal) {
		this.workVigorousTotal = workVigorousTotal;
	}

	@Column(name = "work_moderate")
	public Integer getWorkModerate() {
		return this.workModerate;
	}

	public void setWorkModerate(Integer workModerate) {
		this.workModerate = workModerate;
	}

	@Column(name = "work_moderate_days", precision = 17, scale = 17)
	public Double getWorkModerateDays() {
		return this.workModerateDays;
	}

	public void setWorkModerateDays(Double workModerateDays) {
		this.workModerateDays = workModerateDays;
	}

	@Column(name = "work_moderate_hours", precision = 17, scale = 17)
	public Double getWorkModerateHours() {
		return this.workModerateHours;
	}

	public void setWorkModerateHours(Double workModerateHours) {
		this.workModerateHours = workModerateHours;
	}

	@Column(name = "work_moderate_mins", precision = 17, scale = 17)
	public Double getWorkModerateMins() {
		return this.workModerateMins;
	}

	public void setWorkModerateMins(Double workModerateMins) {
		this.workModerateMins = workModerateMins;
	}

	@Column(name = "work_moderate_total", precision = 17, scale = 17)
	public Double getWorkModerateTotal() {
		return this.workModerateTotal;
	}

	public void setWorkModerateTotal(Double workModerateTotal) {
		this.workModerateTotal = workModerateTotal;
	}

	@Column(name = "work_day_hours", precision = 17, scale = 17)
	public Double getWorkDayHours() {
		return this.workDayHours;
	}

	public void setWorkDayHours(Double workDayHours) {
		this.workDayHours = workDayHours;
	}

	@Column(name = "work_day_mins", precision = 17, scale = 17)
	public Double getWorkDayMins() {
		return this.workDayMins;
	}

	public void setWorkDayMins(Double workDayMins) {
		this.workDayMins = workDayMins;
	}

	@Column(name = "work_day_total", precision = 17, scale = 17)
	public Double getWorkDayTotal() {
		return this.workDayTotal;
	}

	public void setWorkDayTotal(Double workDayTotal) {
		this.workDayTotal = workDayTotal;
	}

	@Column(name = "transport_physical")
	public Integer getTransportPhysical() {
		return this.transportPhysical;
	}

	public void setTransportPhysical(Integer transportPhysical) {
		this.transportPhysical = transportPhysical;
	}

	@Column(name = "transport_physical_days", precision = 17, scale = 17)
	public Double getTransportPhysicalDays() {
		return this.transportPhysicalDays;
	}

	public void setTransportPhysicalDays(Double transportPhysicalDays) {
		this.transportPhysicalDays = transportPhysicalDays;
	}

	@Column(name = "transport_physical_hours", precision = 17, scale = 17)
	public Double getTransportPhysicalHours() {
		return this.transportPhysicalHours;
	}

	public void setTransportPhysicalHours(Double transportPhysicalHours) {
		this.transportPhysicalHours = transportPhysicalHours;
	}

	@Column(name = "transport_physical_mins", precision = 17, scale = 17)
	public Double getTransportPhysicalMins() {
		return this.transportPhysicalMins;
	}

	public void setTransportPhysicalMins(Double transportPhysicalMins) {
		this.transportPhysicalMins = transportPhysicalMins;
	}

	@Column(name = "transport_physical_total", precision = 17, scale = 17)
	public Double getTransportPhysicalTotal() {
		return this.transportPhysicalTotal;
	}

	public void setTransportPhysicalTotal(Double transportPhysicalTotal) {
		this.transportPhysicalTotal = transportPhysicalTotal;
	}

	@Column(name = "leisure_physical")
	public Integer getLeisurePhysical() {
		return this.leisurePhysical;
	}

	public void setLeisurePhysical(Integer leisurePhysical) {
		this.leisurePhysical = leisurePhysical;
	}

	@Column(name = "leisure_vigorous")
	public Integer getLeisureVigorous() {
		return this.leisureVigorous;
	}

	public void setLeisureVigorous(Integer leisureVigorous) {
		this.leisureVigorous = leisureVigorous;
	}

	@Column(name = "leisure_vigorous_days", precision = 17, scale = 17)
	public Double getLeisureVigorousDays() {
		return this.leisureVigorousDays;
	}

	public void setLeisureVigorousDays(Double leisureVigorousDays) {
		this.leisureVigorousDays = leisureVigorousDays;
	}

	@Column(name = "leisure_vigorous_hours", precision = 17, scale = 17)
	public Double getLeisureVigorousHours() {
		return this.leisureVigorousHours;
	}

	public void setLeisureVigorousHours(Double leisureVigorousHours) {
		this.leisureVigorousHours = leisureVigorousHours;
	}

	@Column(name = "leisure_vigorous_mins", precision = 17, scale = 17)
	public Double getLeisureVigorousMins() {
		return this.leisureVigorousMins;
	}

	public void setLeisureVigorousMins(Double leisureVigorousMins) {
		this.leisureVigorousMins = leisureVigorousMins;
	}

	@Column(name = "leisure_vigorous_total", precision = 17, scale = 17)
	public Double getLeisureVigorousTotal() {
		return this.leisureVigorousTotal;
	}

	public void setLeisureVigorousTotal(Double leisureVigorousTotal) {
		this.leisureVigorousTotal = leisureVigorousTotal;
	}

	@Column(name = "leisure_moderate")
	public Integer getLeisureModerate() {
		return this.leisureModerate;
	}

	public void setLeisureModerate(Integer leisureModerate) {
		this.leisureModerate = leisureModerate;
	}

	@Column(name = "leisure_moderate_days", precision = 17, scale = 17)
	public Double getLeisureModerateDays() {
		return this.leisureModerateDays;
	}

	public void setLeisureModerateDays(Double leisureModerateDays) {
		this.leisureModerateDays = leisureModerateDays;
	}

	@Column(name = "leisure_moderate_hours", precision = 17, scale = 17)
	public Double getLeisureModerateHours() {
		return this.leisureModerateHours;
	}

	public void setLeisureModerateHours(Double leisureModerateHours) {
		this.leisureModerateHours = leisureModerateHours;
	}

	@Column(name = "leisure_moderate_mins", precision = 17, scale = 17)
	public Double getLeisureModerateMins() {
		return this.leisureModerateMins;
	}

	public void setLeisureModerateMins(Double leisureModerateMins) {
		this.leisureModerateMins = leisureModerateMins;
	}

	@Column(name = "leisure_moderate_total", precision = 17, scale = 17)
	public Double getLeisureModerateTotal() {
		return this.leisureModerateTotal;
	}

	public void setLeisureModerateTotal(Double leisureModerateTotal) {
		this.leisureModerateTotal = leisureModerateTotal;
	}

	@Column(name = "sitting_hours", precision = 17, scale = 17)
	public Double getSittingHours() {
		return this.sittingHours;
	}

	public void setSittingHours(Double sittingHours) {
		this.sittingHours = sittingHours;
	}

	@Column(name = "sitting_work_hours", precision = 17, scale = 17)
	public Double getSittingWorkHours() {
		return this.sittingWorkHours;
	}

	public void setSittingWorkHours(Double sittingWorkHours) {
		this.sittingWorkHours = sittingWorkHours;
	}

	@Column(name = "sitting_work_mins", precision = 17, scale = 17)
	public Double getSittingWorkMins() {
		return this.sittingWorkMins;
	}

	public void setSittingWorkMins(Double sittingWorkMins) {
		this.sittingWorkMins = sittingWorkMins;
	}

	@Column(name = "sitting_work_total", precision = 17, scale = 17)
	public Double getSittingWorkTotal() {
		return this.sittingWorkTotal;
	}

	public void setSittingWorkTotal(Double sittingWorkTotal) {
		this.sittingWorkTotal = sittingWorkTotal;
	}

	@Column(name = "tv_week_hours", precision = 17, scale = 17)
	public Double getTvWeekHours() {
		return this.tvWeekHours;
	}

	public void setTvWeekHours(Double tvWeekHours) {
		this.tvWeekHours = tvWeekHours;
	}

	@Column(name = "tv_week_mins", precision = 17, scale = 17)
	public Double getTvWeekMins() {
		return this.tvWeekMins;
	}

	public void setTvWeekMins(Double tvWeekMins) {
		this.tvWeekMins = tvWeekMins;
	}

	@Column(name = "tv_week_total", precision = 17, scale = 17)
	public Double getTvWeekTotal() {
		return this.tvWeekTotal;
	}

	public void setTvWeekTotal(Double tvWeekTotal) {
		this.tvWeekTotal = tvWeekTotal;
	}

	@Column(name = "tv_weekend_hours", precision = 17, scale = 17)
	public Double getTvWeekendHours() {
		return this.tvWeekendHours;
	}

	public void setTvWeekendHours(Double tvWeekendHours) {
		this.tvWeekendHours = tvWeekendHours;
	}

	@Column(name = "tv_weekend_mins", precision = 17, scale = 17)
	public Double getTvWeekendMins() {
		return this.tvWeekendMins;
	}

	public void setTvWeekendMins(Double tvWeekendMins) {
		this.tvWeekendMins = tvWeekendMins;
	}

	@Column(name = "tv_weekend_total", precision = 17, scale = 17)
	public Double getTvWeekendTotal() {
		return this.tvWeekendTotal;
	}

	public void setTvWeekendTotal(Double tvWeekendTotal) {
		this.tvWeekendTotal = tvWeekendTotal;
	}

	@Column(name = "pc_week_hours", precision = 17, scale = 17)
	public Double getPcWeekHours() {
		return this.pcWeekHours;
	}

	public void setPcWeekHours(Double pcWeekHours) {
		this.pcWeekHours = pcWeekHours;
	}

	@Column(name = "pc_week_mins", precision = 17, scale = 17)
	public Double getPcWeekMins() {
		return this.pcWeekMins;
	}

	public void setPcWeekMins(Double pcWeekMins) {
		this.pcWeekMins = pcWeekMins;
	}

	@Column(name = "pc_week_total", precision = 17, scale = 17)
	public Double getPcWeekTotal() {
		return this.pcWeekTotal;
	}

	public void setPcWeekTotal(Double pcWeekTotal) {
		this.pcWeekTotal = pcWeekTotal;
	}

	@Column(name = "pc_weekend_hours", precision = 17, scale = 17)
	public Double getPcWeekendHours() {
		return this.pcWeekendHours;
	}

	public void setPcWeekendHours(Double pcWeekendHours) {
		this.pcWeekendHours = pcWeekendHours;
	}

	@Column(name = "pc_weekend_mins", precision = 17, scale = 17)
	public Double getPcWeekendMins() {
		return this.pcWeekendMins;
	}

	public void setPcWeekendMins(Double pcWeekendMins) {
		this.pcWeekendMins = pcWeekendMins;
	}

	@Column(name = "pc_weekend_total", precision = 17, scale = 17)
	public Double getPcWeekendTotal() {
		return this.pcWeekendTotal;
	}

	public void setPcWeekendTotal(Double pcWeekendTotal) {
		this.pcWeekendTotal = pcWeekendTotal;
	}

	@Column(name = "sit_travel_week_hours", precision = 17, scale = 17)
	public Double getSitTravelWeekHours() {
		return this.sitTravelWeekHours;
	}

	public void setSitTravelWeekHours(Double sitTravelWeekHours) {
		this.sitTravelWeekHours = sitTravelWeekHours;
	}

	@Column(name = "sit_travel_week_mins", precision = 17, scale = 17)
	public Double getSitTravelWeekMins() {
		return this.sitTravelWeekMins;
	}

	public void setSitTravelWeekMins(Double sitTravelWeekMins) {
		this.sitTravelWeekMins = sitTravelWeekMins;
	}

	@Column(name = "sit_travel_week_total", precision = 17, scale = 17)
	public Double getSitTravelWeekTotal() {
		return this.sitTravelWeekTotal;
	}

	public void setSitTravelWeekTotal(Double sitTravelWeekTotal) {
		this.sitTravelWeekTotal = sitTravelWeekTotal;
	}

	@Column(name = "sit_travel_weekend_hours", precision = 17, scale = 17)
	public Double getSitTravelWeekendHours() {
		return this.sitTravelWeekendHours;
	}

	public void setSitTravelWeekendHours(Double sitTravelWeekendHours) {
		this.sitTravelWeekendHours = sitTravelWeekendHours;
	}

	@Column(name = "sit_travel_weekend_mins", precision = 17, scale = 17)
	public Double getSitTravelWeekendMins() {
		return this.sitTravelWeekendMins;
	}

	public void setSitTravelWeekendMins(Double sitTravelWeekendMins) {
		this.sitTravelWeekendMins = sitTravelWeekendMins;
	}

	@Column(name = "sit_travel_weekend_total", precision = 17, scale = 17)
	public Double getSitTravelWeekendTotal() {
		return this.sitTravelWeekendTotal;
	}

	public void setSitTravelWeekendTotal(Double sitTravelWeekendTotal) {
		this.sitTravelWeekendTotal = sitTravelWeekendTotal;
	}

	@Column(name = "sit_social_week_hours", precision = 17, scale = 17)
	public Double getSitSocialWeekHours() {
		return this.sitSocialWeekHours;
	}

	public void setSitSocialWeekHours(Double sitSocialWeekHours) {
		this.sitSocialWeekHours = sitSocialWeekHours;
	}

	@Column(name = "sit_social_week_mins", precision = 17, scale = 17)
	public Double getSitSocialWeekMins() {
		return this.sitSocialWeekMins;
	}

	public void setSitSocialWeekMins(Double sitSocialWeekMins) {
		this.sitSocialWeekMins = sitSocialWeekMins;
	}

	@Column(name = "sit_social_week_total", precision = 17, scale = 17)
	public Double getSitSocialWeekTotal() {
		return this.sitSocialWeekTotal;
	}

	public void setSitSocialWeekTotal(Double sitSocialWeekTotal) {
		this.sitSocialWeekTotal = sitSocialWeekTotal;
	}

	@Column(name = "sit_social_weekend_hours", precision = 17, scale = 17)
	public Double getSitSocialWeekendHours() {
		return this.sitSocialWeekendHours;
	}

	public void setSitSocialWeekendHours(Double sitSocialWeekendHours) {
		this.sitSocialWeekendHours = sitSocialWeekendHours;
	}

	@Column(name = "sit_social_weekend_mins", precision = 17, scale = 17)
	public Double getSitSocialWeekendMins() {
		return this.sitSocialWeekendMins;
	}

	public void setSitSocialWeekendMins(Double sitSocialWeekendMins) {
		this.sitSocialWeekendMins = sitSocialWeekendMins;
	}

	@Column(name = "sit_social_weekend_total", precision = 17, scale = 17)
	public Double getSitSocialWeekendTotal() {
		return this.sitSocialWeekendTotal;
	}

	public void setSitSocialWeekendTotal(Double sitSocialWeekendTotal) {
		this.sitSocialWeekendTotal = sitSocialWeekendTotal;
	}

	@Column(name = "hours_relax_week", precision = 17, scale = 17)
	public Double getHoursRelaxWeek() {
		return this.hoursRelaxWeek;
	}

	public void setHoursRelaxWeek(Double hoursRelaxWeek) {
		this.hoursRelaxWeek = hoursRelaxWeek;
	}

	@Column(name = "mins_relax_week", precision = 17, scale = 17)
	public Double getMinsRelaxWeek() {
		return this.minsRelaxWeek;
	}

	public void setMinsRelaxWeek(Double minsRelaxWeek) {
		this.minsRelaxWeek = minsRelaxWeek;
	}

	@Column(name = "total_relax_week", precision = 17, scale = 17)
	public Double getTotalRelaxWeek() {
		return this.totalRelaxWeek;
	}

	public void setTotalRelaxWeek(Double totalRelaxWeek) {
		this.totalRelaxWeek = totalRelaxWeek;
	}

	@Column(name = "hours_relax_weekend", precision = 17, scale = 17)
	public Double getHoursRelaxWeekend() {
		return this.hoursRelaxWeekend;
	}

	public void setHoursRelaxWeekend(Double hoursRelaxWeekend) {
		this.hoursRelaxWeekend = hoursRelaxWeekend;
	}

	@Column(name = "mins_relax_weekend", precision = 17, scale = 17)
	public Double getMinsRelaxWeekend() {
		return this.minsRelaxWeekend;
	}

	public void setMinsRelaxWeekend(Double minsRelaxWeekend) {
		this.minsRelaxWeekend = minsRelaxWeekend;
	}

	@Column(name = "total_relax_weekend", precision = 17, scale = 17)
	public Double getTotalRelaxWeekend() {
		return this.totalRelaxWeekend;
	}

	public void setTotalRelaxWeekend(Double totalRelaxWeekend) {
		this.totalRelaxWeekend = totalRelaxWeekend;
	}

	@Column(name = "hours_church", precision = 17, scale = 17)
	public Double getHoursChurch() {
		return this.hoursChurch;
	}

	public void setHoursChurch(Double hoursChurch) {
		this.hoursChurch = hoursChurch;
	}

	@Column(name = "mins_church", precision = 17, scale = 17)
	public Double getMinsChurch() {
		return this.minsChurch;
	}

	public void setMinsChurch(Double minsChurch) {
		this.minsChurch = minsChurch;
	}

	@Column(name = "total_church_week", precision = 17, scale = 17)
	public Double getTotalChurchWeek() {
		return this.totalChurchWeek;
	}

	public void setTotalChurchWeek(Double totalChurchWeek) {
		this.totalChurchWeek = totalChurchWeek;
	}

	@Column(name = "hours_church_weekend", precision = 17, scale = 17)
	public Double getHoursChurchWeekend() {
		return this.hoursChurchWeekend;
	}

	public void setHoursChurchWeekend(Double hoursChurchWeekend) {
		this.hoursChurchWeekend = hoursChurchWeekend;
	}

	@Column(name = "mins_church_weekend", precision = 17, scale = 17)
	public Double getMinsChurchWeekend() {
		return this.minsChurchWeekend;
	}

	public void setMinsChurchWeekend(Double minsChurchWeekend) {
		this.minsChurchWeekend = minsChurchWeekend;
	}

	@Column(name = "total_church_weekend", precision = 17, scale = 17)
	public Double getTotalChurchWeekend() {
		return this.totalChurchWeekend;
	}

	public void setTotalChurchWeekend(Double totalChurchWeekend) {
		this.totalChurchWeekend = totalChurchWeekend;
	}

	@Column(name = "sleep_time_week", length = 15)
	public Date getSleepTimeWeek() {
		return this.sleepTimeWeek;
	}

	public void setSleepTimeWeek(Date sleepTimeWeek) {
		this.sleepTimeWeek = sleepTimeWeek;
	}

	@Column(name = "wakeup_time_week", length = 15)
	public Date getWakeupTimeWeek() {
		return this.wakeupTimeWeek;
	}

	public void setWakeupTimeWeek(Date wakeupTimeWeek) {
		this.wakeupTimeWeek = wakeupTimeWeek;
	}

	@Column(name = "hours_sleep_week", precision = 17, scale = 17)
	public Double getHoursSleepWeek() {
		return this.hoursSleepWeek;
	}

	public void setHoursSleepWeek(Double hoursSleepWeek) {
		this.hoursSleepWeek = hoursSleepWeek;
	}

	@Column(name = "sleep_time_weekend", length = 15)
	public Date getSleepTimeWeekend() {
		return this.sleepTimeWeekend;
	}

	public void setSleepTimeWeekend(Date sleepTimeWeekend) {
		this.sleepTimeWeekend = sleepTimeWeekend;
	}

	@Column(name = "wakeup_time_weekend", length = 15)
	public Date getWakeupTimeWeekend() {
		return this.wakeupTimeWeekend;
	}

	public void setWakeupTimeWeekend(Date wakeupTimeWeekend) {
		this.wakeupTimeWeekend = wakeupTimeWeekend;
	}

	@Column(name = "hours_sleep_weekend", precision = 17, scale = 17)
	public Double getHoursSleepWeekend() {
		return this.hoursSleepWeekend;
	}

	public void setHoursSleepWeekend(Double hoursSleepWeekend) {
		this.hoursSleepWeekend = hoursSleepWeekend;
	}

	@Column(name = "end_time", length = 15)
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Column(name = "standing_height_mm", precision = 17, scale = 17)
	public Double getStandingHeightMm() {
		return this.standingHeightMm;
	}

	public void setStandingHeightMm(Double standingHeightMm) {
		this.standingHeightMm = standingHeightMm;
	}

	@Column(name = "weight_kg", precision = 8, scale = 8)
	public Float getWeightKg() {
		return this.weightKg;
	}

	public void setWeightKg(Float weightKg) {
		this.weightKg = weightKg;
	}

	@Column(name = "waist_circumference_mm", precision = 17, scale = 17)
	public Double getWaistCircumferenceMm() {
		return this.waistCircumferenceMm;
	}

	public void setWaistCircumferenceMm(Double waistCircumferenceMm) {
		this.waistCircumferenceMm = waistCircumferenceMm;
	}

	@Column(name = "hip_circumference_mm", precision = 17, scale = 17)
	public Double getHipCircumferenceMm() {
		return this.hipCircumferenceMm;
	}

	public void setHipCircumferenceMm(Double hipCircumferenceMm) {
		this.hipCircumferenceMm = hipCircumferenceMm;
	}

	@Column(name = "systolic_1", precision = 17, scale = 17)
	public Double getSystolic1() {
		return this.systolic1;
	}

	public void setSystolic1(Double systolic1) {
		this.systolic1 = systolic1;
	}

	@Column(name = "systolic_2", precision = 17, scale = 17)
	public Double getSystolic2() {
		return this.systolic2;
	}

	public void setSystolic2(Double systolic2) {
		this.systolic2 = systolic2;
	}

	@Column(name = "systolic_3", precision = 17, scale = 17)
	public Double getSystolic3() {
		return this.systolic3;
	}

	public void setSystolic3(Double systolic3) {
		this.systolic3 = systolic3;
	}

	@Column(name = "bp_sys_avg", precision = 8, scale = 8)
	public Float getBpSysAvg() {
		return this.bpSysAvg;
	}

	public void setBpSysAvg(Float bpSysAvg) {
		this.bpSysAvg = bpSysAvg;
	}

	@Column(name = "diastolic_1", precision = 17, scale = 17)
	public Double getDiastolic1() {
		return this.diastolic1;
	}

	public void setDiastolic1(Double diastolic1) {
		this.diastolic1 = diastolic1;
	}

	@Column(name = "diastolic_2", precision = 17, scale = 17)
	public Double getDiastolic2() {
		return this.diastolic2;
	}

	public void setDiastolic2(Double diastolic2) {
		this.diastolic2 = diastolic2;
	}

	@Column(name = "diastolic_3", precision = 17, scale = 17)
	public Double getDiastolic3() {
		return this.diastolic3;
	}

	public void setDiastolic3(Double diastolic3) {
		this.diastolic3 = diastolic3;
	}

	@Column(name = "bp_dia_avg", precision = 8, scale = 8)
	public Float getBpDiaAvg() {
		return this.bpDiaAvg;
	}

	public void setBpDiaAvg(Float bpDiaAvg) {
		this.bpDiaAvg = bpDiaAvg;
	}

	@Column(name = "time_bp", length = 15)
	public Date getTimeBp() {
		return this.timeBp;
	}

	public void setTimeBp(Date timeBp) {
		this.timeBp = timeBp;
	}

	@Column(name = "pulse_1", precision = 17, scale = 17)
	public Double getPulse1() {
		return this.pulse1;
	}

	public void setPulse1(Double pulse1) {
		this.pulse1 = pulse1;
	}

	@Column(name = "pulse_2", precision = 17, scale = 17)
	public Double getPulse2() {
		return this.pulse2;
	}

	public void setPulse2(Double pulse2) {
		this.pulse2 = pulse2;
	}

	@Column(name = "pulse_3", precision = 17, scale = 17)
	public Double getPulse3() {
		return this.pulse3;
	}

	public void setPulse3(Double pulse3) {
		this.pulse3 = pulse3;
	}

	@Column(name = "pulse_avg", precision = 8, scale = 8)
	public Float getPulseAvg() {
		return this.pulseAvg;
	}

	public void setPulseAvg(Float pulseAvg) {
		this.pulseAvg = pulseAvg;
	}

	@Column(name = "collector_measurements")
	public String getCollectorMeasurements() {
		return this.collectorMeasurements;
	}

	public void setCollectorMeasurements(String collectorMeasurements) {
		this.collectorMeasurements = collectorMeasurements;
	}

	@Column(name = "notes_anthropometry")
	public String getNotesAnthropometry() {
		return this.notesAnthropometry;
	}

	public void setNotesAnthropometry(String notesAnthropometry) {
		this.notesAnthropometry = notesAnthropometry;
	}

	@Column(name = "ultrasound")
	public Integer getUltrasound() {
		return this.ultrasound;
	}

	public void setUltrasound(Integer ultrasound) {
		this.ultrasound = ultrasound;
	}

	@Column(name = "visceral_fat", precision = 8, scale = 8)
	public Float getVisceralFat() {
		return this.visceralFat;
	}

	public void setVisceralFat(Float visceralFat) {
		this.visceralFat = visceralFat;
	}

	@Column(name = "subcutaneous_fat", precision = 8, scale = 8)
	public Float getSubcutaneousFat() {
		return this.subcutaneousFat;
	}

	public void setSubcutaneousFat(Float subcutaneousFat) {
		this.subcutaneousFat = subcutaneousFat;
	}

	@Column(name = "ultrasound_operator")
	public String getUltrasoundOperator() {
		return this.ultrasoundOperator;
	}

	public void setUltrasoundOperator(String ultrasoundOperator) {
		this.ultrasoundOperator = ultrasoundOperator;
	}

	@Column(name = "date_ultrasound_taken")
	public String getDateUltrasoundTaken() {
		return this.dateUltrasoundTaken;
	}

	public void setDateUltrasoundTaken(String dateUltrasoundTaken) {
		this.dateUltrasoundTaken = dateUltrasoundTaken;
	}

	@Column(name = "cimt")
	public Integer getCimt() {
		return this.cimt;
	}

	public void setCimt(Integer cimt) {
		this.cimt = cimt;
	}

	@Column(name = "min_cimt_right", precision = 8, scale = 8)
	public Float getMinCimtRight() {
		return this.minCimtRight;
	}

	public void setMinCimtRight(Float minCimtRight) {
		this.minCimtRight = minCimtRight;
	}

	@Column(name = "max_cimt_right", precision = 8, scale = 8)
	public Float getMaxCimtRight() {
		return this.maxCimtRight;
	}

	public void setMaxCimtRight(Float maxCimtRight) {
		this.maxCimtRight = maxCimtRight;
	}

	@Column(name = "mean_cimt_right", precision = 8, scale = 8)
	public Float getMeanCimtRight() {
		return this.meanCimtRight;
	}

	public void setMeanCimtRight(Float meanCimtRight) {
		this.meanCimtRight = meanCimtRight;
	}

	@Column(name = "min_cimt_left", precision = 8, scale = 8)
	public Float getMinCimtLeft() {
		return this.minCimtLeft;
	}

	public void setMinCimtLeft(Float minCimtLeft) {
		this.minCimtLeft = minCimtLeft;
	}

	@Column(name = "max_cimt_left", precision = 8, scale = 8)
	public Float getMaxCimtLeft() {
		return this.maxCimtLeft;
	}

	public void setMaxCimtLeft(Float maxCimtLeft) {
		this.maxCimtLeft = maxCimtLeft;
	}

	@Column(name = "mean_cimt_left", precision = 8, scale = 8)
	public Float getMeanCimtLeft() {
		return this.meanCimtLeft;
	}

	public void setMeanCimtLeft(Float meanCimtLeft) {
		this.meanCimtLeft = meanCimtLeft;
	}

	@Column(name = "ultrasound_notes")
	public String getUltrasoundNotes() {
		return this.ultrasoundNotes;
	}

	public void setUltrasoundNotes(String ultrasoundNotes) {
		this.ultrasoundNotes = ultrasoundNotes;
	}

	@Column(name = "fasting")
	public Integer getFasting() {
		return this.fasting;
	}

	public void setFasting(Integer fasting) {
		this.fasting = fasting;
	}

	@Column(name = "time_ate", length = 15)
	public Date getTimeAte() {
		return this.timeAte;
	}

	public void setTimeAte(Date timeAte) {
		this.timeAte = timeAte;
	}

	@Column(name = "fasting_confirmation")
	public Integer getFastingConfirmation() {
		return this.fastingConfirmation;
	}

	public void setFastingConfirmation(Integer fastingConfirmation) {
		this.fastingConfirmation = fastingConfirmation;
	}

	@Column(name = "red")
	public Integer getRed() {
		return this.red;
	}

	public void setRed(Integer red) {
		this.red = red;
	}

	@Column(name = "no_red_tubes", precision = 17, scale = 17)
	public Double getNoRedTubes() {
		return this.noRedTubes;
	}

	public void setNoRedTubes(Double noRedTubes) {
		this.noRedTubes = noRedTubes;
	}

	@Column(name = "purple")
	public Integer getPurple() {
		return this.purple;
	}

	public void setPurple(Integer purple) {
		this.purple = purple;
	}

	@Column(name = "no_purple_tubes", precision = 17, scale = 17)
	public Double getNoPurpleTubes() {
		return this.noPurpleTubes;
	}

	public void setNoPurpleTubes(Double noPurpleTubes) {
		this.noPurpleTubes = noPurpleTubes;
	}

	@Column(name = "grey")
	public Integer getGrey() {
		return this.grey;
	}

	public void setGrey(Integer grey) {
		this.grey = grey;
	}

	@Column(name = "no_grey_tubes", precision = 17, scale = 17)
	public Double getNoGreyTubes() {
		return this.noGreyTubes;
	}

	public void setNoGreyTubes(Double noGreyTubes) {
		this.noGreyTubes = noGreyTubes;
	}

	@Column(name = "notes_blood")
	public String getNotesBlood() {
		return this.notesBlood;
	}

	public void setNotesBlood(String notesBlood) {
		this.notesBlood = notesBlood;
	}

	@Column(name = "phelbotomist")
	public String getPhelbotomist() {
		return this.phelbotomist;
	}

	public void setPhelbotomist(String phelbotomist) {
		this.phelbotomist = phelbotomist;
	}

	@Column(name = "date_blood_taken")
	public String getDateBloodTaken() {
		return this.dateBloodTaken;
	}

	public void setDateBloodTaken(String dateBloodTaken) {
		this.dateBloodTaken = dateBloodTaken;
	}

	@Column(name = "time_blood_taken", length = 15)
	public Date getTimeBloodTaken() {
		return this.timeBloodTaken;
	}

	public void setTimeBloodTaken(Date timeBloodTaken) {
		this.timeBloodTaken = timeBloodTaken;
	}

	@Column(name = "comments")
	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Column(name = "tested_hiv")
	public Integer getTestedHiv() {
		return this.testedHiv;
	}

	public void setTestedHiv(Integer testedHiv) {
		this.testedHiv = testedHiv;
	}

	@Column(name = "hiv_status")
	public Integer getHivStatus() {
		return this.hivStatus;
	}

	public void setHivStatus(Integer hivStatus) {
		this.hivStatus = hivStatus;
	}

	@Column(name = "hiv_positive")
	public Integer getHivPositive() {
		return this.hivPositive;
	}

	public void setHivPositive(Integer hivPositive) {
		this.hivPositive = hivPositive;
	}

	@Column(name = "hiv_medication")
	public Integer getHivMedication() {
		return this.hivMedication;
	}

	public void setHivMedication(Integer hivMedication) {
		this.hivMedication = hivMedication;
	}

	@Column(name = "traditional_med_hiv")
	public Integer getTraditionalMedHiv() {
		return this.traditionalMedHiv;
	}

	public void setTraditionalMedHiv(Integer traditionalMedHiv) {
		this.traditionalMedHiv = traditionalMedHiv;
	}

	@Column(name = "agree_hivtest")
	public Integer getAgreeHivtest() {
		return this.agreeHivtest;
	}

	public void setAgreeHivtest(Integer agreeHivtest) {
		this.agreeHivtest = agreeHivtest;
	}

	@Column(name = "result_hiv")
	public Integer getResultHiv() {
		return this.resultHiv;
	}

	public void setResultHiv(Integer resultHiv) {
		this.resultHiv = resultHiv;
	}

	@Column(name = "plasma_batch")
	public Integer getPlasmaBatch() {
		return this.plasmaBatch;
	}

	public void setPlasmaBatch(Integer plasmaBatch) {
		this.plasmaBatch = plasmaBatch;
	}

	@Column(name = "plasma_box")
	public String getPlasmaBox() {
		return this.plasmaBox;
	}

	public void setPlasmaBox(String plasmaBox) {
		this.plasmaBox = plasmaBox;
	}

	@Column(name = "date_plasma_received", length = 13)
	public Date getDatePlasmaReceived() {
		return this.datePlasmaReceived;
	}

	public void setDatePlasmaReceived(Date datePlasmaReceived) {
		this.datePlasmaReceived = datePlasmaReceived;
	}

	@Column(name = "is_haemolysed")
	public Boolean getIsHaemolysed() {
		return this.isHaemolysed;
	}

	public void setIsHaemolysed(Boolean isHaemolysed) {
		this.isHaemolysed = isHaemolysed;
	}

	@Column(name = "biomarker_notes")
	public String getBiomarkerNotes() {
		return this.biomarkerNotes;
	}

	public void setBiomarkerNotes(String biomarkerNotes) {
		this.biomarkerNotes = biomarkerNotes;
	}

	@Column(name = "serum_tech_name")
	public String getSerumTechName() {
		return this.serumTechName;
	}

	public void setSerumTechName(String serumTechName) {
		this.serumTechName = serumTechName;
	}

	@Column(name = "glucose", precision = 17, scale = 17)
	public Double getGlucose() {
		return this.glucose;
	}

	public void setGlucose(Double glucose) {
		this.glucose = glucose;
	}

	@Column(name = "glucose_2", precision = 17, scale = 17)
	public Double getGlucose2() {
		return this.glucose2;
	}

	public void setGlucose2(Double glucose2) {
		this.glucose2 = glucose2;
	}

	@Column(name = "glucose_3", precision = 17, scale = 17)
	public Double getGlucose3() {
		return this.glucose3;
	}

	public void setGlucose3(Double glucose3) {
		this.glucose3 = glucose3;
	}

	@Column(name = "date_glucose", length = 13)
	public Date getDateGlucose() {
		return this.dateGlucose;
	}

	public void setDateGlucose(Date dateGlucose) {
		this.dateGlucose = dateGlucose;
	}

	@Column(name = "glucose_comments")
	public String getGlucoseComments() {
		return this.glucoseComments;
	}

	public void setGlucoseComments(String glucoseComments) {
		this.glucoseComments = glucoseComments;
	}

	@Column(name = "serum_batch")
	public Integer getSerumBatch() {
		return this.serumBatch;
	}

	public void setSerumBatch(Integer serumBatch) {
		this.serumBatch = serumBatch;
	}

	@Column(name = "serum_box")
	public String getSerumBox() {
		return this.serumBox;
	}

	public void setSerumBox(String serumBox) {
		this.serumBox = serumBox;
	}

	@Column(name = "date_serum_received", length = 13)
	public Date getDateSerumReceived() {
		return this.dateSerumReceived;
	}

	public void setDateSerumReceived(Date dateSerumReceived) {
		this.dateSerumReceived = dateSerumReceived;
	}

	@Column(name = "is_serum_testable")
	public Boolean getIsSerumTestable() {
		return this.isSerumTestable;
	}

	public void setIsSerumTestable(Boolean isSerumTestable) {
		this.isSerumTestable = isSerumTestable;
	}

	@Column(name = "serum_comments")
	public String getSerumComments() {
		return this.serumComments;
	}

	public void setSerumComments(String serumComments) {
		this.serumComments = serumComments;
	}

	@Column(name = "s_creatinine", precision = 17, scale = 17)
	public Double getSCreatinine() {
		return this.SCreatinine;
	}

	public void setSCreatinine(Double SCreatinine) {
		this.SCreatinine = SCreatinine;
	}

	@Column(name = "plasma_tech_name")
	public String getPlasmaTechName() {
		return this.plasmaTechName;
	}

	public void setPlasmaTechName(String plasmaTechName) {
		this.plasmaTechName = plasmaTechName;
	}

	@Column(name = "insulin", precision = 17, scale = 17)
	public Double getInsulin() {
		return this.insulin;
	}

	public void setInsulin(Double insulin) {
		this.insulin = insulin;
	}

	@Column(name = "insulin_2", precision = 17, scale = 17)
	public Double getInsulin2() {
		return this.insulin2;
	}

	public void setInsulin2(Double insulin2) {
		this.insulin2 = insulin2;
	}

	@Column(name = "insulin_3", precision = 17, scale = 17)
	public Double getInsulin3() {
		return this.insulin3;
	}

	public void setInsulin3(Double insulin3) {
		this.insulin3 = insulin3;
	}

	@Column(name = "date_insulin_tested", length = 13)
	public Date getDateInsulinTested() {
		return this.dateInsulinTested;
	}

	public void setDateInsulinTested(Date dateInsulinTested) {
		this.dateInsulinTested = dateInsulinTested;
	}

	@Column(name = "insulin_comments")
	public String getInsulinComments() {
		return this.insulinComments;
	}

	public void setInsulinComments(String insulinComments) {
		this.insulinComments = insulinComments;
	}

	@Column(name = "hdl", precision = 17, scale = 17)
	public Double getHdl() {
		return this.hdl;
	}

	public void setHdl(Double hdl) {
		this.hdl = hdl;
	}

	@Column(name = "hdl_2", precision = 17, scale = 17)
	public Double getHdl2() {
		return this.hdl2;
	}

	public void setHdl2(Double hdl2) {
		this.hdl2 = hdl2;
	}

	@Column(name = "hdl_3", precision = 17, scale = 17)
	public Double getHdl3() {
		return this.hdl3;
	}

	public void setHdl3(Double hdl3) {
		this.hdl3 = hdl3;
	}

	@Column(name = "ldl", precision = 17, scale = 17)
	public Double getLdl() {
		return this.ldl;
	}

	public void setLdl(Double ldl) {
		this.ldl = ldl;
	}

	@Column(name = "ldl_2", precision = 17, scale = 17)
	public Double getLdl2() {
		return this.ldl2;
	}

	public void setLdl2(Double ldl2) {
		this.ldl2 = ldl2;
	}

	@Column(name = "ldl_3", precision = 17, scale = 17)
	public Double getLdl3() {
		return this.ldl3;
	}

	public void setLdl3(Double ldl3) {
		this.ldl3 = ldl3;
	}

	@Column(name = "cholesterol_1", precision = 17, scale = 17)
	public Double getCholesterol1() {
		return this.cholesterol1;
	}

	public void setCholesterol1(Double cholesterol1) {
		this.cholesterol1 = cholesterol1;
	}

	@Column(name = "cholesterol_2", precision = 17, scale = 17)
	public Double getCholesterol2() {
		return this.cholesterol2;
	}

	public void setCholesterol2(Double cholesterol2) {
		this.cholesterol2 = cholesterol2;
	}

	@Column(name = "cholesterol_3", precision = 17, scale = 17)
	public Double getCholesterol3() {
		return this.cholesterol3;
	}

	public void setCholesterol3(Double cholesterol3) {
		this.cholesterol3 = cholesterol3;
	}

	@Column(name = "triglycerides", precision = 17, scale = 17)
	public Double getTriglycerides() {
		return this.triglycerides;
	}

	public void setTriglycerides(Double triglycerides) {
		this.triglycerides = triglycerides;
	}

	@Column(name = "triglycerides_2", precision = 17, scale = 17)
	public Double getTriglycerides2() {
		return this.triglycerides2;
	}

	public void setTriglycerides2(Double triglycerides2) {
		this.triglycerides2 = triglycerides2;
	}

	@Column(name = "triglycerides_3", precision = 17, scale = 17)
	public Double getTriglycerides3() {
		return this.triglycerides3;
	}

	public void setTriglycerides3(Double triglycerides3) {
		this.triglycerides3 = triglycerides3;
	}

	@Column(name = "date_lipids_tested", length = 13)
	public Date getDateLipidsTested() {
		return this.dateLipidsTested;
	}

	public void setDateLipidsTested(Date dateLipidsTested) {
		this.dateLipidsTested = dateLipidsTested;
	}

	@Column(name = "lipid_comments")
	public String getLipidComments() {
		return this.lipidComments;
	}

	public void setLipidComments(String lipidComments) {
		this.lipidComments = lipidComments;
	}

	@Column(name = "urine_batch")
	public Integer getUrineBatch() {
		return this.urineBatch;
	}

	public void setUrineBatch(Integer urineBatch) {
		this.urineBatch = urineBatch;
	}

	@Column(name = "urine_box")
	public String getUrineBox() {
		return this.urineBox;
	}

	public void setUrineBox(String urineBox) {
		this.urineBox = urineBox;
	}

	@Column(name = "date_urine_received", length = 13)
	public Date getDateUrineReceived() {
		return this.dateUrineReceived;
	}

	public void setDateUrineReceived(Date dateUrineReceived) {
		this.dateUrineReceived = dateUrineReceived;
	}

	@Column(name = "urine_tech_name")
	public String getUrineTechName() {
		return this.urineTechName;
	}

	public void setUrineTechName(String urineTechName) {
		this.urineTechName = urineTechName;
	}

	@Column(name = "ur_creatinine", precision = 17, scale = 17)
	public Double getUrCreatinine() {
		return this.urCreatinine;
	}

	public void setUrCreatinine(Double urCreatinine) {
		this.urCreatinine = urCreatinine;
	}

	@Column(name = "ur_albumin", precision = 17, scale = 17)
	public Double getUrAlbumin() {
		return this.urAlbumin;
	}

	public void setUrAlbumin(Double urAlbumin) {
		this.urAlbumin = urAlbumin;
	}

	@Column(name = "acr", precision = 17, scale = 17)
	public Double getAcr() {
		return this.acr;
	}

	public void setAcr(Double acr) {
		this.acr = acr;
	}

	@Column(name = "ur_protein", precision = 17, scale = 17)
	public Double getUrProtein() {
		return this.urProtein;
	}

	public void setUrProtein(Double urProtein) {
		this.urProtein = urProtein;
	}

	@Column(name = "date_urine_tested", length = 13)
	public Date getDateUrineTested() {
		return this.dateUrineTested;
	}

	public void setDateUrineTested(Date dateUrineTested) {
		this.dateUrineTested = dateUrineTested;
	}

	@Column(name = "urine_comments")
	public String getUrineComments() {
		return this.urineComments;
	}

	public void setUrineComments(String urineComments) {
		this.urineComments = urineComments;
	}

	@Column(name = "urine_sample")
	public Integer getUrineSample() {
		return this.urineSample;
	}

	public void setUrineSample(Integer urineSample) {
		this.urineSample = urineSample;
	}

	@Column(name = "informed_consent")
	public Integer getInformedConsent() {
		return this.informedConsent;
	}

	public void setInformedConsent(Integer informedConsent) {
		this.informedConsent = informedConsent;
	}

	@Column(name = "questionnaire")
	public Integer getQuestionnaire() {
		return this.questionnaire;
	}

	public void setQuestionnaire(Integer questionnaire) {
		this.questionnaire = questionnaire;
	}

	@Column(name = "anthropometrics")
	public Integer getAnthropometrics() {
		return this.anthropometrics;
	}

	public void setAnthropometrics(Integer anthropometrics) {
		this.anthropometrics = anthropometrics;
	}

	@Column(name = "blood_pressure_done")
	public Integer getBloodPressureDone() {
		return this.bloodPressureDone;
	}

	public void setBloodPressureDone(Integer bloodPressureDone) {
		this.bloodPressureDone = bloodPressureDone;
	}

	@Column(name = "pulse_done")
	public Integer getPulseDone() {
		return this.pulseDone;
	}

	public void setPulseDone(Integer pulseDone) {
		this.pulseDone = pulseDone;
	}

	@Column(name = "blood_samples")
	public Integer getBloodSamples() {
		return this.bloodSamples;
	}

	public void setBloodSamples(Integer bloodSamples) {
		this.bloodSamples = bloodSamples;
	}

	@Column(name = "abdominal_ultrasound")
	public Integer getAbdominalUltrasound() {
		return this.abdominalUltrasound;
	}

	public void setAbdominalUltrasound(Integer abdominalUltrasound) {
		this.abdominalUltrasound = abdominalUltrasound;
	}

	@Column(name = "table_cimt")
	public Integer getTableCimt() {
		return this.tableCimt;
	}

	public void setTableCimt(Integer tableCimt) {
		this.tableCimt = tableCimt;
	}

	@Column(name = "hiv_test")
	public Integer getHivTest() {
		return this.hivTest;
	}

	public void setHivTest(Integer hivTest) {
		this.hivTest = hivTest;
	}

	@Column(name = "urine")
	public Integer getUrine() {
		return this.urine;
	}

	public void setUrine(Integer urine) {
		this.urine = urine;
	}

	@Column(name = "quality_controller_id")
	public String getQualityControllerId() {
		return this.qualityControllerId;
	}

	public void setQualityControllerId(String qualityControllerId) {
		this.qualityControllerId = qualityControllerId;
	}

	@Column(name = "reimbursement")
	public Integer getReimbursement() {
		return this.reimbursement;
	}

	public void setReimbursement(Integer reimbursement) {
		this.reimbursement = reimbursement;
	}

	@Column(name = "test_results_notes")
	public String getTestResultsNotes() {
		return this.testResultsNotes;
	}

	public void setTestResultsNotes(String testResultsNotes) {
		this.testResultsNotes = testResultsNotes;
	}

	@Column(name = "bmi_c", precision = 17, scale = 17)
	public Double getBmiC() {
		return this.bmiC;
	}

	public void setBmiC(Double bmiC) {
		this.bmiC = bmiC;
	}

	@Column(name = "fasting_glucose", precision = 8, scale = 8)
	public Float getFastingGlucose() {
		return this.fastingGlucose;
	}

	public void setFastingGlucose(Float fastingGlucose) {
		this.fastingGlucose = fastingGlucose;
	}

	@Column(name = "dm_present_c")
	public String getDmPresentC() {
		return this.dmPresentC;
	}

	public void setDmPresentC(String dmPresentC) {
		this.dmPresentC = dmPresentC;
	}

	@Column(name = "htn_present_c")
	public String getHtnPresentC() {
		return this.htnPresentC;
	}

	public void setHtnPresentC(String htnPresentC) {
		this.htnPresentC = htnPresentC;
	}

	@Column(name = "mvpa_c")
	public Integer getMvpaC() {
		return this.mvpaC;
	}

	public void setMvpaC(Integer mvpaC) {
		this.mvpaC = mvpaC;
	}

	@Column(name = "mvpa_cat_c")
	public Integer getMvpaCatC() {
		return this.mvpaCatC;
	}

	public void setMvpaCatC(Integer mvpaCatC) {
		this.mvpaCatC = mvpaCatC;
	}

	@Column(name = "wst_hip_r_c", precision = 8, scale = 8)
	public Float getWstHipRC() {
		return this.wstHipRC;
	}

	public void setWstHipRC(Float wstHipRC) {
		this.wstHipRC = wstHipRC;
	}

	@Column(name = "bmi_cat_c")
	public Integer getBmiCatC() {
		return this.bmiCatC;
	}

	public void setBmiCatC(Integer bmiCatC) {
		this.bmiCatC = bmiCatC;
	}

	@Column(name = "household_density_c", precision = 8, scale = 8)
	public Float getHouseholdDensityC() {
		return this.householdDensityC;
	}

	public void setHouseholdDensityC(Float householdDensityC) {
		this.householdDensityC = householdDensityC;
	}

	@Column(name = "hiv_final_status_c")
	public Integer getHivFinalStatusC() {
		return this.hivFinalStatusC;
	}

	public void setHivFinalStatusC(Integer hivFinalStatusC) {
		this.hivFinalStatusC = hivFinalStatusC;
	}

	@Column(name = "ses_c")
	public Integer getSesC() {
		return this.sesC;
	}

	public void setSesC(Integer sesC) {
		this.sesC = sesC;
	}

	@Column(name = "ses_site_quintile_c")
	public Integer getSesSiteQuintileC() {
		return this.sesSiteQuintileC;
	}

	public void setSesSiteQuintileC(Integer sesSiteQuintileC) {
		this.sesSiteQuintileC = sesSiteQuintileC;
	}

	@Column(name = "other_language")
	public String getOtherLanguage() {
		return this.otherLanguage;
	}

	public void setOtherLanguage(String otherLanguage) {
		this.otherLanguage = otherLanguage;
	}

	@Column(name = "num_in_house_c")
	public Integer getNumInHouseC() {
		return this.numInHouseC;
	}

	public void setNumInHouseC(Integer numInHouseC) {
		this.numInHouseC = numInHouseC;
	}

	@Column(name = "people_to_rooms_density_c", precision = 8, scale = 8)
	public Float getPeopleToRoomsDensityC() {
		return this.peopleToRoomsDensityC;
	}

	public void setPeopleToRoomsDensityC(Float peopleToRoomsDensityC) {
		this.peopleToRoomsDensityC = peopleToRoomsDensityC;
	}

	@Column(name = "people_to_bedrooms_density_c", precision = 8, scale = 8)
	public Float getPeopleToBedroomsDensityC() {
		return this.peopleToBedroomsDensityC;
	}

	public void setPeopleToBedroomsDensityC(Float peopleToBedroomsDensityC) {
		this.peopleToBedroomsDensityC = peopleToBedroomsDensityC;
	}

	@Column(name = "partnership_status_c")
	public Integer getPartnershipStatusC() {
		return this.partnershipStatusC;
	}

	public void setPartnershipStatusC(Integer partnershipStatusC) {
		this.partnershipStatusC = partnershipStatusC;
	}

	@Column(name = "employment_status_c")
	public Integer getEmploymentStatusC() {
		return this.employmentStatusC;
	}

	public void setEmploymentStatusC(Integer employmentStatusC) {
		this.employmentStatusC = employmentStatusC;
	}

	@Column(name = "smoking_status_c")
	public Integer getSmokingStatusC() {
		return this.smokingStatusC;
	}

	public void setSmokingStatusC(Integer smokingStatusC) {
		this.smokingStatusC = smokingStatusC;
	}

	@Column(name = "alcohol_status_c")
	public Integer getAlcoholStatusC() {
		return this.alcoholStatusC;
	}

	public void setAlcoholStatusC(Integer alcoholStatusC) {
		this.alcoholStatusC = alcoholStatusC;
	}

	@Column(name = "avg_sleep_per_night_c", precision = 8, scale = 8)
	public Float getAvgSleepPerNightC() {
		return this.avgSleepPerNightC;
	}

	public void setAvgSleepPerNightC(Float avgSleepPerNightC) {
		this.avgSleepPerNightC = avgSleepPerNightC;
	}

	@Column(name = "number_of_siblings_c")
	public Integer getNumberOfSiblingsC() {
		return this.numberOfSiblingsC;
	}

	public void setNumberOfSiblingsC(Integer numberOfSiblingsC) {
		this.numberOfSiblingsC = numberOfSiblingsC;
	}

	@Column(name = "number_of_children_c")
	public Integer getNumberOfChildrenC() {
		return this.numberOfChildrenC;
	}

	public void setNumberOfChildrenC(Integer numberOfChildrenC) {
		this.numberOfChildrenC = numberOfChildrenC;
	}

	@Column(name = "months_since_last_period_c")
	public Integer getMonthsSinceLastPeriodC() {
		return this.monthsSinceLastPeriodC;
	}

	public void setMonthsSinceLastPeriodC(Integer monthsSinceLastPeriodC) {
		this.monthsSinceLastPeriodC = monthsSinceLastPeriodC;
	}

	@Column(name = "menopausal_status_c", length = 5)
	public String getMenopausalStatusC() {
		return this.menopausalStatusC;
	}

	public void setMenopausalStatusC(String menopausalStatusC) {
		this.menopausalStatusC = menopausalStatusC;
	}

	@Column(name = "last_period_comments")
	public String getLastPeriodComments() {
		return this.lastPeriodComments;
	}

	public void setLastPeriodComments(String lastPeriodComments) {
		this.lastPeriodComments = lastPeriodComments;
	}

	@Column(name = "months_last_period_c")
	public Integer getMonthsLastPeriodC() {
		return this.monthsLastPeriodC;
	}

	public void setMonthsLastPeriodC(Integer monthsLastPeriodC) {
		this.monthsLastPeriodC = monthsLastPeriodC;
	}

	@Column(name = "date_glucose_2", length = 13)
	public Date getDateGlucose2() {
		return this.dateGlucose2;
	}

	public void setDateGlucose2(Date dateGlucose2) {
		this.dateGlucose2 = dateGlucose2;
	}

	@Column(name = "s_creatinine_2", precision = 17, scale = 17)
	public Double getSCreatinine2() {
		return this.SCreatinine2;
	}

	public void setSCreatinine2(Double SCreatinine2) {
		this.SCreatinine2 = SCreatinine2;
	}

	@Column(name = "date_insulin_tested_2", length = 13)
	public Date getDateInsulinTested2() {
		return this.dateInsulinTested2;
	}

	public void setDateInsulinTested2(Date dateInsulinTested2) {
		this.dateInsulinTested2 = dateInsulinTested2;
	}

	@Column(name = "date_lipids_tested_2", length = 13)
	public Date getDateLipidsTested2() {
		return this.dateLipidsTested2;
	}

	public void setDateLipidsTested2(Date dateLipidsTested2) {
		this.dateLipidsTested2 = dateLipidsTested2;
	}

	@Column(name = "all_results_status")
	public Integer getAllResultsStatus() {
		return this.allResultsStatus;
	}

	public void setAllResultsStatus(Integer allResultsStatus) {
		this.allResultsStatus = allResultsStatus;
	}

	@Column(name = "is_complete")
	public Integer getIsComplete() {
		return this.isComplete;
	}

	public void setIsComplete(Integer isComplete) {
		this.isComplete = isComplete;
	}

	@Column(name = "menopause_status_c")
	public Integer getMenopauseStatusC() {
		return this.menopauseStatusC;
	}

	public void setMenopauseStatusC(Integer menopauseStatusC) {
		this.menopauseStatusC = menopauseStatusC;
	}

	@Column(name = "menopause_manual")
	public Integer getMenopauseManual() {
		return this.menopauseManual;
	}

	public void setMenopauseManual(Integer menopauseManual) {
		this.menopauseManual = menopauseManual;
	}

	@Column(name = "htn_jnc7")
	public Integer getHtnJnc7() {
		return this.htnJnc7;
	}

	public void setHtnJnc7(Integer htnJnc7) {
		this.htnJnc7 = htnJnc7;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ParticipantRecord))
			return false;
		ParticipantRecord castOther = (ParticipantRecord) other;

		return ((this.getStudyId() == castOther.getStudyId()) || (this
				.getStudyId() != null && castOther.getStudyId() != null && this
				.getStudyId().equals(castOther.getStudyId())))
				&& ((this.getSiteId() == castOther.getSiteId()) || (this
						.getSiteId() != null && castOther.getSiteId() != null && this
						.getSiteId().equals(castOther.getSiteId())))
				&& ((this.getSite() == castOther.getSite()) || (this.getSite() != null
						&& castOther.getSite() != null && this.getSite()
						.equals(castOther.getSite())))
				&& ((this.getEnrolmentDate() == castOther.getEnrolmentDate()) || (this
						.getEnrolmentDate() != null
						&& castOther.getEnrolmentDate() != null && this
						.getEnrolmentDate()
						.equals(castOther.getEnrolmentDate())))
				&& ((this.getInterviewerCode() == castOther
						.getInterviewerCode()) || (this.getInterviewerCode() != null
						&& castOther.getInterviewerCode() != null && this
						.getInterviewerCode().equals(
								castOther.getInterviewerCode())))
				&& ((this.getStartTime() == castOther.getStartTime()) || (this
						.getStartTime() != null
						&& castOther.getStartTime() != null && this
						.getStartTime().equals(castOther.getStartTime())))
				&& ((this.getDateOfBirthKnown() == castOther
						.getDateOfBirthKnown()) || (this.getDateOfBirthKnown() != null
						&& castOther.getDateOfBirthKnown() != null && this
						.getDateOfBirthKnown().equals(
								castOther.getDateOfBirthKnown())))
				&& ((this.getAge() == castOther.getAge()) || (this.getAge() != null
						&& castOther.getAge() != null && this.getAge().equals(
						castOther.getAge())))
				&& ((this.getSex() == castOther.getSex()) || (this.getSex() != null
						&& castOther.getSex() != null && this.getSex().equals(
						castOther.getSex())))
				&& ((this.getCountry() == castOther.getCountry()) || (this
						.getCountry() != null && castOther.getCountry() != null && this
						.getCountry().equals(castOther.getCountry())))
				&& ((this.getHomeLanguage() == castOther.getHomeLanguage()) || (this
						.getHomeLanguage() != null
						&& castOther.getHomeLanguage() != null && this
						.getHomeLanguage().equals(castOther.getHomeLanguage())))
				&& ((this.getOtherEthnicity() == castOther.getOtherEthnicity()) || (this
						.getOtherEthnicity() != null
						&& castOther.getOtherEthnicity() != null && this
						.getOtherEthnicity().equals(
								castOther.getOtherEthnicity())))
				&& ((this.getEthnicity() == castOther.getEthnicity()) || (this
						.getEthnicity() != null
						&& castOther.getEthnicity() != null && this
						.getEthnicity().equals(castOther.getEthnicity())))
				&& ((this.getFatherEthnicity() == castOther
						.getFatherEthnicity()) || (this.getFatherEthnicity() != null
						&& castOther.getFatherEthnicity() != null && this
						.getFatherEthnicity().equals(
								castOther.getFatherEthnicity())))
				&& ((this.getFatherEthnicityOther() == castOther
						.getFatherEthnicityOther()) || (this
						.getFatherEthnicityOther() != null
						&& castOther.getFatherEthnicityOther() != null && this
						.getFatherEthnicityOther().equals(
								castOther.getFatherEthnicityOther())))
				&& ((this.getFatherLanguage() == castOther.getFatherLanguage()) || (this
						.getFatherLanguage() != null
						&& castOther.getFatherLanguage() != null && this
						.getFatherLanguage().equals(
								castOther.getFatherLanguage())))
				&& ((this.getFatherLanguageOther() == castOther
						.getFatherLanguageOther()) || (this
						.getFatherLanguageOther() != null
						&& castOther.getFatherLanguageOther() != null && this
						.getFatherLanguageOther().equals(
								castOther.getFatherLanguageOther())))
				&& ((this.getPatGfatherEthnicity() == castOther
						.getPatGfatherEthnicity()) || (this
						.getPatGfatherEthnicity() != null
						&& castOther.getPatGfatherEthnicity() != null && this
						.getPatGfatherEthnicity().equals(
								castOther.getPatGfatherEthnicity())))
				&& ((this.getPatGfatherEthnicityOther() == castOther
						.getPatGfatherEthnicityOther()) || (this
						.getPatGfatherEthnicityOther() != null
						&& castOther.getPatGfatherEthnicityOther() != null && this
						.getPatGfatherEthnicityOther().equals(
								castOther.getPatGfatherEthnicityOther())))
				&& ((this.getPatGfatherLanguage() == castOther
						.getPatGfatherLanguage()) || (this
						.getPatGfatherLanguage() != null
						&& castOther.getPatGfatherLanguage() != null && this
						.getPatGfatherLanguage().equals(
								castOther.getPatGfatherLanguage())))
				&& ((this.getPatGfatherLanguageOther() == castOther
						.getPatGfatherLanguageOther()) || (this
						.getPatGfatherLanguageOther() != null
						&& castOther.getPatGfatherLanguageOther() != null && this
						.getPatGfatherLanguageOther().equals(
								castOther.getPatGfatherLanguageOther())))
				&& ((this.getPatGmotherEthnicity() == castOther
						.getPatGmotherEthnicity()) || (this
						.getPatGmotherEthnicity() != null
						&& castOther.getPatGmotherEthnicity() != null && this
						.getPatGmotherEthnicity().equals(
								castOther.getPatGmotherEthnicity())))
				&& ((this.getPatGmotherEthnicityOther() == castOther
						.getPatGmotherEthnicityOther()) || (this
						.getPatGmotherEthnicityOther() != null
						&& castOther.getPatGmotherEthnicityOther() != null && this
						.getPatGmotherEthnicityOther().equals(
								castOther.getPatGmotherEthnicityOther())))
				&& ((this.getPatGmotherLanguage() == castOther
						.getPatGmotherLanguage()) || (this
						.getPatGmotherLanguage() != null
						&& castOther.getPatGmotherLanguage() != null && this
						.getPatGmotherLanguage().equals(
								castOther.getPatGmotherLanguage())))
				&& ((this.getPatGmotherLanguageOther() == castOther
						.getPatGmotherLanguageOther()) || (this
						.getPatGmotherLanguageOther() != null
						&& castOther.getPatGmotherLanguageOther() != null && this
						.getPatGmotherLanguageOther().equals(
								castOther.getPatGmotherLanguageOther())))
				&& ((this.getMotherEthnicity() == castOther
						.getMotherEthnicity()) || (this.getMotherEthnicity() != null
						&& castOther.getMotherEthnicity() != null && this
						.getMotherEthnicity().equals(
								castOther.getMotherEthnicity())))
				&& ((this.getMotherEthnicityOther() == castOther
						.getMotherEthnicityOther()) || (this
						.getMotherEthnicityOther() != null
						&& castOther.getMotherEthnicityOther() != null && this
						.getMotherEthnicityOther().equals(
								castOther.getMotherEthnicityOther())))
				&& ((this.getMotherLanguage() == castOther.getMotherLanguage()) || (this
						.getMotherLanguage() != null
						&& castOther.getMotherLanguage() != null && this
						.getMotherLanguage().equals(
								castOther.getMotherLanguage())))
				&& ((this.getMotherLanguageOther() == castOther
						.getMotherLanguageOther()) || (this
						.getMotherLanguageOther() != null
						&& castOther.getMotherLanguageOther() != null && this
						.getMotherLanguageOther().equals(
								castOther.getMotherLanguageOther())))
				&& ((this.getMatGfatherEthnicity() == castOther
						.getMatGfatherEthnicity()) || (this
						.getMatGfatherEthnicity() != null
						&& castOther.getMatGfatherEthnicity() != null && this
						.getMatGfatherEthnicity().equals(
								castOther.getMatGfatherEthnicity())))
				&& ((this.getMatGfatherEthnicityOther() == castOther
						.getMatGfatherEthnicityOther()) || (this
						.getMatGfatherEthnicityOther() != null
						&& castOther.getMatGfatherEthnicityOther() != null && this
						.getMatGfatherEthnicityOther().equals(
								castOther.getMatGfatherEthnicityOther())))
				&& ((this.getMatGfatherLanguage() == castOther
						.getMatGfatherLanguage()) || (this
						.getMatGfatherLanguage() != null
						&& castOther.getMatGfatherLanguage() != null && this
						.getMatGfatherLanguage().equals(
								castOther.getMatGfatherLanguage())))
				&& ((this.getMatGfatherLanguageOther() == castOther
						.getMatGfatherLanguageOther()) || (this
						.getMatGfatherLanguageOther() != null
						&& castOther.getMatGfatherLanguageOther() != null && this
						.getMatGfatherLanguageOther().equals(
								castOther.getMatGfatherLanguageOther())))
				&& ((this.getMatGmotherEthnicity() == castOther
						.getMatGmotherEthnicity()) || (this
						.getMatGmotherEthnicity() != null
						&& castOther.getMatGmotherEthnicity() != null && this
						.getMatGmotherEthnicity().equals(
								castOther.getMatGmotherEthnicity())))
				&& ((this.getMatGmotherEthnicityOther() == castOther
						.getMatGmotherEthnicityOther()) || (this
						.getMatGmotherEthnicityOther() != null
						&& castOther.getMatGmotherEthnicityOther() != null && this
						.getMatGmotherEthnicityOther().equals(
								castOther.getMatGmotherEthnicityOther())))
				&& ((this.getMatGmotherLanguage() == castOther
						.getMatGmotherLanguage()) || (this
						.getMatGmotherLanguage() != null
						&& castOther.getMatGmotherLanguage() != null && this
						.getMatGmotherLanguage().equals(
								castOther.getMatGmotherLanguage())))
				&& ((this.getMatGmotherLanguageOther() == castOther
						.getMatGmotherLanguageOther()) || (this
						.getMatGmotherLanguageOther() != null
						&& castOther.getMatGmotherLanguageOther() != null && this
						.getMatGmotherLanguageOther().equals(
								castOther.getMatGmotherLanguageOther())))
				&& ((this.getSiblings() == castOther.getSiblings()) || (this
						.getSiblings() != null
						&& castOther.getSiblings() != null && this
						.getSiblings().equals(castOther.getSiblings())))
				&& ((this.getNumberOfBrothers() == castOther
						.getNumberOfBrothers()) || (this.getNumberOfBrothers() != null
						&& castOther.getNumberOfBrothers() != null && this
						.getNumberOfBrothers().equals(
								castOther.getNumberOfBrothers())))
				&& ((this.getNumberOfSisters() == castOther
						.getNumberOfSisters()) || (this.getNumberOfSisters() != null
						&& castOther.getNumberOfSisters() != null && this
						.getNumberOfSisters().equals(
								castOther.getNumberOfSisters())))
				&& ((this.getChildren() == castOther.getChildren()) || (this
						.getChildren() != null
						&& castOther.getChildren() != null && this
						.getChildren().equals(castOther.getChildren())))
				&& ((this.getNumberOfSons() == castOther.getNumberOfSons()) || (this
						.getNumberOfSons() != null
						&& castOther.getNumberOfSons() != null && this
						.getNumberOfSons().equals(castOther.getNumberOfSons())))
				&& ((this.getNumberOfDaughters() == castOther
						.getNumberOfDaughters()) || (this
						.getNumberOfDaughters() != null
						&& castOther.getNumberOfDaughters() != null && this
						.getNumberOfDaughters().equals(
								castOther.getNumberOfDaughters())))
				&& ((this.getPregnant() == castOther.getPregnant()) || (this
						.getPregnant() != null
						&& castOther.getPregnant() != null && this
						.getPregnant().equals(castOther.getPregnant())))
				&& ((this.getNumberOfPregnancies() == castOther
						.getNumberOfPregnancies()) || (this
						.getNumberOfPregnancies() != null
						&& castOther.getNumberOfPregnancies() != null && this
						.getNumberOfPregnancies().equals(
								castOther.getNumberOfPregnancies())))
				&& ((this.getNumberOfLiveBirths() == castOther
						.getNumberOfLiveBirths()) || (this
						.getNumberOfLiveBirths() != null
						&& castOther.getNumberOfLiveBirths() != null && this
						.getNumberOfLiveBirths().equals(
								castOther.getNumberOfLiveBirths())))
				&& ((this.getRegularPeriods() == castOther.getRegularPeriods()) || (this
						.getRegularPeriods() != null
						&& castOther.getRegularPeriods() != null && this
						.getRegularPeriods().equals(
								castOther.getRegularPeriods())))
				&& ((this.getLastPeriod() == castOther.getLastPeriod()) || (this
						.getLastPeriod() != null
						&& castOther.getLastPeriod() != null && this
						.getLastPeriod().equals(castOther.getLastPeriod())))
				&& ((this.getMaritalStatus() == castOther.getMaritalStatus()) || (this
						.getMaritalStatus() != null
						&& castOther.getMaritalStatus() != null && this
						.getMaritalStatus()
						.equals(castOther.getMaritalStatus())))
				&& ((this.getHighestLevelOfEducation() == castOther
						.getHighestLevelOfEducation()) || (this
						.getHighestLevelOfEducation() != null
						&& castOther.getHighestLevelOfEducation() != null && this
						.getHighestLevelOfEducation().equals(
								castOther.getHighestLevelOfEducation())))
				&& ((this.getYearsHighestEducation() == castOther
						.getYearsHighestEducation()) || (this
						.getYearsHighestEducation() != null
						&& castOther.getYearsHighestEducation() != null && this
						.getYearsHighestEducation().equals(
								castOther.getYearsHighestEducation())))
				&& ((this.getOccupation() == castOther.getOccupation()) || (this
						.getOccupation() != null
						&& castOther.getOccupation() != null && this
						.getOccupation().equals(castOther.getOccupation())))
				&& ((this.getHouseholdSize() == castOther.getHouseholdSize()) || (this
						.getHouseholdSize() != null
						&& castOther.getHouseholdSize() != null && this
						.getHouseholdSize()
						.equals(castOther.getHouseholdSize())))
				&& ((this.getPerson1Sex() == castOther.getPerson1Sex()) || (this
						.getPerson1Sex() != null
						&& castOther.getPerson1Sex() != null && this
						.getPerson1Sex().equals(castOther.getPerson1Sex())))
				&& ((this.getPerson1Age() == castOther.getPerson1Age()) || (this
						.getPerson1Age() != null
						&& castOther.getPerson1Age() != null && this
						.getPerson1Age().equals(castOther.getPerson1Age())))
				&& ((this.getPerson1Relationship() == castOther
						.getPerson1Relationship()) || (this
						.getPerson1Relationship() != null
						&& castOther.getPerson1Relationship() != null && this
						.getPerson1Relationship().equals(
								castOther.getPerson1Relationship())))
				&& ((this.getPerson2Sex() == castOther.getPerson2Sex()) || (this
						.getPerson2Sex() != null
						&& castOther.getPerson2Sex() != null && this
						.getPerson2Sex().equals(castOther.getPerson2Sex())))
				&& ((this.getPerson2Age() == castOther.getPerson2Age()) || (this
						.getPerson2Age() != null
						&& castOther.getPerson2Age() != null && this
						.getPerson2Age().equals(castOther.getPerson2Age())))
				&& ((this.getPerson2Relationship() == castOther
						.getPerson2Relationship()) || (this
						.getPerson2Relationship() != null
						&& castOther.getPerson2Relationship() != null && this
						.getPerson2Relationship().equals(
								castOther.getPerson2Relationship())))
				&& ((this.getPerson3Sex() == castOther.getPerson3Sex()) || (this
						.getPerson3Sex() != null
						&& castOther.getPerson3Sex() != null && this
						.getPerson3Sex().equals(castOther.getPerson3Sex())))
				&& ((this.getPerson3Age() == castOther.getPerson3Age()) || (this
						.getPerson3Age() != null
						&& castOther.getPerson3Age() != null && this
						.getPerson3Age().equals(castOther.getPerson3Age())))
				&& ((this.getPerson3Relationship() == castOther
						.getPerson3Relationship()) || (this
						.getPerson3Relationship() != null
						&& castOther.getPerson3Relationship() != null && this
						.getPerson3Relationship().equals(
								castOther.getPerson3Relationship())))
				&& ((this.getPerson4Sex() == castOther.getPerson4Sex()) || (this
						.getPerson4Sex() != null
						&& castOther.getPerson4Sex() != null && this
						.getPerson4Sex().equals(castOther.getPerson4Sex())))
				&& ((this.getPerson4Age() == castOther.getPerson4Age()) || (this
						.getPerson4Age() != null
						&& castOther.getPerson4Age() != null && this
						.getPerson4Age().equals(castOther.getPerson4Age())))
				&& ((this.getPerson4Relationship() == castOther
						.getPerson4Relationship()) || (this
						.getPerson4Relationship() != null
						&& castOther.getPerson4Relationship() != null && this
						.getPerson4Relationship().equals(
								castOther.getPerson4Relationship())))
				&& ((this.getPerson5Sex() == castOther.getPerson5Sex()) || (this
						.getPerson5Sex() != null
						&& castOther.getPerson5Sex() != null && this
						.getPerson5Sex().equals(castOther.getPerson5Sex())))
				&& ((this.getPerson5Age() == castOther.getPerson5Age()) || (this
						.getPerson5Age() != null
						&& castOther.getPerson5Age() != null && this
						.getPerson5Age().equals(castOther.getPerson5Age())))
				&& ((this.getPerson5Relationship() == castOther
						.getPerson5Relationship()) || (this
						.getPerson5Relationship() != null
						&& castOther.getPerson5Relationship() != null && this
						.getPerson5Relationship().equals(
								castOther.getPerson5Relationship())))
				&& ((this.getPerson6Sex() == castOther.getPerson6Sex()) || (this
						.getPerson6Sex() != null
						&& castOther.getPerson6Sex() != null && this
						.getPerson6Sex().equals(castOther.getPerson6Sex())))
				&& ((this.getPerson6Age() == castOther.getPerson6Age()) || (this
						.getPerson6Age() != null
						&& castOther.getPerson6Age() != null && this
						.getPerson6Age().equals(castOther.getPerson6Age())))
				&& ((this.getPerson6Relationship() == castOther
						.getPerson6Relationship()) || (this
						.getPerson6Relationship() != null
						&& castOther.getPerson6Relationship() != null && this
						.getPerson6Relationship().equals(
								castOther.getPerson6Relationship())))
				&& ((this.getPerson7Sex() == castOther.getPerson7Sex()) || (this
						.getPerson7Sex() != null
						&& castOther.getPerson7Sex() != null && this
						.getPerson7Sex().equals(castOther.getPerson7Sex())))
				&& ((this.getPerson7Age() == castOther.getPerson7Age()) || (this
						.getPerson7Age() != null
						&& castOther.getPerson7Age() != null && this
						.getPerson7Age().equals(castOther.getPerson7Age())))
				&& ((this.getPerson7Relationship() == castOther
						.getPerson7Relationship()) || (this
						.getPerson7Relationship() != null
						&& castOther.getPerson7Relationship() != null && this
						.getPerson7Relationship().equals(
								castOther.getPerson7Relationship())))
				&& ((this.getPerson8Sex() == castOther.getPerson8Sex()) || (this
						.getPerson8Sex() != null
						&& castOther.getPerson8Sex() != null && this
						.getPerson8Sex().equals(castOther.getPerson8Sex())))
				&& ((this.getPerson8Age() == castOther.getPerson8Age()) || (this
						.getPerson8Age() != null
						&& castOther.getPerson8Age() != null && this
						.getPerson8Age().equals(castOther.getPerson8Age())))
				&& ((this.getPerson8Relationship() == castOther
						.getPerson8Relationship()) || (this
						.getPerson8Relationship() != null
						&& castOther.getPerson8Relationship() != null && this
						.getPerson8Relationship().equals(
								castOther.getPerson8Relationship())))
				&& ((this.getPerson9Sex() == castOther.getPerson9Sex()) || (this
						.getPerson9Sex() != null
						&& castOther.getPerson9Sex() != null && this
						.getPerson9Sex().equals(castOther.getPerson9Sex())))
				&& ((this.getPerson9Age() == castOther.getPerson9Age()) || (this
						.getPerson9Age() != null
						&& castOther.getPerson9Age() != null && this
						.getPerson9Age().equals(castOther.getPerson9Age())))
				&& ((this.getPerson9Relationship() == castOther
						.getPerson9Relationship()) || (this
						.getPerson9Relationship() != null
						&& castOther.getPerson9Relationship() != null && this
						.getPerson9Relationship().equals(
								castOther.getPerson9Relationship())))
				&& ((this.getPerson10Sex() == castOther.getPerson10Sex()) || (this
						.getPerson10Sex() != null
						&& castOther.getPerson10Sex() != null && this
						.getPerson10Sex().equals(castOther.getPerson10Sex())))
				&& ((this.getPerson10Age() == castOther.getPerson10Age()) || (this
						.getPerson10Age() != null
						&& castOther.getPerson10Age() != null && this
						.getPerson10Age().equals(castOther.getPerson10Age())))
				&& ((this.getPerson10Relationship() == castOther
						.getPerson10Relationship()) || (this
						.getPerson10Relationship() != null
						&& castOther.getPerson10Relationship() != null && this
						.getPerson10Relationship().equals(
								castOther.getPerson10Relationship())))
				&& ((this.getPerson11Sex() == castOther.getPerson11Sex()) || (this
						.getPerson11Sex() != null
						&& castOther.getPerson11Sex() != null && this
						.getPerson11Sex().equals(castOther.getPerson11Sex())))
				&& ((this.getPerson11Age() == castOther.getPerson11Age()) || (this
						.getPerson11Age() != null
						&& castOther.getPerson11Age() != null && this
						.getPerson11Age().equals(castOther.getPerson11Age())))
				&& ((this.getPerson11Relationship() == castOther
						.getPerson11Relationship()) || (this
						.getPerson11Relationship() != null
						&& castOther.getPerson11Relationship() != null && this
						.getPerson11Relationship().equals(
								castOther.getPerson11Relationship())))
				&& ((this.getPerson12Age() == castOther.getPerson12Age()) || (this
						.getPerson12Age() != null
						&& castOther.getPerson12Age() != null && this
						.getPerson12Age().equals(castOther.getPerson12Age())))
				&& ((this.getPerson12Sex() == castOther.getPerson12Sex()) || (this
						.getPerson12Sex() != null
						&& castOther.getPerson12Sex() != null && this
						.getPerson12Sex().equals(castOther.getPerson12Sex())))
				&& ((this.getPerson12Relationship() == castOther
						.getPerson12Relationship()) || (this
						.getPerson12Relationship() != null
						&& castOther.getPerson12Relationship() != null && this
						.getPerson12Relationship().equals(
								castOther.getPerson12Relationship())))
				&& ((this.getPerson13Age() == castOther.getPerson13Age()) || (this
						.getPerson13Age() != null
						&& castOther.getPerson13Age() != null && this
						.getPerson13Age().equals(castOther.getPerson13Age())))
				&& ((this.getPerson13Sex() == castOther.getPerson13Sex()) || (this
						.getPerson13Sex() != null
						&& castOther.getPerson13Sex() != null && this
						.getPerson13Sex().equals(castOther.getPerson13Sex())))
				&& ((this.getPerson13Relationship() == castOther
						.getPerson13Relationship()) || (this
						.getPerson13Relationship() != null
						&& castOther.getPerson13Relationship() != null && this
						.getPerson13Relationship().equals(
								castOther.getPerson13Relationship())))
				&& ((this.getPerson14Age() == castOther.getPerson14Age()) || (this
						.getPerson14Age() != null
						&& castOther.getPerson14Age() != null && this
						.getPerson14Age().equals(castOther.getPerson14Age())))
				&& ((this.getPerson14Sex() == castOther.getPerson14Sex()) || (this
						.getPerson14Sex() != null
						&& castOther.getPerson14Sex() != null && this
						.getPerson14Sex().equals(castOther.getPerson14Sex())))
				&& ((this.getPerson14Relationship() == castOther
						.getPerson14Relationship()) || (this
						.getPerson14Relationship() != null
						&& castOther.getPerson14Relationship() != null && this
						.getPerson14Relationship().equals(
								castOther.getPerson14Relationship())))
				&& ((this.getPerson15Age() == castOther.getPerson15Age()) || (this
						.getPerson15Age() != null
						&& castOther.getPerson15Age() != null && this
						.getPerson15Age().equals(castOther.getPerson15Age())))
				&& ((this.getPerson15Sex() == castOther.getPerson15Sex()) || (this
						.getPerson15Sex() != null
						&& castOther.getPerson15Sex() != null && this
						.getPerson15Sex().equals(castOther.getPerson15Sex())))
				&& ((this.getPerson15Relationship() == castOther
						.getPerson15Relationship()) || (this
						.getPerson15Relationship() != null
						&& castOther.getPerson15Relationship() != null && this
						.getPerson15Relationship().equals(
								castOther.getPerson15Relationship())))
				&& ((this.getPerson16Age() == castOther.getPerson16Age()) || (this
						.getPerson16Age() != null
						&& castOther.getPerson16Age() != null && this
						.getPerson16Age().equals(castOther.getPerson16Age())))
				&& ((this.getPerson16Sex() == castOther.getPerson16Sex()) || (this
						.getPerson16Sex() != null
						&& castOther.getPerson16Sex() != null && this
						.getPerson16Sex().equals(castOther.getPerson16Sex())))
				&& ((this.getPerson16Relationship() == castOther
						.getPerson16Relationship()) || (this
						.getPerson16Relationship() != null
						&& castOther.getPerson16Relationship() != null && this
						.getPerson16Relationship().equals(
								castOther.getPerson16Relationship())))
				&& ((this.getPerson17Age() == castOther.getPerson17Age()) || (this
						.getPerson17Age() != null
						&& castOther.getPerson17Age() != null && this
						.getPerson17Age().equals(castOther.getPerson17Age())))
				&& ((this.getPerson17Sex() == castOther.getPerson17Sex()) || (this
						.getPerson17Sex() != null
						&& castOther.getPerson17Sex() != null && this
						.getPerson17Sex().equals(castOther.getPerson17Sex())))
				&& ((this.getPerson17Relationship() == castOther
						.getPerson17Relationship()) || (this
						.getPerson17Relationship() != null
						&& castOther.getPerson17Relationship() != null && this
						.getPerson17Relationship().equals(
								castOther.getPerson17Relationship())))
				&& ((this.getPerson18Age() == castOther.getPerson18Age()) || (this
						.getPerson18Age() != null
						&& castOther.getPerson18Age() != null && this
						.getPerson18Age().equals(castOther.getPerson18Age())))
				&& ((this.getPerson18Sex() == castOther.getPerson18Sex()) || (this
						.getPerson18Sex() != null
						&& castOther.getPerson18Sex() != null && this
						.getPerson18Sex().equals(castOther.getPerson18Sex())))
				&& ((this.getPerson18Relationship() == castOther
						.getPerson18Relationship()) || (this
						.getPerson18Relationship() != null
						&& castOther.getPerson18Relationship() != null && this
						.getPerson18Relationship().equals(
								castOther.getPerson18Relationship())))
				&& ((this.getPerson19Age() == castOther.getPerson19Age()) || (this
						.getPerson19Age() != null
						&& castOther.getPerson19Age() != null && this
						.getPerson19Age().equals(castOther.getPerson19Age())))
				&& ((this.getPerson19Sex() == castOther.getPerson19Sex()) || (this
						.getPerson19Sex() != null
						&& castOther.getPerson19Sex() != null && this
						.getPerson19Sex().equals(castOther.getPerson19Sex())))
				&& ((this.getPerson19Relationship() == castOther
						.getPerson19Relationship()) || (this
						.getPerson19Relationship() != null
						&& castOther.getPerson19Relationship() != null && this
						.getPerson19Relationship().equals(
								castOther.getPerson19Relationship())))
				&& ((this.getPerson20Age() == castOther.getPerson20Age()) || (this
						.getPerson20Age() != null
						&& castOther.getPerson20Age() != null && this
						.getPerson20Age().equals(castOther.getPerson20Age())))
				&& ((this.getPerson20Sex() == castOther.getPerson20Sex()) || (this
						.getPerson20Sex() != null
						&& castOther.getPerson20Sex() != null && this
						.getPerson20Sex().equals(castOther.getPerson20Sex())))
				&& ((this.getPerson20Relationship() == castOther
						.getPerson20Relationship()) || (this
						.getPerson20Relationship() != null
						&& castOther.getPerson20Relationship() != null && this
						.getPerson20Relationship().equals(
								castOther.getPerson20Relationship())))
				&& ((this.getPerson21Age() == castOther.getPerson21Age()) || (this
						.getPerson21Age() != null
						&& castOther.getPerson21Age() != null && this
						.getPerson21Age().equals(castOther.getPerson21Age())))
				&& ((this.getPerson21Sex() == castOther.getPerson21Sex()) || (this
						.getPerson21Sex() != null
						&& castOther.getPerson21Sex() != null && this
						.getPerson21Sex().equals(castOther.getPerson21Sex())))
				&& ((this.getPerson21Relationship() == castOther
						.getPerson21Relationship()) || (this
						.getPerson21Relationship() != null
						&& castOther.getPerson21Relationship() != null && this
						.getPerson21Relationship().equals(
								castOther.getPerson21Relationship())))
				&& ((this.getPerson22Age() == castOther.getPerson22Age()) || (this
						.getPerson22Age() != null
						&& castOther.getPerson22Age() != null && this
						.getPerson22Age().equals(castOther.getPerson22Age())))
				&& ((this.getPerson22Sex() == castOther.getPerson22Sex()) || (this
						.getPerson22Sex() != null
						&& castOther.getPerson22Sex() != null && this
						.getPerson22Sex().equals(castOther.getPerson22Sex())))
				&& ((this.getPerson22Relationship() == castOther
						.getPerson22Relationship()) || (this
						.getPerson22Relationship() != null
						&& castOther.getPerson22Relationship() != null && this
						.getPerson22Relationship().equals(
								castOther.getPerson22Relationship())))
				&& ((this.getPerson23Age() == castOther.getPerson23Age()) || (this
						.getPerson23Age() != null
						&& castOther.getPerson23Age() != null && this
						.getPerson23Age().equals(castOther.getPerson23Age())))
				&& ((this.getPerson23Sex() == castOther.getPerson23Sex()) || (this
						.getPerson23Sex() != null
						&& castOther.getPerson23Sex() != null && this
						.getPerson23Sex().equals(castOther.getPerson23Sex())))
				&& ((this.getPerson23Relationship() == castOther
						.getPerson23Relationship()) || (this
						.getPerson23Relationship() != null
						&& castOther.getPerson23Relationship() != null && this
						.getPerson23Relationship().equals(
								castOther.getPerson23Relationship())))
				&& ((this.getPerson24Age() == castOther.getPerson24Age()) || (this
						.getPerson24Age() != null
						&& castOther.getPerson24Age() != null && this
						.getPerson24Age().equals(castOther.getPerson24Age())))
				&& ((this.getPerson24Sex() == castOther.getPerson24Sex()) || (this
						.getPerson24Sex() != null
						&& castOther.getPerson24Sex() != null && this
						.getPerson24Sex().equals(castOther.getPerson24Sex())))
				&& ((this.getPerson24Relationship() == castOther
						.getPerson24Relationship()) || (this
						.getPerson24Relationship() != null
						&& castOther.getPerson24Relationship() != null && this
						.getPerson24Relationship().equals(
								castOther.getPerson24Relationship())))
				&& ((this.getPerson25Age() == castOther.getPerson25Age()) || (this
						.getPerson25Age() != null
						&& castOther.getPerson25Age() != null && this
						.getPerson25Age().equals(castOther.getPerson25Age())))
				&& ((this.getPerson25Sex() == castOther.getPerson25Sex()) || (this
						.getPerson25Sex() != null
						&& castOther.getPerson25Sex() != null && this
						.getPerson25Sex().equals(castOther.getPerson25Sex())))
				&& ((this.getPerson25Relationship() == castOther
						.getPerson25Relationship()) || (this
						.getPerson25Relationship() != null
						&& castOther.getPerson25Relationship() != null && this
						.getPerson25Relationship().equals(
								castOther.getPerson25Relationship())))
				&& ((this.getPerson26Age() == castOther.getPerson26Age()) || (this
						.getPerson26Age() != null
						&& castOther.getPerson26Age() != null && this
						.getPerson26Age().equals(castOther.getPerson26Age())))
				&& ((this.getPerson26Sex() == castOther.getPerson26Sex()) || (this
						.getPerson26Sex() != null
						&& castOther.getPerson26Sex() != null && this
						.getPerson26Sex().equals(castOther.getPerson26Sex())))
				&& ((this.getPerson26Relationship() == castOther
						.getPerson26Relationship()) || (this
						.getPerson26Relationship() != null
						&& castOther.getPerson26Relationship() != null && this
						.getPerson26Relationship().equals(
								castOther.getPerson26Relationship())))
				&& ((this.getPerson27Age() == castOther.getPerson27Age()) || (this
						.getPerson27Age() != null
						&& castOther.getPerson27Age() != null && this
						.getPerson27Age().equals(castOther.getPerson27Age())))
				&& ((this.getPerson27Sex() == castOther.getPerson27Sex()) || (this
						.getPerson27Sex() != null
						&& castOther.getPerson27Sex() != null && this
						.getPerson27Sex().equals(castOther.getPerson27Sex())))
				&& ((this.getPerson27Relationship() == castOther
						.getPerson27Relationship()) || (this
						.getPerson27Relationship() != null
						&& castOther.getPerson27Relationship() != null && this
						.getPerson27Relationship().equals(
								castOther.getPerson27Relationship())))
				&& ((this.getPerson28Age() == castOther.getPerson28Age()) || (this
						.getPerson28Age() != null
						&& castOther.getPerson28Age() != null && this
						.getPerson28Age().equals(castOther.getPerson28Age())))
				&& ((this.getPerson28Sex() == castOther.getPerson28Sex()) || (this
						.getPerson28Sex() != null
						&& castOther.getPerson28Sex() != null && this
						.getPerson28Sex().equals(castOther.getPerson28Sex())))
				&& ((this.getPerson28Relationship() == castOther
						.getPerson28Relationship()) || (this
						.getPerson28Relationship() != null
						&& castOther.getPerson28Relationship() != null && this
						.getPerson28Relationship().equals(
								castOther.getPerson28Relationship())))
				&& ((this.getPerson29Age() == castOther.getPerson29Age()) || (this
						.getPerson29Age() != null
						&& castOther.getPerson29Age() != null && this
						.getPerson29Age().equals(castOther.getPerson29Age())))
				&& ((this.getPerson29Sex() == castOther.getPerson29Sex()) || (this
						.getPerson29Sex() != null
						&& castOther.getPerson29Sex() != null && this
						.getPerson29Sex().equals(castOther.getPerson29Sex())))
				&& ((this.getPerson29Relationship() == castOther
						.getPerson29Relationship()) || (this
						.getPerson29Relationship() != null
						&& castOther.getPerson29Relationship() != null && this
						.getPerson29Relationship().equals(
								castOther.getPerson29Relationship())))
				&& ((this.getPerson30Age() == castOther.getPerson30Age()) || (this
						.getPerson30Age() != null
						&& castOther.getPerson30Age() != null && this
						.getPerson30Age().equals(castOther.getPerson30Age())))
				&& ((this.getPerson30Sex() == castOther.getPerson30Sex()) || (this
						.getPerson30Sex() != null
						&& castOther.getPerson30Sex() != null && this
						.getPerson30Sex().equals(castOther.getPerson30Sex())))
				&& ((this.getPerson30Relationship() == castOther
						.getPerson30Relationship()) || (this
						.getPerson30Relationship() != null
						&& castOther.getPerson30Relationship() != null && this
						.getPerson30Relationship().equals(
								castOther.getPerson30Relationship())))
				&& ((this.getNumberOfRooms() == castOther.getNumberOfRooms()) || (this
						.getNumberOfRooms() != null
						&& castOther.getNumberOfRooms() != null && this
						.getNumberOfRooms()
						.equals(castOther.getNumberOfRooms())))
				&& ((this.getNumberOfBedrooms() == castOther
						.getNumberOfBedrooms()) || (this.getNumberOfBedrooms() != null
						&& castOther.getNumberOfBedrooms() != null && this
						.getNumberOfBedrooms().equals(
								castOther.getNumberOfBedrooms())))
				&& ((this.getElectricity() == castOther.getElectricity()) || (this
						.getElectricity() != null
						&& castOther.getElectricity() != null && this
						.getElectricity().equals(castOther.getElectricity())))
				&& ((this.getSolarEnergy() == castOther.getSolarEnergy()) || (this
						.getSolarEnergy() != null
						&& castOther.getSolarEnergy() != null && this
						.getSolarEnergy().equals(castOther.getSolarEnergy())))
				&& ((this.getPowerGenerator() == castOther.getPowerGenerator()) || (this
						.getPowerGenerator() != null
						&& castOther.getPowerGenerator() != null && this
						.getPowerGenerator().equals(
								castOther.getPowerGenerator())))
				&& ((this.getAlternativePowerSource() == castOther
						.getAlternativePowerSource()) || (this
						.getAlternativePowerSource() != null
						&& castOther.getAlternativePowerSource() != null && this
						.getAlternativePowerSource().equals(
								castOther.getAlternativePowerSource())))
				&& ((this.getTelevision() == castOther.getTelevision()) || (this
						.getTelevision() != null
						&& castOther.getTelevision() != null && this
						.getTelevision().equals(castOther.getTelevision())))
				&& ((this.getRadio() == castOther.getRadio()) || (this
						.getRadio() != null && castOther.getRadio() != null && this
						.getRadio().equals(castOther.getRadio())))
				&& ((this.getMotorVehicle() == castOther.getMotorVehicle()) || (this
						.getMotorVehicle() != null
						&& castOther.getMotorVehicle() != null && this
						.getMotorVehicle().equals(castOther.getMotorVehicle())))
				&& ((this.getMotorcycle() == castOther.getMotorcycle()) || (this
						.getMotorcycle() != null
						&& castOther.getMotorcycle() != null && this
						.getMotorcycle().equals(castOther.getMotorcycle())))
				&& ((this.getBicycle() == castOther.getBicycle()) || (this
						.getBicycle() != null && castOther.getBicycle() != null && this
						.getBicycle().equals(castOther.getBicycle())))
				&& ((this.getRefrigerator() == castOther.getRefrigerator()) || (this
						.getRefrigerator() != null
						&& castOther.getRefrigerator() != null && this
						.getRefrigerator().equals(castOther.getRefrigerator())))
				&& ((this.getWashingMachine() == castOther.getWashingMachine()) || (this
						.getWashingMachine() != null
						&& castOther.getWashingMachine() != null && this
						.getWashingMachine().equals(
								castOther.getWashingMachine())))
				&& ((this.getSewingMachine() == castOther.getSewingMachine()) || (this
						.getSewingMachine() != null
						&& castOther.getSewingMachine() != null && this
						.getSewingMachine()
						.equals(castOther.getSewingMachine())))
				&& ((this.getTelephone() == castOther.getTelephone()) || (this
						.getTelephone() != null
						&& castOther.getTelephone() != null && this
						.getTelephone().equals(castOther.getTelephone())))
				&& ((this.getMobilePhone() == castOther.getMobilePhone()) || (this
						.getMobilePhone() != null
						&& castOther.getMobilePhone() != null && this
						.getMobilePhone().equals(castOther.getMobilePhone())))
				&& ((this.getMicrowave() == castOther.getMicrowave()) || (this
						.getMicrowave() != null
						&& castOther.getMicrowave() != null && this
						.getMicrowave().equals(castOther.getMicrowave())))
				&& ((this.getDvdPlayer() == castOther.getDvdPlayer()) || (this
						.getDvdPlayer() != null
						&& castOther.getDvdPlayer() != null && this
						.getDvdPlayer().equals(castOther.getDvdPlayer())))
				&& ((this.getSatelliteTvOrDstv() == castOther
						.getSatelliteTvOrDstv()) || (this
						.getSatelliteTvOrDstv() != null
						&& castOther.getSatelliteTvOrDstv() != null && this
						.getSatelliteTvOrDstv().equals(
								castOther.getSatelliteTvOrDstv())))
				&& ((this.getComputerOrLaptop() == castOther
						.getComputerOrLaptop()) || (this.getComputerOrLaptop() != null
						&& castOther.getComputerOrLaptop() != null && this
						.getComputerOrLaptop().equals(
								castOther.getComputerOrLaptop())))
				&& ((this.getInternetByComputer() == castOther
						.getInternetByComputer()) || (this
						.getInternetByComputer() != null
						&& castOther.getInternetByComputer() != null && this
						.getInternetByComputer().equals(
								castOther.getInternetByComputer())))
				&& ((this.getInternetByMobilePhone() == castOther
						.getInternetByMobilePhone()) || (this
						.getInternetByMobilePhone() != null
						&& castOther.getInternetByMobilePhone() != null && this
						.getInternetByMobilePhone().equals(
								castOther.getInternetByMobilePhone())))
				&& ((this.getElectricIron() == castOther.getElectricIron()) || (this
						.getElectricIron() != null
						&& castOther.getElectricIron() != null && this
						.getElectricIron().equals(castOther.getElectricIron())))
				&& ((this.getFan() == castOther.getFan()) || (this.getFan() != null
						&& castOther.getFan() != null && this.getFan().equals(
						castOther.getFan())))
				&& ((this.getElectricOrGasStove() == castOther
						.getElectricOrGasStove()) || (this
						.getElectricOrGasStove() != null
						&& castOther.getElectricOrGasStove() != null && this
						.getElectricOrGasStove().equals(
								castOther.getElectricOrGasStove())))
				&& ((this.getKeroseneStove() == castOther.getKeroseneStove()) || (this
						.getKeroseneStove() != null
						&& castOther.getKeroseneStove() != null && this
						.getKeroseneStove()
						.equals(castOther.getKeroseneStove())))
				&& ((this.getPlateGas() == castOther.getPlateGas()) || (this
						.getPlateGas() != null
						&& castOther.getPlateGas() != null && this
						.getPlateGas().equals(castOther.getPlateGas())))
				&& ((this.getElectricPlate() == castOther.getElectricPlate()) || (this
						.getElectricPlate() != null
						&& castOther.getElectricPlate() != null && this
						.getElectricPlate()
						.equals(castOther.getElectricPlate())))
				&& ((this.getTorch() == castOther.getTorch()) || (this
						.getTorch() != null && castOther.getTorch() != null && this
						.getTorch().equals(castOther.getTorch())))
				&& ((this.getGasLamp() == castOther.getGasLamp()) || (this
						.getGasLamp() != null && castOther.getGasLamp() != null && this
						.getGasLamp().equals(castOther.getGasLamp())))
				&& ((this.getKeroseneLampWithGlass() == castOther
						.getKeroseneLampWithGlass()) || (this
						.getKeroseneLampWithGlass() != null
						&& castOther.getKeroseneLampWithGlass() != null && this
						.getKeroseneLampWithGlass().equals(
								castOther.getKeroseneLampWithGlass())))
				&& ((this.getToiletFacilities() == castOther
						.getToiletFacilities()) || (this.getToiletFacilities() != null
						&& castOther.getToiletFacilities() != null && this
						.getToiletFacilities().equals(
								castOther.getToiletFacilities())))
				&& ((this.getPortableWater() == castOther.getPortableWater()) || (this
						.getPortableWater() != null
						&& castOther.getPortableWater() != null && this
						.getPortableWater()
						.equals(castOther.getPortableWater())))
				&& ((this.getGrindingMill() == castOther.getGrindingMill()) || (this
						.getGrindingMill() != null
						&& castOther.getGrindingMill() != null && this
						.getGrindingMill().equals(castOther.getGrindingMill())))
				&& ((this.getTableh() == castOther.getTableh()) || (this
						.getTableh() != null && castOther.getTableh() != null && this
						.getTableh().equals(castOther.getTableh())))
				&& ((this.getSofaSet() == castOther.getSofaSet()) || (this
						.getSofaSet() != null && castOther.getSofaSet() != null && this
						.getSofaSet().equals(castOther.getSofaSet())))
				&& ((this.getWallClock() == castOther.getWallClock()) || (this
						.getWallClock() != null
						&& castOther.getWallClock() != null && this
						.getWallClock().equals(castOther.getWallClock())))
				&& ((this.getBed() == castOther.getBed()) || (this.getBed() != null
						&& castOther.getBed() != null && this.getBed().equals(
						castOther.getBed())))
				&& ((this.getMattress() == castOther.getMattress()) || (this
						.getMattress() != null
						&& castOther.getMattress() != null && this
						.getMattress().equals(castOther.getMattress())))
				&& ((this.getBlankets() == castOther.getBlankets()) || (this
						.getBlankets() != null
						&& castOther.getBlankets() != null && this
						.getBlankets().equals(castOther.getBlankets())))
				&& ((this.getCattle() == castOther.getCattle()) || (this
						.getCattle() != null && castOther.getCattle() != null && this
						.getCattle().equals(castOther.getCattle())))
				&& ((this.getOtherLivestock() == castOther.getOtherLivestock()) || (this
						.getOtherLivestock() != null
						&& castOther.getOtherLivestock() != null && this
						.getOtherLivestock().equals(
								castOther.getOtherLivestock())))
				&& ((this.getPoultry() == castOther.getPoultry()) || (this
						.getPoultry() != null && castOther.getPoultry() != null && this
						.getPoultry().equals(castOther.getPoultry())))
				&& ((this.getTractor() == castOther.getTractor()) || (this
						.getTractor() != null && castOther.getTractor() != null && this
						.getTractor().equals(castOther.getTractor())))
				&& ((this.getPlough() == castOther.getPlough()) || (this
						.getPlough() != null && castOther.getPlough() != null && this
						.getPlough().equals(castOther.getPlough())))
				&& ((this.getTobaccoUse() == castOther.getTobaccoUse()) || (this
						.getTobaccoUse() != null
						&& castOther.getTobaccoUse() != null && this
						.getTobaccoUse().equals(castOther.getTobaccoUse())))
				&& ((this.getCurrentSmoker() == castOther.getCurrentSmoker()) || (this
						.getCurrentSmoker() != null
						&& castOther.getCurrentSmoker() != null && this
						.getCurrentSmoker()
						.equals(castOther.getCurrentSmoker())))
				&& ((this.getWhatSmokeCigarettes() == castOther
						.getWhatSmokeCigarettes()) || (this
						.getWhatSmokeCigarettes() != null
						&& castOther.getWhatSmokeCigarettes() != null && this
						.getWhatSmokeCigarettes().equals(
								castOther.getWhatSmokeCigarettes())))
				&& ((this.getWhatSmokePipe() == castOther.getWhatSmokePipe()) || (this
						.getWhatSmokePipe() != null
						&& castOther.getWhatSmokePipe() != null && this
						.getWhatSmokePipe()
						.equals(castOther.getWhatSmokePipe())))
				&& ((this.getWhatSmokeHandRolled() == castOther
						.getWhatSmokeHandRolled()) || (this
						.getWhatSmokeHandRolled() != null
						&& castOther.getWhatSmokeHandRolled() != null && this
						.getWhatSmokeHandRolled().equals(
								castOther.getWhatSmokeHandRolled())))
				&& ((this.getWhatSmokeCigars() == castOther
						.getWhatSmokeCigars()) || (this.getWhatSmokeCigars() != null
						&& castOther.getWhatSmokeCigars() != null && this
						.getWhatSmokeCigars().equals(
								castOther.getWhatSmokeCigars())))
				&& ((this.getWhatSmokeECigarettes() == castOther
						.getWhatSmokeECigarettes()) || (this
						.getWhatSmokeECigarettes() != null
						&& castOther.getWhatSmokeECigarettes() != null && this
						.getWhatSmokeECigarettes().equals(
								castOther.getWhatSmokeECigarettes())))
				&& ((this.getSmokingFrequence() == castOther
						.getSmokingFrequence()) || (this.getSmokingFrequence() != null
						&& castOther.getSmokingFrequence() != null && this
						.getSmokingFrequence().equals(
								castOther.getSmokingFrequence())))
				&& ((this.getSmokePerDay() == castOther.getSmokePerDay()) || (this
						.getSmokePerDay() != null
						&& castOther.getSmokePerDay() != null && this
						.getSmokePerDay().equals(castOther.getSmokePerDay())))
				&& ((this.getAgeStartSmoking() == castOther
						.getAgeStartSmoking()) || (this.getAgeStartSmoking() != null
						&& castOther.getAgeStartSmoking() != null && this
						.getAgeStartSmoking().equals(
								castOther.getAgeStartSmoking())))
				&& ((this.getYearStopSmoking() == castOther
						.getYearStopSmoking()) || (this.getYearStopSmoking() != null
						&& castOther.getYearStopSmoking() != null && this
						.getYearStopSmoking().equals(
								castOther.getYearStopSmoking())))
				&& ((this.getSmokelessTobaccoUse() == castOther
						.getSmokelessTobaccoUse()) || (this
						.getSmokelessTobaccoUse() != null
						&& castOther.getSmokelessTobaccoUse() != null && this
						.getSmokelessTobaccoUse().equals(
								castOther.getSmokelessTobaccoUse())))
				&& ((this.getSnuffUse() == castOther.getSnuffUse()) || (this
						.getSnuffUse() != null
						&& castOther.getSnuffUse() != null && this
						.getSnuffUse().equals(castOther.getSnuffUse())))
				&& ((this.getSnuffMethodNose() == castOther
						.getSnuffMethodNose()) || (this.getSnuffMethodNose() != null
						&& castOther.getSnuffMethodNose() != null && this
						.getSnuffMethodNose().equals(
								castOther.getSnuffMethodNose())))
				&& ((this.getSnuffMethodMouth() == castOther
						.getSnuffMethodMouth()) || (this.getSnuffMethodMouth() != null
						&& castOther.getSnuffMethodMouth() != null && this
						.getSnuffMethodMouth().equals(
								castOther.getSnuffMethodMouth())))
				&& ((this.getFrequenceOfSnuffUse() == castOther
						.getFrequenceOfSnuffUse()) || (this
						.getFrequenceOfSnuffUse() != null
						&& castOther.getFrequenceOfSnuffUse() != null && this
						.getFrequenceOfSnuffUse().equals(
								castOther.getFrequenceOfSnuffUse())))
				&& ((this.getFrequenceOfSnuffUsePerDay() == castOther
						.getFrequenceOfSnuffUsePerDay()) || (this
						.getFrequenceOfSnuffUsePerDay() != null
						&& castOther.getFrequenceOfSnuffUsePerDay() != null && this
						.getFrequenceOfSnuffUsePerDay().equals(
								castOther.getFrequenceOfSnuffUsePerDay())))
				&& ((this.getChewingTobaccoUse() == castOther
						.getChewingTobaccoUse()) || (this
						.getChewingTobaccoUse() != null
						&& castOther.getChewingTobaccoUse() != null && this
						.getChewingTobaccoUse().equals(
								castOther.getChewingTobaccoUse())))
				&& ((this.getFrequenceOfChewingTobaccoUse() == castOther
						.getFrequenceOfChewingTobaccoUse()) || (this
						.getFrequenceOfChewingTobaccoUse() != null
						&& castOther.getFrequenceOfChewingTobaccoUse() != null && this
						.getFrequenceOfChewingTobaccoUse().equals(
								castOther.getFrequenceOfChewingTobaccoUse())))
				&& ((this.getFrequenceOfChewingTobaccoUsePerDay() == castOther
						.getFrequenceOfChewingTobaccoUsePerDay()) || (this
						.getFrequenceOfChewingTobaccoUsePerDay() != null
						&& castOther.getFrequenceOfChewingTobaccoUsePerDay() != null && this
						.getFrequenceOfChewingTobaccoUsePerDay()
						.equals(castOther
								.getFrequenceOfChewingTobaccoUsePerDay())))
				&& ((this.getConsumeAlcohol() == castOther.getConsumeAlcohol()) || (this
						.getConsumeAlcohol() != null
						&& castOther.getConsumeAlcohol() != null && this
						.getConsumeAlcohol().equals(
								castOther.getConsumeAlcohol())))
				&& ((this.getCurrentAlcoholConsumer() == castOther
						.getCurrentAlcoholConsumer()) || (this
						.getCurrentAlcoholConsumer() != null
						&& castOther.getCurrentAlcoholConsumer() != null && this
						.getCurrentAlcoholConsumer().equals(
								castOther.getCurrentAlcoholConsumer())))
				&& ((this.getFrequenceOfAlcoholConsumption() == castOther
						.getFrequenceOfAlcoholConsumption()) || (this
						.getFrequenceOfAlcoholConsumption() != null
						&& castOther.getFrequenceOfAlcoholConsumption() != null && this
						.getFrequenceOfAlcoholConsumption().equals(
								castOther.getFrequenceOfAlcoholConsumption())))
				&& ((this.getAmountOfAlcoholConsumedPerDay() == castOther
						.getAmountOfAlcoholConsumedPerDay()) || (this
						.getAmountOfAlcoholConsumedPerDay() != null
						&& castOther.getAmountOfAlcoholConsumedPerDay() != null && this
						.getAmountOfAlcoholConsumedPerDay().equals(
								castOther.getAmountOfAlcoholConsumedPerDay())))
				&& ((this.getConsiderAlcoholCutdown() == castOther
						.getConsiderAlcoholCutdown()) || (this
						.getConsiderAlcoholCutdown() != null
						&& castOther.getConsiderAlcoholCutdown() != null && this
						.getConsiderAlcoholCutdown().equals(
								castOther.getConsiderAlcoholCutdown())))
				&& ((this.getCriticisedForDrinking() == castOther
						.getCriticisedForDrinking()) || (this
						.getCriticisedForDrinking() != null
						&& castOther.getCriticisedForDrinking() != null && this
						.getCriticisedForDrinking().equals(
								castOther.getCriticisedForDrinking())))
				&& ((this.getGuiltyForDrinking() == castOther
						.getGuiltyForDrinking()) || (this
						.getGuiltyForDrinking() != null
						&& castOther.getGuiltyForDrinking() != null && this
						.getGuiltyForDrinking().equals(
								castOther.getGuiltyForDrinking())))
				&& ((this.getHadHangover() == castOther.getHadHangover()) || (this
						.getHadHangover() != null
						&& castOther.getHadHangover() != null && this
						.getHadHangover().equals(castOther.getHadHangover())))
				&& ((this.getDrinkingPastYear() == castOther
						.getDrinkingPastYear()) || (this.getDrinkingPastYear() != null
						&& castOther.getDrinkingPastYear() != null && this
						.getDrinkingPastYear().equals(
								castOther.getDrinkingPastYear())))
				&& ((this.getAlcoholTypeConsumedBeer() == castOther
						.getAlcoholTypeConsumedBeer()) || (this
						.getAlcoholTypeConsumedBeer() != null
						&& castOther.getAlcoholTypeConsumedBeer() != null && this
						.getAlcoholTypeConsumedBeer().equals(
								castOther.getAlcoholTypeConsumedBeer())))
				&& ((this.getAlcoholTypeConsumedWine() == castOther
						.getAlcoholTypeConsumedWine()) || (this
						.getAlcoholTypeConsumedWine() != null
						&& castOther.getAlcoholTypeConsumedWine() != null && this
						.getAlcoholTypeConsumedWine().equals(
								castOther.getAlcoholTypeConsumedWine())))
				&& ((this.getAlcoholTypeConsumedSpirits() == castOther
						.getAlcoholTypeConsumedSpirits()) || (this
						.getAlcoholTypeConsumedSpirits() != null
						&& castOther.getAlcoholTypeConsumedSpirits() != null && this
						.getAlcoholTypeConsumedSpirits().equals(
								castOther.getAlcoholTypeConsumedSpirits())))
				&& ((this.getAlcoholTypeConsumedHomeBrew() == castOther
						.getAlcoholTypeConsumedHomeBrew()) || (this
						.getAlcoholTypeConsumedHomeBrew() != null
						&& castOther.getAlcoholTypeConsumedHomeBrew() != null && this
						.getAlcoholTypeConsumedHomeBrew().equals(
								castOther.getAlcoholTypeConsumedHomeBrew())))
				&& ((this.getAlcoholTypeConsumedOther() == castOther
						.getAlcoholTypeConsumedOther()) || (this
						.getAlcoholTypeConsumedOther() != null
						&& castOther.getAlcoholTypeConsumedOther() != null && this
						.getAlcoholTypeConsumedOther().equals(
								castOther.getAlcoholTypeConsumedOther())))
				&& ((this.getSpecifyAlcoholTypeConsumed() == castOther
						.getSpecifyAlcoholTypeConsumed()) || (this
						.getSpecifyAlcoholTypeConsumed() != null
						&& castOther.getSpecifyAlcoholTypeConsumed() != null && this
						.getSpecifyAlcoholTypeConsumed().equals(
								castOther.getSpecifyAlcoholTypeConsumed())))
				&& ((this.getUseDrug() == castOther.getUseDrug()) || (this
						.getUseDrug() != null && castOther.getUseDrug() != null && this
						.getUseDrug().equals(castOther.getUseDrug())))
				&& ((this.getBreastCancer() == castOther.getBreastCancer()) || (this
						.getBreastCancer() != null
						&& castOther.getBreastCancer() != null && this
						.getBreastCancer().equals(castOther.getBreastCancer())))
				&& ((this.getCervicalCancer() == castOther.getCervicalCancer()) || (this
						.getCervicalCancer() != null
						&& castOther.getCervicalCancer() != null && this
						.getCervicalCancer().equals(
								castOther.getCervicalCancer())))
				&& ((this.getProstateCancer() == castOther.getProstateCancer()) || (this
						.getProstateCancer() != null
						&& castOther.getProstateCancer() != null && this
						.getProstateCancer().equals(
								castOther.getProstateCancer())))
				&& ((this.getAsthma() == castOther.getAsthma()) || (this
						.getAsthma() != null && castOther.getAsthma() != null && this
						.getAsthma().equals(castOther.getAsthma())))
				&& ((this.getTreatmentGenHealth() == castOther
						.getTreatmentGenHealth()) || (this
						.getTreatmentGenHealth() != null
						&& castOther.getTreatmentGenHealth() != null && this
						.getTreatmentGenHealth().equals(
								castOther.getTreatmentGenHealth())))
				&& ((this.getMedication() == castOther.getMedication()) || (this
						.getMedication() != null
						&& castOther.getMedication() != null && this
						.getMedication().equals(castOther.getMedication())))
				&& ((this.getListMedication() == castOther.getListMedication()) || (this
						.getListMedication() != null
						&& castOther.getListMedication() != null && this
						.getListMedication().equals(
								castOther.getListMedication())))
				&& ((this.getTraditionalMed() == castOther.getTraditionalMed()) || (this
						.getTraditionalMed() != null
						&& castOther.getTraditionalMed() != null && this
						.getTraditionalMed().equals(
								castOther.getTraditionalMed())))
				&& ((this.getObesityMom() == castOther.getObesityMom()) || (this
						.getObesityMom() != null
						&& castOther.getObesityMom() != null && this
						.getObesityMom().equals(castOther.getObesityMom())))
				&& ((this.getHBloodPressureMom() == castOther
						.getHBloodPressureMom()) || (this
						.getHBloodPressureMom() != null
						&& castOther.getHBloodPressureMom() != null && this
						.getHBloodPressureMom().equals(
								castOther.getHBloodPressureMom())))
				&& ((this.getHCholesterolMom() == castOther
						.getHCholesterolMom()) || (this.getHCholesterolMom() != null
						&& castOther.getHCholesterolMom() != null && this
						.getHCholesterolMom().equals(
								castOther.getHCholesterolMom())))
				&& ((this.getBreastCancerMom() == castOther
						.getBreastCancerMom()) || (this.getBreastCancerMom() != null
						&& castOther.getBreastCancerMom() != null && this
						.getBreastCancerMom().equals(
								castOther.getBreastCancerMom())))
				&& ((this.getCervicalCancerMom() == castOther
						.getCervicalCancerMom()) || (this
						.getCervicalCancerMom() != null
						&& castOther.getCervicalCancerMom() != null && this
						.getCervicalCancerMom().equals(
								castOther.getCervicalCancerMom())))
				&& ((this.getOtherCancersMom() == castOther
						.getOtherCancersMom()) || (this.getOtherCancersMom() != null
						&& castOther.getOtherCancersMom() != null && this
						.getOtherCancersMom().equals(
								castOther.getOtherCancersMom())))
				&& ((this.getAsthmaMom() == castOther.getAsthmaMom()) || (this
						.getAsthmaMom() != null
						&& castOther.getAsthmaMom() != null && this
						.getAsthmaMom().equals(castOther.getAsthmaMom())))
				&& ((this.getObesityDad() == castOther.getObesityDad()) || (this
						.getObesityDad() != null
						&& castOther.getObesityDad() != null && this
						.getObesityDad().equals(castOther.getObesityDad())))
				&& ((this.getHBloodPressureDad() == castOther
						.getHBloodPressureDad()) || (this
						.getHBloodPressureDad() != null
						&& castOther.getHBloodPressureDad() != null && this
						.getHBloodPressureDad().equals(
								castOther.getHBloodPressureDad())))
				&& ((this.getHCholesterolDad() == castOther
						.getHCholesterolDad()) || (this.getHCholesterolDad() != null
						&& castOther.getHCholesterolDad() != null && this
						.getHCholesterolDad().equals(
								castOther.getHCholesterolDad())))
				&& ((this.getProstateCancerDad() == castOther
						.getProstateCancerDad()) || (this
						.getProstateCancerDad() != null
						&& castOther.getProstateCancerDad() != null && this
						.getProstateCancerDad().equals(
								castOther.getProstateCancerDad())))
				&& ((this.getOtherCancersDad() == castOther
						.getOtherCancersDad()) || (this.getOtherCancersDad() != null
						&& castOther.getOtherCancersDad() != null && this
						.getOtherCancersDad().equals(
								castOther.getOtherCancersDad())))
				&& ((this.getAsthmaDad() == castOther.getAsthmaDad()) || (this
						.getAsthmaDad() != null
						&& castOther.getAsthmaDad() != null && this
						.getAsthmaDad().equals(castOther.getAsthmaDad())))
				&& ((this.getDaysFruit() == castOther.getDaysFruit()) || (this
						.getDaysFruit() != null
						&& castOther.getDaysFruit() != null && this
						.getDaysFruit().equals(castOther.getDaysFruit())))
				&& ((this.getFruitServings() == castOther.getFruitServings()) || (this
						.getFruitServings() != null
						&& castOther.getFruitServings() != null && this
						.getFruitServings()
						.equals(castOther.getFruitServings())))
				&& ((this.getDaysVeg() == castOther.getDaysVeg()) || (this
						.getDaysVeg() != null && castOther.getDaysVeg() != null && this
						.getDaysVeg().equals(castOther.getDaysVeg())))
				&& ((this.getServingsVeg() == castOther.getServingsVeg()) || (this
						.getServingsVeg() != null
						&& castOther.getServingsVeg() != null && this
						.getServingsVeg().equals(castOther.getServingsVeg())))
				&& ((this.getVendorMeals() == castOther.getVendorMeals()) || (this
						.getVendorMeals() != null
						&& castOther.getVendorMeals() != null && this
						.getVendorMeals().equals(castOther.getVendorMeals())))
				&& ((this.getDaysBread() == castOther.getDaysBread()) || (this
						.getDaysBread() != null
						&& castOther.getDaysBread() != null && this
						.getDaysBread().equals(castOther.getDaysBread())))
				&& ((this.getSlicesBread() == castOther.getSlicesBread()) || (this
						.getSlicesBread() != null
						&& castOther.getSlicesBread() != null && this
						.getSlicesBread().equals(castOther.getSlicesBread())))
				&& ((this.getSugardrinks() == castOther.getSugardrinks()) || (this
						.getSugardrinks() != null
						&& castOther.getSugardrinks() != null && this
						.getSugardrinks().equals(castOther.getSugardrinks())))
				&& ((this.getJuice() == castOther.getJuice()) || (this
						.getJuice() != null && castOther.getJuice() != null && this
						.getJuice().equals(castOther.getJuice())))
				&& ((this.getChangeDiet() == castOther.getChangeDiet()) || (this
						.getChangeDiet() != null
						&& castOther.getChangeDiet() != null && this
						.getChangeDiet().equals(castOther.getChangeDiet())))
				&& ((this.getLoseWeight() == castOther.getLoseWeight()) || (this
						.getLoseWeight() != null
						&& castOther.getLoseWeight() != null && this
						.getLoseWeight().equals(castOther.getLoseWeight())))
				&& ((this.getPesticide() == castOther.getPesticide()) || (this
						.getPesticide() != null
						&& castOther.getPesticide() != null && this
						.getPesticide().equals(castOther.getPesticide())))
				&& ((this.getYearsPesticide() == castOther.getYearsPesticide()) || (this
						.getYearsPesticide() != null
						&& castOther.getYearsPesticide() != null && this
						.getYearsPesticide().equals(
								castOther.getYearsPesticide())))
				&& ((this.getRegionPesticide() == castOther
						.getRegionPesticide()) || (this.getRegionPesticide() != null
						&& castOther.getRegionPesticide() != null && this
						.getRegionPesticide().equals(
								castOther.getRegionPesticide())))
				&& ((this.getPesticideType() == castOther.getPesticideType()) || (this
						.getPesticideType() != null
						&& castOther.getPesticideType() != null && this
						.getPesticideType()
						.equals(castOther.getPesticideType())))
				&& ((this.getPesticideList() == castOther.getPesticideList()) || (this
						.getPesticideList() != null
						&& castOther.getPesticideList() != null && this
						.getPesticideList()
						.equals(castOther.getPesticideList())))
				&& ((this.getMalaria() == castOther.getMalaria()) || (this
						.getMalaria() != null && castOther.getMalaria() != null && this
						.getMalaria().equals(castOther.getMalaria())))
				&& ((this.getMalariaMonth() == castOther.getMalariaMonth()) || (this
						.getMalariaMonth() != null
						&& castOther.getMalariaMonth() != null && this
						.getMalariaMonth().equals(castOther.getMalariaMonth())))
				&& ((this.getMalariaArea() == castOther.getMalariaArea()) || (this
						.getMalariaArea() != null
						&& castOther.getMalariaArea() != null && this
						.getMalariaArea().equals(castOther.getMalariaArea())))
				&& ((this.getTb() == castOther.getTb()) || (this.getTb() != null
						&& castOther.getTb() != null && this.getTb().equals(
						castOther.getTb())))
				&& ((this.getTb12months() == castOther.getTb12months()) || (this
						.getTb12months() != null
						&& castOther.getTb12months() != null && this
						.getTb12months().equals(castOther.getTb12months())))
				&& ((this.getTbDiagnosed() == castOther.getTbDiagnosed()) || (this
						.getTbDiagnosed() != null
						&& castOther.getTbDiagnosed() != null && this
						.getTbDiagnosed().equals(castOther.getTbDiagnosed())))
				&& ((this.getTbTreatment() == castOther.getTbTreatment()) || (this
						.getTbTreatment() != null
						&& castOther.getTbTreatment() != null && this
						.getTbTreatment().equals(castOther.getTbTreatment())))
				&& ((this.getTbMeds() == castOther.getTbMeds()) || (this
						.getTbMeds() != null && castOther.getTbMeds() != null && this
						.getTbMeds().equals(castOther.getTbMeds())))
				&& ((this.getTbCounselling() == castOther.getTbCounselling()) || (this
						.getTbCounselling() != null
						&& castOther.getTbCounselling() != null && this
						.getTbCounselling()
						.equals(castOther.getTbCounselling())))
				&& ((this.getTbTraditionalMed() == castOther
						.getTbTraditionalMed()) || (this.getTbTraditionalMed() != null
						&& castOther.getTbTraditionalMed() != null && this
						.getTbTraditionalMed().equals(
								castOther.getTbTraditionalMed())))
				&& ((this.getBloodSugar() == castOther.getBloodSugar()) || (this
						.getBloodSugar() != null
						&& castOther.getBloodSugar() != null && this
						.getBloodSugar().equals(castOther.getBloodSugar())))
				&& ((this.getDiabetes() == castOther.getDiabetes()) || (this
						.getDiabetes() != null
						&& castOther.getDiabetes() != null && this
						.getDiabetes().equals(castOther.getDiabetes())))
				&& ((this.getDiabetes12months() == castOther
						.getDiabetes12months()) || (this.getDiabetes12months() != null
						&& castOther.getDiabetes12months() != null && this
						.getDiabetes12months().equals(
								castOther.getDiabetes12months())))
				&& ((this.getDiabetesTreatment() == castOther
						.getDiabetesTreatment()) || (this
						.getDiabetesTreatment() != null
						&& castOther.getDiabetesTreatment() != null && this
						.getDiabetesTreatment().equals(
								castOther.getDiabetesTreatment())))
				&& ((this.getDiabetesTreatCurr() == castOther
						.getDiabetesTreatCurr()) || (this
						.getDiabetesTreatCurr() != null
						&& castOther.getDiabetesTreatCurr() != null && this
						.getDiabetesTreatCurr().equals(
								castOther.getDiabetesTreatCurr())))
				&& ((this.getDiabetesTreatInsulin() == castOther
						.getDiabetesTreatInsulin()) || (this
						.getDiabetesTreatInsulin() != null
						&& castOther.getDiabetesTreatInsulin() != null && this
						.getDiabetesTreatInsulin().equals(
								castOther.getDiabetesTreatInsulin())))
				&& ((this.getDiabetesTreatPills() == castOther
						.getDiabetesTreatPills()) || (this
						.getDiabetesTreatPills() != null
						&& castOther.getDiabetesTreatPills() != null && this
						.getDiabetesTreatPills().equals(
								castOther.getDiabetesTreatPills())))
				&& ((this.getDiabetesTreatDiet() == castOther
						.getDiabetesTreatDiet()) || (this
						.getDiabetesTreatDiet() != null
						&& castOther.getDiabetesTreatDiet() != null && this
						.getDiabetesTreatDiet().equals(
								castOther.getDiabetesTreatDiet())))
				&& ((this.getDiabetesTreatWeightLoss() == castOther
						.getDiabetesTreatWeightLoss()) || (this
						.getDiabetesTreatWeightLoss() != null
						&& castOther.getDiabetesTreatWeightLoss() != null && this
						.getDiabetesTreatWeightLoss().equals(
								castOther.getDiabetesTreatWeightLoss())))
				&& ((this.getDiabetesTreatOther() == castOther
						.getDiabetesTreatOther()) || (this
						.getDiabetesTreatOther() != null
						&& castOther.getDiabetesTreatOther() != null && this
						.getDiabetesTreatOther().equals(
								castOther.getDiabetesTreatOther())))
				&& ((this.getDiabetesMedsSpecify() == castOther
						.getDiabetesMedsSpecify()) || (this
						.getDiabetesMedsSpecify() != null
						&& castOther.getDiabetesMedsSpecify() != null && this
						.getDiabetesMedsSpecify().equals(
								castOther.getDiabetesMedsSpecify())))
				&& ((this.getDiabetesTraditional() == castOther
						.getDiabetesTraditional()) || (this
						.getDiabetesTraditional() != null
						&& castOther.getDiabetesTraditional() != null && this
						.getDiabetesTraditional().equals(
								castOther.getDiabetesTraditional())))
				&& ((this.getDiabetesHistory() == castOther
						.getDiabetesHistory()) || (this.getDiabetesHistory() != null
						&& castOther.getDiabetesHistory() != null && this
						.getDiabetesHistory().equals(
								castOther.getDiabetesHistory())))
				&& ((this.getMotherDiabetes() == castOther.getMotherDiabetes()) || (this
						.getMotherDiabetes() != null
						&& castOther.getMotherDiabetes() != null && this
						.getMotherDiabetes().equals(
								castOther.getMotherDiabetes())))
				&& ((this.getFatherDiabetes() == castOther.getFatherDiabetes()) || (this
						.getFatherDiabetes() != null
						&& castOther.getFatherDiabetes() != null && this
						.getFatherDiabetes().equals(
								castOther.getFatherDiabetes())))
				&& ((this.getBrotherDiabetes() == castOther
						.getBrotherDiabetes()) || (this.getBrotherDiabetes() != null
						&& castOther.getBrotherDiabetes() != null && this
						.getBrotherDiabetes().equals(
								castOther.getBrotherDiabetes())))
				&& ((this.getBrother2Diabetes() == castOther
						.getBrother2Diabetes()) || (this.getBrother2Diabetes() != null
						&& castOther.getBrother2Diabetes() != null && this
						.getBrother2Diabetes().equals(
								castOther.getBrother2Diabetes())))
				&& ((this.getBrother3Diabetes() == castOther
						.getBrother3Diabetes()) || (this.getBrother3Diabetes() != null
						&& castOther.getBrother3Diabetes() != null && this
						.getBrother3Diabetes().equals(
								castOther.getBrother3Diabetes())))
				&& ((this.getBrother4Diabetes() == castOther
						.getBrother4Diabetes()) || (this.getBrother4Diabetes() != null
						&& castOther.getBrother4Diabetes() != null && this
						.getBrother4Diabetes().equals(
								castOther.getBrother4Diabetes())))
				&& ((this.getSisterDiabetes() == castOther.getSisterDiabetes()) || (this
						.getSisterDiabetes() != null
						&& castOther.getSisterDiabetes() != null && this
						.getSisterDiabetes().equals(
								castOther.getSisterDiabetes())))
				&& ((this.getSister2Diabetes() == castOther
						.getSister2Diabetes()) || (this.getSister2Diabetes() != null
						&& castOther.getSister2Diabetes() != null && this
						.getSister2Diabetes().equals(
								castOther.getSister2Diabetes())))
				&& ((this.getSister3Diabetes() == castOther
						.getSister3Diabetes()) || (this.getSister3Diabetes() != null
						&& castOther.getSister3Diabetes() != null && this
						.getSister3Diabetes().equals(
								castOther.getSister3Diabetes())))
				&& ((this.getSister4Diabetes() == castOther
						.getSister4Diabetes()) || (this.getSister4Diabetes() != null
						&& castOther.getSister4Diabetes() != null && this
						.getSister4Diabetes().equals(
								castOther.getSister4Diabetes())))
				&& ((this.getSonDiabetes() == castOther.getSonDiabetes()) || (this
						.getSonDiabetes() != null
						&& castOther.getSonDiabetes() != null && this
						.getSonDiabetes().equals(castOther.getSonDiabetes())))
				&& ((this.getSon2Diabetes() == castOther.getSon2Diabetes()) || (this
						.getSon2Diabetes() != null
						&& castOther.getSon2Diabetes() != null && this
						.getSon2Diabetes().equals(castOther.getSon2Diabetes())))
				&& ((this.getSon3Diabetes() == castOther.getSon3Diabetes()) || (this
						.getSon3Diabetes() != null
						&& castOther.getSon3Diabetes() != null && this
						.getSon3Diabetes().equals(castOther.getSon3Diabetes())))
				&& ((this.getSon4Diabetes() == castOther.getSon4Diabetes()) || (this
						.getSon4Diabetes() != null
						&& castOther.getSon4Diabetes() != null && this
						.getSon4Diabetes().equals(castOther.getSon4Diabetes())))
				&& ((this.getDaughterDiabetes() == castOther
						.getDaughterDiabetes()) || (this.getDaughterDiabetes() != null
						&& castOther.getDaughterDiabetes() != null && this
						.getDaughterDiabetes().equals(
								castOther.getDaughterDiabetes())))
				&& ((this.getDaughter2Diabetes() == castOther
						.getDaughter2Diabetes()) || (this
						.getDaughter2Diabetes() != null
						&& castOther.getDaughter2Diabetes() != null && this
						.getDaughter2Diabetes().equals(
								castOther.getDaughter2Diabetes())))
				&& ((this.getDaughter3Diabetes() == castOther
						.getDaughter3Diabetes()) || (this
						.getDaughter3Diabetes() != null
						&& castOther.getDaughter3Diabetes() != null && this
						.getDaughter3Diabetes().equals(
								castOther.getDaughter3Diabetes())))
				&& ((this.getDaughter4Diabetes() == castOther
						.getDaughter4Diabetes()) || (this
						.getDaughter4Diabetes() != null
						&& castOther.getDaughter4Diabetes() != null && this
						.getDaughter4Diabetes().equals(
								castOther.getDaughter4Diabetes())))
				&& ((this.getOtherDiabetes() == castOther.getOtherDiabetes()) || (this
						.getOtherDiabetes() != null
						&& castOther.getOtherDiabetes() != null && this
						.getOtherDiabetes()
						.equals(castOther.getOtherDiabetes())))
				&& ((this.getOtherDiabetesSpecify() == castOther
						.getOtherDiabetesSpecify()) || (this
						.getOtherDiabetesSpecify() != null
						&& castOther.getOtherDiabetesSpecify() != null && this
						.getOtherDiabetesSpecify().equals(
								castOther.getOtherDiabetesSpecify())))
				&& ((this.getStroke() == castOther.getStroke()) || (this
						.getStroke() != null && castOther.getStroke() != null && this
						.getStroke().equals(castOther.getStroke())))
				&& ((this.getStrokeDiagnosed() == castOther
						.getStrokeDiagnosed()) || (this.getStrokeDiagnosed() != null
						&& castOther.getStrokeDiagnosed() != null && this
						.getStrokeDiagnosed().equals(
								castOther.getStrokeDiagnosed())))
				&& ((this.getTransientIschemicAttack() == castOther
						.getTransientIschemicAttack()) || (this
						.getTransientIschemicAttack() != null
						&& castOther.getTransientIschemicAttack() != null && this
						.getTransientIschemicAttack().equals(
								castOther.getTransientIschemicAttack())))
				&& ((this.getWeakness() == castOther.getWeakness()) || (this
						.getWeakness() != null
						&& castOther.getWeakness() != null && this
						.getWeakness().equals(castOther.getWeakness())))
				&& ((this.getNumbness() == castOther.getNumbness()) || (this
						.getNumbness() != null
						&& castOther.getNumbness() != null && this
						.getNumbness().equals(castOther.getNumbness())))
				&& ((this.getBlindness() == castOther.getBlindness()) || (this
						.getBlindness() != null
						&& castOther.getBlindness() != null && this
						.getBlindness().equals(castOther.getBlindness())))
				&& ((this.getHalfVisionLoss() == castOther.getHalfVisionLoss()) || (this
						.getHalfVisionLoss() != null
						&& castOther.getHalfVisionLoss() != null && this
						.getHalfVisionLoss().equals(
								castOther.getHalfVisionLoss())))
				&& ((this.getUnderstandingLoss() == castOther
						.getUnderstandingLoss()) || (this
						.getUnderstandingLoss() != null
						&& castOther.getUnderstandingLoss() != null && this
						.getUnderstandingLoss().equals(
								castOther.getUnderstandingLoss())))
				&& ((this.getExpressionLoss() == castOther.getExpressionLoss()) || (this
						.getExpressionLoss() != null
						&& castOther.getExpressionLoss() != null && this
						.getExpressionLoss().equals(
								castOther.getExpressionLoss())))
				&& ((this.getBpMeasure() == castOther.getBpMeasure()) || (this
						.getBpMeasure() != null
						&& castOther.getBpMeasure() != null && this
						.getBpMeasure().equals(castOther.getBpMeasure())))
				&& ((this.getHypertension() == castOther.getHypertension()) || (this
						.getHypertension() != null
						&& castOther.getHypertension() != null && this
						.getHypertension().equals(castOther.getHypertension())))
				&& ((this.getHypertension12monthsYn() == castOther
						.getHypertension12monthsYn()) || (this
						.getHypertension12monthsYn() != null
						&& castOther.getHypertension12monthsYn() != null && this
						.getHypertension12monthsYn().equals(
								castOther.getHypertension12monthsYn())))
				&& ((this.getHypertensionTreatmentYn() == castOther
						.getHypertensionTreatmentYn()) || (this
						.getHypertensionTreatmentYn() != null
						&& castOther.getHypertensionTreatmentYn() != null && this
						.getHypertensionTreatmentYn().equals(
								castOther.getHypertensionTreatmentYn())))
				&& ((this.getHypertensionMedsYn() == castOther
						.getHypertensionMedsYn()) || (this
						.getHypertensionMedsYn() != null
						&& castOther.getHypertensionMedsYn() != null && this
						.getHypertensionMedsYn().equals(
								castOther.getHypertensionMedsYn())))
				&& ((this.getHypertensionMeds() == castOther
						.getHypertensionMeds()) || (this.getHypertensionMeds() != null
						&& castOther.getHypertensionMeds() != null && this
						.getHypertensionMeds().equals(
								castOther.getHypertensionMeds())))
				&& ((this.getHypertensionTraditional() == castOther
						.getHypertensionTraditional()) || (this
						.getHypertensionTraditional() != null
						&& castOther.getHypertensionTraditional() != null && this
						.getHypertensionTraditional().equals(
								castOther.getHypertensionTraditional())))
				&& ((this.getAngina() == castOther.getAngina()) || (this
						.getAngina() != null && castOther.getAngina() != null && this
						.getAngina().equals(castOther.getAngina())))
				&& ((this.getAnginaTreatmentYn() == castOther
						.getAnginaTreatmentYn()) || (this
						.getAnginaTreatmentYn() != null
						&& castOther.getAnginaTreatmentYn() != null && this
						.getAnginaTreatmentYn().equals(
								castOther.getAnginaTreatmentYn())))
				&& ((this.getAnginaTreatNow() == castOther.getAnginaTreatNow()) || (this
						.getAnginaTreatNow() != null
						&& castOther.getAnginaTreatNow() != null && this
						.getAnginaTreatNow().equals(
								castOther.getAnginaTreatNow())))
				&& ((this.getAnginaMeds() == castOther.getAnginaMeds()) || (this
						.getAnginaMeds() != null
						&& castOther.getAnginaMeds() != null && this
						.getAnginaMeds().equals(castOther.getAnginaMeds())))
				&& ((this.getAnginaTraditional() == castOther
						.getAnginaTraditional()) || (this
						.getAnginaTraditional() != null
						&& castOther.getAnginaTraditional() != null && this
						.getAnginaTraditional().equals(
								castOther.getAnginaTraditional())))
				&& ((this.getPain() == castOther.getPain()) || (this.getPain() != null
						&& castOther.getPain() != null && this.getPain()
						.equals(castOther.getPain())))
				&& ((this.getPain2() == castOther.getPain2()) || (this
						.getPain2() != null && castOther.getPain2() != null && this
						.getPain2().equals(castOther.getPain2())))
				&& ((this.getPainActionStopOrSlow() == castOther
						.getPainActionStopOrSlow()) || (this
						.getPainActionStopOrSlow() != null
						&& castOther.getPainActionStopOrSlow() != null && this
						.getPainActionStopOrSlow().equals(
								castOther.getPainActionStopOrSlow())))
				&& ((this.getPainActionRest() == castOther.getPainActionRest()) || (this
						.getPainActionRest() != null
						&& castOther.getPainActionRest() != null && this
						.getPainActionRest().equals(
								castOther.getPainActionRest())))
				&& ((this.getPainActionMedicine() == castOther
						.getPainActionMedicine()) || (this
						.getPainActionMedicine() != null
						&& castOther.getPainActionMedicine() != null && this
						.getPainActionMedicine().equals(
								castOther.getPainActionMedicine())))
				&& ((this.getPainActionCarryOn() == castOther
						.getPainActionCarryOn()) || (this
						.getPainActionCarryOn() != null
						&& castOther.getPainActionCarryOn() != null && this
						.getPainActionCarryOn().equals(
								castOther.getPainActionCarryOn())))
				&& ((this.getReliefStandstill() == castOther
						.getReliefStandstill()) || (this.getReliefStandstill() != null
						&& castOther.getReliefStandstill() != null && this
						.getReliefStandstill().equals(
								castOther.getReliefStandstill())))
				&& ((this.getPainLocation1() == castOther.getPainLocation1()) || (this
						.getPainLocation1() != null
						&& castOther.getPainLocation1() != null && this
						.getPainLocation1()
						.equals(castOther.getPainLocation1())))
				&& ((this.getPainLocation2() == castOther.getPainLocation2()) || (this
						.getPainLocation2() != null
						&& castOther.getPainLocation2() != null && this
						.getPainLocation2()
						.equals(castOther.getPainLocation2())))
				&& ((this.getPainLocation3() == castOther.getPainLocation3()) || (this
						.getPainLocation3() != null
						&& castOther.getPainLocation3() != null && this
						.getPainLocation3()
						.equals(castOther.getPainLocation3())))
				&& ((this.getPainLocation4() == castOther.getPainLocation4()) || (this
						.getPainLocation4() != null
						&& castOther.getPainLocation4() != null && this
						.getPainLocation4()
						.equals(castOther.getPainLocation4())))
				&& ((this.getPainLocation5() == castOther.getPainLocation5()) || (this
						.getPainLocation5() != null
						&& castOther.getPainLocation5() != null && this
						.getPainLocation5()
						.equals(castOther.getPainLocation5())))
				&& ((this.getPainLocation6() == castOther.getPainLocation6()) || (this
						.getPainLocation6() != null
						&& castOther.getPainLocation6() != null && this
						.getPainLocation6()
						.equals(castOther.getPainLocation6())))
				&& ((this.getPainLocation7() == castOther.getPainLocation7()) || (this
						.getPainLocation7() != null
						&& castOther.getPainLocation7() != null && this
						.getPainLocation7()
						.equals(castOther.getPainLocation7())))
				&& ((this.getPainLocation8() == castOther.getPainLocation8()) || (this
						.getPainLocation8() != null
						&& castOther.getPainLocation8() != null && this
						.getPainLocation8()
						.equals(castOther.getPainLocation8())))
				&& ((this.getPainLocation9() == castOther.getPainLocation9()) || (this
						.getPainLocation9() != null
						&& castOther.getPainLocation9() != null && this
						.getPainLocation9()
						.equals(castOther.getPainLocation9())))
				&& ((this.getPainLocation10() == castOther.getPainLocation10()) || (this
						.getPainLocation10() != null
						&& castOther.getPainLocation10() != null && this
						.getPainLocation10().equals(
								castOther.getPainLocation10())))
				&& ((this.getPainLocation11() == castOther.getPainLocation11()) || (this
						.getPainLocation11() != null
						&& castOther.getPainLocation11() != null && this
						.getPainLocation11().equals(
								castOther.getPainLocation11())))
				&& ((this.getPainLocation12() == castOther.getPainLocation12()) || (this
						.getPainLocation12() != null
						&& castOther.getPainLocation12() != null && this
						.getPainLocation12().equals(
								castOther.getPainLocation12())))
				&& ((this.getPainLocation13() == castOther.getPainLocation13()) || (this
						.getPainLocation13() != null
						&& castOther.getPainLocation13() != null && this
						.getPainLocation13().equals(
								castOther.getPainLocation13())))
				&& ((this.getPainLocation14() == castOther.getPainLocation14()) || (this
						.getPainLocation14() != null
						&& castOther.getPainLocation14() != null && this
						.getPainLocation14().equals(
								castOther.getPainLocation14())))
				&& ((this.getPainLocation15() == castOther.getPainLocation15()) || (this
						.getPainLocation15() != null
						&& castOther.getPainLocation15() != null && this
						.getPainLocation15().equals(
								castOther.getPainLocation15())))
				&& ((this.getPainLocation16() == castOther.getPainLocation16()) || (this
						.getPainLocation16() != null
						&& castOther.getPainLocation16() != null && this
						.getPainLocation16().equals(
								castOther.getPainLocation16())))
				&& ((this.getPainLocation17() == castOther.getPainLocation17()) || (this
						.getPainLocation17() != null
						&& castOther.getPainLocation17() != null && this
						.getPainLocation17().equals(
								castOther.getPainLocation17())))
				&& ((this.getPainLocation18() == castOther.getPainLocation18()) || (this
						.getPainLocation18() != null
						&& castOther.getPainLocation18() != null && this
						.getPainLocation18().equals(
								castOther.getPainLocation18())))
				&& ((this.getHeartattack() == castOther.getHeartattack()) || (this
						.getHeartattack() != null
						&& castOther.getHeartattack() != null && this
						.getHeartattack().equals(castOther.getHeartattack())))
				&& ((this.getHeartattackTreatment() == castOther
						.getHeartattackTreatment()) || (this
						.getHeartattackTreatment() != null
						&& castOther.getHeartattackTreatment() != null && this
						.getHeartattackTreatment().equals(
								castOther.getHeartattackTreatment())))
				&& ((this.getHeartattackTraditional() == castOther
						.getHeartattackTraditional()) || (this
						.getHeartattackTraditional() != null
						&& castOther.getHeartattackTraditional() != null && this
						.getHeartattackTraditional().equals(
								castOther.getHeartattackTraditional())))
				&& ((this.getCongestiveHeartFailure() == castOther
						.getCongestiveHeartFailure()) || (this
						.getCongestiveHeartFailure() != null
						&& castOther.getCongestiveHeartFailure() != null && this
						.getCongestiveHeartFailure().equals(
								castOther.getCongestiveHeartFailure())))
				&& ((this.getChfTreatmentYn() == castOther.getChfTreatmentYn()) || (this
						.getChfTreatmentYn() != null
						&& castOther.getChfTreatmentYn() != null && this
						.getChfTreatmentYn().equals(
								castOther.getChfTreatmentYn())))
				&& ((this.getChfTreatNow() == castOther.getChfTreatNow()) || (this
						.getChfTreatNow() != null
						&& castOther.getChfTreatNow() != null && this
						.getChfTreatNow().equals(castOther.getChfTreatNow())))
				&& ((this.getChfMeds() == castOther.getChfMeds()) || (this
						.getChfMeds() != null && castOther.getChfMeds() != null && this
						.getChfMeds().equals(castOther.getChfMeds())))
				&& ((this.getChfTraditional() == castOther.getChfTraditional()) || (this
						.getChfTraditional() != null
						&& castOther.getChfTraditional() != null && this
						.getChfTraditional().equals(
								castOther.getChfTraditional())))
				&& ((this.getCholesterol() == castOther.getCholesterol()) || (this
						.getCholesterol() != null
						&& castOther.getCholesterol() != null && this
						.getCholesterol().equals(castOther.getCholesterol())))
				&& ((this.getHCholesterol() == castOther.getHCholesterol()) || (this
						.getHCholesterol() != null
						&& castOther.getHCholesterol() != null && this
						.getHCholesterol().equals(castOther.getHCholesterol())))
				&& ((this.getCholesterolTreatment() == castOther
						.getCholesterolTreatment()) || (this
						.getCholesterolTreatment() != null
						&& castOther.getCholesterolTreatment() != null && this
						.getCholesterolTreatment().equals(
								castOther.getCholesterolTreatment())))
				&& ((this.getCholesterolMedsSpecialDiet() == castOther
						.getCholesterolMedsSpecialDiet()) || (this
						.getCholesterolMedsSpecialDiet() != null
						&& castOther.getCholesterolMedsSpecialDiet() != null && this
						.getCholesterolMedsSpecialDiet().equals(
								castOther.getCholesterolMedsSpecialDiet())))
				&& ((this.getCholesterolMedsWeightLoss() == castOther
						.getCholesterolMedsWeightLoss()) || (this
						.getCholesterolMedsWeightLoss() != null
						&& castOther.getCholesterolMedsWeightLoss() != null && this
						.getCholesterolMedsWeightLoss().equals(
								castOther.getCholesterolMedsWeightLoss())))
				&& ((this.getCholesterolMedsMedicine() == castOther
						.getCholesterolMedsMedicine()) || (this
						.getCholesterolMedsMedicine() != null
						&& castOther.getCholesterolMedsMedicine() != null && this
						.getCholesterolMedsMedicine().equals(
								castOther.getCholesterolMedsMedicine())))
				&& ((this.getCholesterolMedsOther() == castOther
						.getCholesterolMedsOther()) || (this
						.getCholesterolMedsOther() != null
						&& castOther.getCholesterolMedsOther() != null && this
						.getCholesterolMedsOther().equals(
								castOther.getCholesterolMedsOther())))
				&& ((this.getCholesterolTraditional() == castOther
						.getCholesterolTraditional()) || (this
						.getCholesterolTraditional() != null
						&& castOther.getCholesterolTraditional() != null && this
						.getCholesterolTraditional().equals(
								castOther.getCholesterolTraditional())))
				&& ((this.getThyroid() == castOther.getThyroid()) || (this
						.getThyroid() != null && castOther.getThyroid() != null && this
						.getThyroid().equals(castOther.getThyroid())))
				&& ((this.getThyroidType() == castOther.getThyroidType()) || (this
						.getThyroidType() != null
						&& castOther.getThyroidType() != null && this
						.getThyroidType().equals(castOther.getThyroidType())))
				&& ((this.getThryroidSpecify() == castOther
						.getThryroidSpecify()) || (this.getThryroidSpecify() != null
						&& castOther.getThryroidSpecify() != null && this
						.getThryroidSpecify().equals(
								castOther.getThryroidSpecify())))
				&& ((this.getThyroidTreatmentYn() == castOther
						.getThyroidTreatmentYn()) || (this
						.getThyroidTreatmentYn() != null
						&& castOther.getThyroidTreatmentYn() != null && this
						.getThyroidTreatmentYn().equals(
								castOther.getThyroidTreatmentYn())))
				&& ((this.getThyroidTreatmentHormone() == castOther
						.getThyroidTreatmentHormone()) || (this
						.getThyroidTreatmentHormone() != null
						&& castOther.getThyroidTreatmentHormone() != null && this
						.getThyroidTreatmentHormone().equals(
								castOther.getThyroidTreatmentHormone())))
				&& ((this.getThyroidTreatmentSurgery() == castOther
						.getThyroidTreatmentSurgery()) || (this
						.getThyroidTreatmentSurgery() != null
						&& castOther.getThyroidTreatmentSurgery() != null && this
						.getThyroidTreatmentSurgery().equals(
								castOther.getThyroidTreatmentSurgery())))
				&& ((this.getThyroidTreatmentIodine() == castOther
						.getThyroidTreatmentIodine()) || (this
						.getThyroidTreatmentIodine() != null
						&& castOther.getThyroidTreatmentIodine() != null && this
						.getThyroidTreatmentIodine().equals(
								castOther.getThyroidTreatmentIodine())))
				&& ((this.getThyroidTreatmentDrugs() == castOther
						.getThyroidTreatmentDrugs()) || (this
						.getThyroidTreatmentDrugs() != null
						&& castOther.getThyroidTreatmentDrugs() != null && this
						.getThyroidTreatmentDrugs().equals(
								castOther.getThyroidTreatmentDrugs())))
				&& ((this.getParentsThyroid() == castOther.getParentsThyroid()) || (this
						.getParentsThyroid() != null
						&& castOther.getParentsThyroid() != null && this
						.getParentsThyroid().equals(
								castOther.getParentsThyroid())))
				&& ((this.getSpecifyThyroidParent() == castOther
						.getSpecifyThyroidParent()) || (this
						.getSpecifyThyroidParent() != null
						&& castOther.getSpecifyThyroidParent() != null && this
						.getSpecifyThyroidParent().equals(
								castOther.getSpecifyThyroidParent())))
				&& ((this.getKidneyDisease() == castOther.getKidneyDisease()) || (this
						.getKidneyDisease() != null
						&& castOther.getKidneyDisease() != null && this
						.getKidneyDisease()
						.equals(castOther.getKidneyDisease())))
				&& ((this.getKnowTypeKidneyDisease() == castOther
						.getKnowTypeKidneyDisease()) || (this
						.getKnowTypeKidneyDisease() != null
						&& castOther.getKnowTypeKidneyDisease() != null && this
						.getKnowTypeKidneyDisease().equals(
								castOther.getKnowTypeKidneyDisease())))
				&& ((this.getTypeKidneyDisease() == castOther
						.getTypeKidneyDisease()) || (this
						.getTypeKidneyDisease() != null
						&& castOther.getTypeKidneyDisease() != null && this
						.getTypeKidneyDisease().equals(
								castOther.getTypeKidneyDisease())))
				&& ((this.getLowKidneyFunction() == castOther
						.getLowKidneyFunction()) || (this
						.getLowKidneyFunction() != null
						&& castOther.getLowKidneyFunction() != null && this
						.getLowKidneyFunction().equals(
								castOther.getLowKidneyFunction())))
				&& ((this.getKidneyFamily() == castOther.getKidneyFamily()) || (this
						.getKidneyFamily() != null
						&& castOther.getKidneyFamily() != null && this
						.getKidneyFamily().equals(castOther.getKidneyFamily())))
				&& ((this.getFamilyKidneyMother() == castOther
						.getFamilyKidneyMother()) || (this
						.getFamilyKidneyMother() != null
						&& castOther.getFamilyKidneyMother() != null && this
						.getFamilyKidneyMother().equals(
								castOther.getFamilyKidneyMother())))
				&& ((this.getFamilyKidneyFather() == castOther
						.getFamilyKidneyFather()) || (this
						.getFamilyKidneyFather() != null
						&& castOther.getFamilyKidneyFather() != null && this
						.getFamilyKidneyFather().equals(
								castOther.getFamilyKidneyFather())))
				&& ((this.getFamilyKidneyOther() == castOther
						.getFamilyKidneyOther()) || (this
						.getFamilyKidneyOther() != null
						&& castOther.getFamilyKidneyOther() != null && this
						.getFamilyKidneyOther().equals(
								castOther.getFamilyKidneyOther())))
				&& ((this.getFamilyKidneyOtherSpecify() == castOther
						.getFamilyKidneyOtherSpecify()) || (this
						.getFamilyKidneyOtherSpecify() != null
						&& castOther.getFamilyKidneyOtherSpecify() != null && this
						.getFamilyKidneyOtherSpecify().equals(
								castOther.getFamilyKidneyOtherSpecify())))
				&& ((this.getKidneyFamilyType() == castOther
						.getKidneyFamilyType()) || (this.getKidneyFamilyType() != null
						&& castOther.getKidneyFamilyType() != null && this
						.getKidneyFamilyType().equals(
								castOther.getKidneyFamilyType())))
				&& ((this.getFamilyKidneyType() == castOther
						.getFamilyKidneyType()) || (this.getFamilyKidneyType() != null
						&& castOther.getFamilyKidneyType() != null && this
						.getFamilyKidneyType().equals(
								castOther.getFamilyKidneyType())))
				&& ((this.getWorkDays() == castOther.getWorkDays()) || (this
						.getWorkDays() != null
						&& castOther.getWorkDays() != null && this
						.getWorkDays().equals(castOther.getWorkDays())))
				&& ((this.getWorkWeekend() == castOther.getWorkWeekend()) || (this
						.getWorkWeekend() != null
						&& castOther.getWorkWeekend() != null && this
						.getWorkWeekend().equals(castOther.getWorkWeekend())))
				&& ((this.getWorkSedentary() == castOther.getWorkSedentary()) || (this
						.getWorkSedentary() != null
						&& castOther.getWorkSedentary() != null && this
						.getWorkSedentary()
						.equals(castOther.getWorkSedentary())))
				&& ((this.getWorkVigorous() == castOther.getWorkVigorous()) || (this
						.getWorkVigorous() != null
						&& castOther.getWorkVigorous() != null && this
						.getWorkVigorous().equals(castOther.getWorkVigorous())))
				&& ((this.getWorkVigorousDays() == castOther
						.getWorkVigorousDays()) || (this.getWorkVigorousDays() != null
						&& castOther.getWorkVigorousDays() != null && this
						.getWorkVigorousDays().equals(
								castOther.getWorkVigorousDays())))
				&& ((this.getWorkVigorousHours() == castOther
						.getWorkVigorousHours()) || (this
						.getWorkVigorousHours() != null
						&& castOther.getWorkVigorousHours() != null && this
						.getWorkVigorousHours().equals(
								castOther.getWorkVigorousHours())))
				&& ((this.getWorkVigorousMinutes() == castOther
						.getWorkVigorousMinutes()) || (this
						.getWorkVigorousMinutes() != null
						&& castOther.getWorkVigorousMinutes() != null && this
						.getWorkVigorousMinutes().equals(
								castOther.getWorkVigorousMinutes())))
				&& ((this.getWorkVigorousTotal() == castOther
						.getWorkVigorousTotal()) || (this
						.getWorkVigorousTotal() != null
						&& castOther.getWorkVigorousTotal() != null && this
						.getWorkVigorousTotal().equals(
								castOther.getWorkVigorousTotal())))
				&& ((this.getWorkModerate() == castOther.getWorkModerate()) || (this
						.getWorkModerate() != null
						&& castOther.getWorkModerate() != null && this
						.getWorkModerate().equals(castOther.getWorkModerate())))
				&& ((this.getWorkModerateDays() == castOther
						.getWorkModerateDays()) || (this.getWorkModerateDays() != null
						&& castOther.getWorkModerateDays() != null && this
						.getWorkModerateDays().equals(
								castOther.getWorkModerateDays())))
				&& ((this.getWorkModerateHours() == castOther
						.getWorkModerateHours()) || (this
						.getWorkModerateHours() != null
						&& castOther.getWorkModerateHours() != null && this
						.getWorkModerateHours().equals(
								castOther.getWorkModerateHours())))
				&& ((this.getWorkModerateMins() == castOther
						.getWorkModerateMins()) || (this.getWorkModerateMins() != null
						&& castOther.getWorkModerateMins() != null && this
						.getWorkModerateMins().equals(
								castOther.getWorkModerateMins())))
				&& ((this.getWorkModerateTotal() == castOther
						.getWorkModerateTotal()) || (this
						.getWorkModerateTotal() != null
						&& castOther.getWorkModerateTotal() != null && this
						.getWorkModerateTotal().equals(
								castOther.getWorkModerateTotal())))
				&& ((this.getWorkDayHours() == castOther.getWorkDayHours()) || (this
						.getWorkDayHours() != null
						&& castOther.getWorkDayHours() != null && this
						.getWorkDayHours().equals(castOther.getWorkDayHours())))
				&& ((this.getWorkDayMins() == castOther.getWorkDayMins()) || (this
						.getWorkDayMins() != null
						&& castOther.getWorkDayMins() != null && this
						.getWorkDayMins().equals(castOther.getWorkDayMins())))
				&& ((this.getWorkDayTotal() == castOther.getWorkDayTotal()) || (this
						.getWorkDayTotal() != null
						&& castOther.getWorkDayTotal() != null && this
						.getWorkDayTotal().equals(castOther.getWorkDayTotal())))
				&& ((this.getTransportPhysical() == castOther
						.getTransportPhysical()) || (this
						.getTransportPhysical() != null
						&& castOther.getTransportPhysical() != null && this
						.getTransportPhysical().equals(
								castOther.getTransportPhysical())))
				&& ((this.getTransportPhysicalDays() == castOther
						.getTransportPhysicalDays()) || (this
						.getTransportPhysicalDays() != null
						&& castOther.getTransportPhysicalDays() != null && this
						.getTransportPhysicalDays().equals(
								castOther.getTransportPhysicalDays())))
				&& ((this.getTransportPhysicalHours() == castOther
						.getTransportPhysicalHours()) || (this
						.getTransportPhysicalHours() != null
						&& castOther.getTransportPhysicalHours() != null && this
						.getTransportPhysicalHours().equals(
								castOther.getTransportPhysicalHours())))
				&& ((this.getTransportPhysicalMins() == castOther
						.getTransportPhysicalMins()) || (this
						.getTransportPhysicalMins() != null
						&& castOther.getTransportPhysicalMins() != null && this
						.getTransportPhysicalMins().equals(
								castOther.getTransportPhysicalMins())))
				&& ((this.getTransportPhysicalTotal() == castOther
						.getTransportPhysicalTotal()) || (this
						.getTransportPhysicalTotal() != null
						&& castOther.getTransportPhysicalTotal() != null && this
						.getTransportPhysicalTotal().equals(
								castOther.getTransportPhysicalTotal())))
				&& ((this.getLeisurePhysical() == castOther
						.getLeisurePhysical()) || (this.getLeisurePhysical() != null
						&& castOther.getLeisurePhysical() != null && this
						.getLeisurePhysical().equals(
								castOther.getLeisurePhysical())))
				&& ((this.getLeisureVigorous() == castOther
						.getLeisureVigorous()) || (this.getLeisureVigorous() != null
						&& castOther.getLeisureVigorous() != null && this
						.getLeisureVigorous().equals(
								castOther.getLeisureVigorous())))
				&& ((this.getLeisureVigorousDays() == castOther
						.getLeisureVigorousDays()) || (this
						.getLeisureVigorousDays() != null
						&& castOther.getLeisureVigorousDays() != null && this
						.getLeisureVigorousDays().equals(
								castOther.getLeisureVigorousDays())))
				&& ((this.getLeisureVigorousHours() == castOther
						.getLeisureVigorousHours()) || (this
						.getLeisureVigorousHours() != null
						&& castOther.getLeisureVigorousHours() != null && this
						.getLeisureVigorousHours().equals(
								castOther.getLeisureVigorousHours())))
				&& ((this.getLeisureVigorousMins() == castOther
						.getLeisureVigorousMins()) || (this
						.getLeisureVigorousMins() != null
						&& castOther.getLeisureVigorousMins() != null && this
						.getLeisureVigorousMins().equals(
								castOther.getLeisureVigorousMins())))
				&& ((this.getLeisureVigorousTotal() == castOther
						.getLeisureVigorousTotal()) || (this
						.getLeisureVigorousTotal() != null
						&& castOther.getLeisureVigorousTotal() != null && this
						.getLeisureVigorousTotal().equals(
								castOther.getLeisureVigorousTotal())))
				&& ((this.getLeisureModerate() == castOther
						.getLeisureModerate()) || (this.getLeisureModerate() != null
						&& castOther.getLeisureModerate() != null && this
						.getLeisureModerate().equals(
								castOther.getLeisureModerate())))
				&& ((this.getLeisureModerateDays() == castOther
						.getLeisureModerateDays()) || (this
						.getLeisureModerateDays() != null
						&& castOther.getLeisureModerateDays() != null && this
						.getLeisureModerateDays().equals(
								castOther.getLeisureModerateDays())))
				&& ((this.getLeisureModerateHours() == castOther
						.getLeisureModerateHours()) || (this
						.getLeisureModerateHours() != null
						&& castOther.getLeisureModerateHours() != null && this
						.getLeisureModerateHours().equals(
								castOther.getLeisureModerateHours())))
				&& ((this.getLeisureModerateMins() == castOther
						.getLeisureModerateMins()) || (this
						.getLeisureModerateMins() != null
						&& castOther.getLeisureModerateMins() != null && this
						.getLeisureModerateMins().equals(
								castOther.getLeisureModerateMins())))
				&& ((this.getLeisureModerateTotal() == castOther
						.getLeisureModerateTotal()) || (this
						.getLeisureModerateTotal() != null
						&& castOther.getLeisureModerateTotal() != null && this
						.getLeisureModerateTotal().equals(
								castOther.getLeisureModerateTotal())))
				&& ((this.getSittingHours() == castOther.getSittingHours()) || (this
						.getSittingHours() != null
						&& castOther.getSittingHours() != null && this
						.getSittingHours().equals(castOther.getSittingHours())))
				&& ((this.getSittingWorkHours() == castOther
						.getSittingWorkHours()) || (this.getSittingWorkHours() != null
						&& castOther.getSittingWorkHours() != null && this
						.getSittingWorkHours().equals(
								castOther.getSittingWorkHours())))
				&& ((this.getSittingWorkMins() == castOther
						.getSittingWorkMins()) || (this.getSittingWorkMins() != null
						&& castOther.getSittingWorkMins() != null && this
						.getSittingWorkMins().equals(
								castOther.getSittingWorkMins())))
				&& ((this.getSittingWorkTotal() == castOther
						.getSittingWorkTotal()) || (this.getSittingWorkTotal() != null
						&& castOther.getSittingWorkTotal() != null && this
						.getSittingWorkTotal().equals(
								castOther.getSittingWorkTotal())))
				&& ((this.getTvWeekHours() == castOther.getTvWeekHours()) || (this
						.getTvWeekHours() != null
						&& castOther.getTvWeekHours() != null && this
						.getTvWeekHours().equals(castOther.getTvWeekHours())))
				&& ((this.getTvWeekMins() == castOther.getTvWeekMins()) || (this
						.getTvWeekMins() != null
						&& castOther.getTvWeekMins() != null && this
						.getTvWeekMins().equals(castOther.getTvWeekMins())))
				&& ((this.getTvWeekTotal() == castOther.getTvWeekTotal()) || (this
						.getTvWeekTotal() != null
						&& castOther.getTvWeekTotal() != null && this
						.getTvWeekTotal().equals(castOther.getTvWeekTotal())))
				&& ((this.getTvWeekendHours() == castOther.getTvWeekendHours()) || (this
						.getTvWeekendHours() != null
						&& castOther.getTvWeekendHours() != null && this
						.getTvWeekendHours().equals(
								castOther.getTvWeekendHours())))
				&& ((this.getTvWeekendMins() == castOther.getTvWeekendMins()) || (this
						.getTvWeekendMins() != null
						&& castOther.getTvWeekendMins() != null && this
						.getTvWeekendMins()
						.equals(castOther.getTvWeekendMins())))
				&& ((this.getTvWeekendTotal() == castOther.getTvWeekendTotal()) || (this
						.getTvWeekendTotal() != null
						&& castOther.getTvWeekendTotal() != null && this
						.getTvWeekendTotal().equals(
								castOther.getTvWeekendTotal())))
				&& ((this.getPcWeekHours() == castOther.getPcWeekHours()) || (this
						.getPcWeekHours() != null
						&& castOther.getPcWeekHours() != null && this
						.getPcWeekHours().equals(castOther.getPcWeekHours())))
				&& ((this.getPcWeekMins() == castOther.getPcWeekMins()) || (this
						.getPcWeekMins() != null
						&& castOther.getPcWeekMins() != null && this
						.getPcWeekMins().equals(castOther.getPcWeekMins())))
				&& ((this.getPcWeekTotal() == castOther.getPcWeekTotal()) || (this
						.getPcWeekTotal() != null
						&& castOther.getPcWeekTotal() != null && this
						.getPcWeekTotal().equals(castOther.getPcWeekTotal())))
				&& ((this.getPcWeekendHours() == castOther.getPcWeekendHours()) || (this
						.getPcWeekendHours() != null
						&& castOther.getPcWeekendHours() != null && this
						.getPcWeekendHours().equals(
								castOther.getPcWeekendHours())))
				&& ((this.getPcWeekendMins() == castOther.getPcWeekendMins()) || (this
						.getPcWeekendMins() != null
						&& castOther.getPcWeekendMins() != null && this
						.getPcWeekendMins()
						.equals(castOther.getPcWeekendMins())))
				&& ((this.getPcWeekendTotal() == castOther.getPcWeekendTotal()) || (this
						.getPcWeekendTotal() != null
						&& castOther.getPcWeekendTotal() != null && this
						.getPcWeekendTotal().equals(
								castOther.getPcWeekendTotal())))
				&& ((this.getSitTravelWeekHours() == castOther
						.getSitTravelWeekHours()) || (this
						.getSitTravelWeekHours() != null
						&& castOther.getSitTravelWeekHours() != null && this
						.getSitTravelWeekHours().equals(
								castOther.getSitTravelWeekHours())))
				&& ((this.getSitTravelWeekMins() == castOther
						.getSitTravelWeekMins()) || (this
						.getSitTravelWeekMins() != null
						&& castOther.getSitTravelWeekMins() != null && this
						.getSitTravelWeekMins().equals(
								castOther.getSitTravelWeekMins())))
				&& ((this.getSitTravelWeekTotal() == castOther
						.getSitTravelWeekTotal()) || (this
						.getSitTravelWeekTotal() != null
						&& castOther.getSitTravelWeekTotal() != null && this
						.getSitTravelWeekTotal().equals(
								castOther.getSitTravelWeekTotal())))
				&& ((this.getSitTravelWeekendHours() == castOther
						.getSitTravelWeekendHours()) || (this
						.getSitTravelWeekendHours() != null
						&& castOther.getSitTravelWeekendHours() != null && this
						.getSitTravelWeekendHours().equals(
								castOther.getSitTravelWeekendHours())))
				&& ((this.getSitTravelWeekendMins() == castOther
						.getSitTravelWeekendMins()) || (this
						.getSitTravelWeekendMins() != null
						&& castOther.getSitTravelWeekendMins() != null && this
						.getSitTravelWeekendMins().equals(
								castOther.getSitTravelWeekendMins())))
				&& ((this.getSitTravelWeekendTotal() == castOther
						.getSitTravelWeekendTotal()) || (this
						.getSitTravelWeekendTotal() != null
						&& castOther.getSitTravelWeekendTotal() != null && this
						.getSitTravelWeekendTotal().equals(
								castOther.getSitTravelWeekendTotal())))
				&& ((this.getSitSocialWeekHours() == castOther
						.getSitSocialWeekHours()) || (this
						.getSitSocialWeekHours() != null
						&& castOther.getSitSocialWeekHours() != null && this
						.getSitSocialWeekHours().equals(
								castOther.getSitSocialWeekHours())))
				&& ((this.getSitSocialWeekMins() == castOther
						.getSitSocialWeekMins()) || (this
						.getSitSocialWeekMins() != null
						&& castOther.getSitSocialWeekMins() != null && this
						.getSitSocialWeekMins().equals(
								castOther.getSitSocialWeekMins())))
				&& ((this.getSitSocialWeekTotal() == castOther
						.getSitSocialWeekTotal()) || (this
						.getSitSocialWeekTotal() != null
						&& castOther.getSitSocialWeekTotal() != null && this
						.getSitSocialWeekTotal().equals(
								castOther.getSitSocialWeekTotal())))
				&& ((this.getSitSocialWeekendHours() == castOther
						.getSitSocialWeekendHours()) || (this
						.getSitSocialWeekendHours() != null
						&& castOther.getSitSocialWeekendHours() != null && this
						.getSitSocialWeekendHours().equals(
								castOther.getSitSocialWeekendHours())))
				&& ((this.getSitSocialWeekendMins() == castOther
						.getSitSocialWeekendMins()) || (this
						.getSitSocialWeekendMins() != null
						&& castOther.getSitSocialWeekendMins() != null && this
						.getSitSocialWeekendMins().equals(
								castOther.getSitSocialWeekendMins())))
				&& ((this.getSitSocialWeekendTotal() == castOther
						.getSitSocialWeekendTotal()) || (this
						.getSitSocialWeekendTotal() != null
						&& castOther.getSitSocialWeekendTotal() != null && this
						.getSitSocialWeekendTotal().equals(
								castOther.getSitSocialWeekendTotal())))
				&& ((this.getHoursRelaxWeek() == castOther.getHoursRelaxWeek()) || (this
						.getHoursRelaxWeek() != null
						&& castOther.getHoursRelaxWeek() != null && this
						.getHoursRelaxWeek().equals(
								castOther.getHoursRelaxWeek())))
				&& ((this.getMinsRelaxWeek() == castOther.getMinsRelaxWeek()) || (this
						.getMinsRelaxWeek() != null
						&& castOther.getMinsRelaxWeek() != null && this
						.getMinsRelaxWeek()
						.equals(castOther.getMinsRelaxWeek())))
				&& ((this.getTotalRelaxWeek() == castOther.getTotalRelaxWeek()) || (this
						.getTotalRelaxWeek() != null
						&& castOther.getTotalRelaxWeek() != null && this
						.getTotalRelaxWeek().equals(
								castOther.getTotalRelaxWeek())))
				&& ((this.getHoursRelaxWeekend() == castOther
						.getHoursRelaxWeekend()) || (this
						.getHoursRelaxWeekend() != null
						&& castOther.getHoursRelaxWeekend() != null && this
						.getHoursRelaxWeekend().equals(
								castOther.getHoursRelaxWeekend())))
				&& ((this.getMinsRelaxWeekend() == castOther
						.getMinsRelaxWeekend()) || (this.getMinsRelaxWeekend() != null
						&& castOther.getMinsRelaxWeekend() != null && this
						.getMinsRelaxWeekend().equals(
								castOther.getMinsRelaxWeekend())))
				&& ((this.getTotalRelaxWeekend() == castOther
						.getTotalRelaxWeekend()) || (this
						.getTotalRelaxWeekend() != null
						&& castOther.getTotalRelaxWeekend() != null && this
						.getTotalRelaxWeekend().equals(
								castOther.getTotalRelaxWeekend())))
				&& ((this.getHoursChurch() == castOther.getHoursChurch()) || (this
						.getHoursChurch() != null
						&& castOther.getHoursChurch() != null && this
						.getHoursChurch().equals(castOther.getHoursChurch())))
				&& ((this.getMinsChurch() == castOther.getMinsChurch()) || (this
						.getMinsChurch() != null
						&& castOther.getMinsChurch() != null && this
						.getMinsChurch().equals(castOther.getMinsChurch())))
				&& ((this.getTotalChurchWeek() == castOther
						.getTotalChurchWeek()) || (this.getTotalChurchWeek() != null
						&& castOther.getTotalChurchWeek() != null && this
						.getTotalChurchWeek().equals(
								castOther.getTotalChurchWeek())))
				&& ((this.getHoursChurchWeekend() == castOther
						.getHoursChurchWeekend()) || (this
						.getHoursChurchWeekend() != null
						&& castOther.getHoursChurchWeekend() != null && this
						.getHoursChurchWeekend().equals(
								castOther.getHoursChurchWeekend())))
				&& ((this.getMinsChurchWeekend() == castOther
						.getMinsChurchWeekend()) || (this
						.getMinsChurchWeekend() != null
						&& castOther.getMinsChurchWeekend() != null && this
						.getMinsChurchWeekend().equals(
								castOther.getMinsChurchWeekend())))
				&& ((this.getTotalChurchWeekend() == castOther
						.getTotalChurchWeekend()) || (this
						.getTotalChurchWeekend() != null
						&& castOther.getTotalChurchWeekend() != null && this
						.getTotalChurchWeekend().equals(
								castOther.getTotalChurchWeekend())))
				&& ((this.getSleepTimeWeek() == castOther.getSleepTimeWeek()) || (this
						.getSleepTimeWeek() != null
						&& castOther.getSleepTimeWeek() != null && this
						.getSleepTimeWeek()
						.equals(castOther.getSleepTimeWeek())))
				&& ((this.getWakeupTimeWeek() == castOther.getWakeupTimeWeek()) || (this
						.getWakeupTimeWeek() != null
						&& castOther.getWakeupTimeWeek() != null && this
						.getWakeupTimeWeek().equals(
								castOther.getWakeupTimeWeek())))
				&& ((this.getHoursSleepWeek() == castOther.getHoursSleepWeek()) || (this
						.getHoursSleepWeek() != null
						&& castOther.getHoursSleepWeek() != null && this
						.getHoursSleepWeek().equals(
								castOther.getHoursSleepWeek())))
				&& ((this.getSleepTimeWeekend() == castOther
						.getSleepTimeWeekend()) || (this.getSleepTimeWeekend() != null
						&& castOther.getSleepTimeWeekend() != null && this
						.getSleepTimeWeekend().equals(
								castOther.getSleepTimeWeekend())))
				&& ((this.getWakeupTimeWeekend() == castOther
						.getWakeupTimeWeekend()) || (this
						.getWakeupTimeWeekend() != null
						&& castOther.getWakeupTimeWeekend() != null && this
						.getWakeupTimeWeekend().equals(
								castOther.getWakeupTimeWeekend())))
				&& ((this.getHoursSleepWeekend() == castOther
						.getHoursSleepWeekend()) || (this
						.getHoursSleepWeekend() != null
						&& castOther.getHoursSleepWeekend() != null && this
						.getHoursSleepWeekend().equals(
								castOther.getHoursSleepWeekend())))
				&& ((this.getEndTime() == castOther.getEndTime()) || (this
						.getEndTime() != null && castOther.getEndTime() != null && this
						.getEndTime().equals(castOther.getEndTime())))
				&& ((this.getStandingHeightMm() == castOther
						.getStandingHeightMm()) || (this.getStandingHeightMm() != null
						&& castOther.getStandingHeightMm() != null && this
						.getStandingHeightMm().equals(
								castOther.getStandingHeightMm())))
				&& ((this.getWeightKg() == castOther.getWeightKg()) || (this
						.getWeightKg() != null
						&& castOther.getWeightKg() != null && this
						.getWeightKg().equals(castOther.getWeightKg())))
				&& ((this.getWaistCircumferenceMm() == castOther
						.getWaistCircumferenceMm()) || (this
						.getWaistCircumferenceMm() != null
						&& castOther.getWaistCircumferenceMm() != null && this
						.getWaistCircumferenceMm().equals(
								castOther.getWaistCircumferenceMm())))
				&& ((this.getHipCircumferenceMm() == castOther
						.getHipCircumferenceMm()) || (this
						.getHipCircumferenceMm() != null
						&& castOther.getHipCircumferenceMm() != null && this
						.getHipCircumferenceMm().equals(
								castOther.getHipCircumferenceMm())))
				&& ((this.getSystolic1() == castOther.getSystolic1()) || (this
						.getSystolic1() != null
						&& castOther.getSystolic1() != null && this
						.getSystolic1().equals(castOther.getSystolic1())))
				&& ((this.getSystolic2() == castOther.getSystolic2()) || (this
						.getSystolic2() != null
						&& castOther.getSystolic2() != null && this
						.getSystolic2().equals(castOther.getSystolic2())))
				&& ((this.getSystolic3() == castOther.getSystolic3()) || (this
						.getSystolic3() != null
						&& castOther.getSystolic3() != null && this
						.getSystolic3().equals(castOther.getSystolic3())))
				&& ((this.getBpSysAvg() == castOther.getBpSysAvg()) || (this
						.getBpSysAvg() != null
						&& castOther.getBpSysAvg() != null && this
						.getBpSysAvg().equals(castOther.getBpSysAvg())))
				&& ((this.getDiastolic1() == castOther.getDiastolic1()) || (this
						.getDiastolic1() != null
						&& castOther.getDiastolic1() != null && this
						.getDiastolic1().equals(castOther.getDiastolic1())))
				&& ((this.getDiastolic2() == castOther.getDiastolic2()) || (this
						.getDiastolic2() != null
						&& castOther.getDiastolic2() != null && this
						.getDiastolic2().equals(castOther.getDiastolic2())))
				&& ((this.getDiastolic3() == castOther.getDiastolic3()) || (this
						.getDiastolic3() != null
						&& castOther.getDiastolic3() != null && this
						.getDiastolic3().equals(castOther.getDiastolic3())))
				&& ((this.getBpDiaAvg() == castOther.getBpDiaAvg()) || (this
						.getBpDiaAvg() != null
						&& castOther.getBpDiaAvg() != null && this
						.getBpDiaAvg().equals(castOther.getBpDiaAvg())))
				&& ((this.getTimeBp() == castOther.getTimeBp()) || (this
						.getTimeBp() != null && castOther.getTimeBp() != null && this
						.getTimeBp().equals(castOther.getTimeBp())))
				&& ((this.getPulse1() == castOther.getPulse1()) || (this
						.getPulse1() != null && castOther.getPulse1() != null && this
						.getPulse1().equals(castOther.getPulse1())))
				&& ((this.getPulse2() == castOther.getPulse2()) || (this
						.getPulse2() != null && castOther.getPulse2() != null && this
						.getPulse2().equals(castOther.getPulse2())))
				&& ((this.getPulse3() == castOther.getPulse3()) || (this
						.getPulse3() != null && castOther.getPulse3() != null && this
						.getPulse3().equals(castOther.getPulse3())))
				&& ((this.getPulseAvg() == castOther.getPulseAvg()) || (this
						.getPulseAvg() != null
						&& castOther.getPulseAvg() != null && this
						.getPulseAvg().equals(castOther.getPulseAvg())))
				&& ((this.getCollectorMeasurements() == castOther
						.getCollectorMeasurements()) || (this
						.getCollectorMeasurements() != null
						&& castOther.getCollectorMeasurements() != null && this
						.getCollectorMeasurements().equals(
								castOther.getCollectorMeasurements())))
				&& ((this.getNotesAnthropometry() == castOther
						.getNotesAnthropometry()) || (this
						.getNotesAnthropometry() != null
						&& castOther.getNotesAnthropometry() != null && this
						.getNotesAnthropometry().equals(
								castOther.getNotesAnthropometry())))
				&& ((this.getUltrasound() == castOther.getUltrasound()) || (this
						.getUltrasound() != null
						&& castOther.getUltrasound() != null && this
						.getUltrasound().equals(castOther.getUltrasound())))
				&& ((this.getVisceralFat() == castOther.getVisceralFat()) || (this
						.getVisceralFat() != null
						&& castOther.getVisceralFat() != null && this
						.getVisceralFat().equals(castOther.getVisceralFat())))
				&& ((this.getSubcutaneousFat() == castOther
						.getSubcutaneousFat()) || (this.getSubcutaneousFat() != null
						&& castOther.getSubcutaneousFat() != null && this
						.getSubcutaneousFat().equals(
								castOther.getSubcutaneousFat())))
				&& ((this.getUltrasoundOperator() == castOther
						.getUltrasoundOperator()) || (this
						.getUltrasoundOperator() != null
						&& castOther.getUltrasoundOperator() != null && this
						.getUltrasoundOperator().equals(
								castOther.getUltrasoundOperator())))
				&& ((this.getDateUltrasoundTaken() == castOther
						.getDateUltrasoundTaken()) || (this
						.getDateUltrasoundTaken() != null
						&& castOther.getDateUltrasoundTaken() != null && this
						.getDateUltrasoundTaken().equals(
								castOther.getDateUltrasoundTaken())))
				&& ((this.getCimt() == castOther.getCimt()) || (this.getCimt() != null
						&& castOther.getCimt() != null && this.getCimt()
						.equals(castOther.getCimt())))
				&& ((this.getMinCimtRight() == castOther.getMinCimtRight()) || (this
						.getMinCimtRight() != null
						&& castOther.getMinCimtRight() != null && this
						.getMinCimtRight().equals(castOther.getMinCimtRight())))
				&& ((this.getMaxCimtRight() == castOther.getMaxCimtRight()) || (this
						.getMaxCimtRight() != null
						&& castOther.getMaxCimtRight() != null && this
						.getMaxCimtRight().equals(castOther.getMaxCimtRight())))
				&& ((this.getMeanCimtRight() == castOther.getMeanCimtRight()) || (this
						.getMeanCimtRight() != null
						&& castOther.getMeanCimtRight() != null && this
						.getMeanCimtRight()
						.equals(castOther.getMeanCimtRight())))
				&& ((this.getMinCimtLeft() == castOther.getMinCimtLeft()) || (this
						.getMinCimtLeft() != null
						&& castOther.getMinCimtLeft() != null && this
						.getMinCimtLeft().equals(castOther.getMinCimtLeft())))
				&& ((this.getMaxCimtLeft() == castOther.getMaxCimtLeft()) || (this
						.getMaxCimtLeft() != null
						&& castOther.getMaxCimtLeft() != null && this
						.getMaxCimtLeft().equals(castOther.getMaxCimtLeft())))
				&& ((this.getMeanCimtLeft() == castOther.getMeanCimtLeft()) || (this
						.getMeanCimtLeft() != null
						&& castOther.getMeanCimtLeft() != null && this
						.getMeanCimtLeft().equals(castOther.getMeanCimtLeft())))
				&& ((this.getUltrasoundNotes() == castOther
						.getUltrasoundNotes()) || (this.getUltrasoundNotes() != null
						&& castOther.getUltrasoundNotes() != null && this
						.getUltrasoundNotes().equals(
								castOther.getUltrasoundNotes())))
				&& ((this.getFasting() == castOther.getFasting()) || (this
						.getFasting() != null && castOther.getFasting() != null && this
						.getFasting().equals(castOther.getFasting())))
				&& ((this.getTimeAte() == castOther.getTimeAte()) || (this
						.getTimeAte() != null && castOther.getTimeAte() != null && this
						.getTimeAte().equals(castOther.getTimeAte())))
				&& ((this.getFastingConfirmation() == castOther
						.getFastingConfirmation()) || (this
						.getFastingConfirmation() != null
						&& castOther.getFastingConfirmation() != null && this
						.getFastingConfirmation().equals(
								castOther.getFastingConfirmation())))
				&& ((this.getRed() == castOther.getRed()) || (this.getRed() != null
						&& castOther.getRed() != null && this.getRed().equals(
						castOther.getRed())))
				&& ((this.getNoRedTubes() == castOther.getNoRedTubes()) || (this
						.getNoRedTubes() != null
						&& castOther.getNoRedTubes() != null && this
						.getNoRedTubes().equals(castOther.getNoRedTubes())))
				&& ((this.getPurple() == castOther.getPurple()) || (this
						.getPurple() != null && castOther.getPurple() != null && this
						.getPurple().equals(castOther.getPurple())))
				&& ((this.getNoPurpleTubes() == castOther.getNoPurpleTubes()) || (this
						.getNoPurpleTubes() != null
						&& castOther.getNoPurpleTubes() != null && this
						.getNoPurpleTubes()
						.equals(castOther.getNoPurpleTubes())))
				&& ((this.getGrey() == castOther.getGrey()) || (this.getGrey() != null
						&& castOther.getGrey() != null && this.getGrey()
						.equals(castOther.getGrey())))
				&& ((this.getNoGreyTubes() == castOther.getNoGreyTubes()) || (this
						.getNoGreyTubes() != null
						&& castOther.getNoGreyTubes() != null && this
						.getNoGreyTubes().equals(castOther.getNoGreyTubes())))
				&& ((this.getNotesBlood() == castOther.getNotesBlood()) || (this
						.getNotesBlood() != null
						&& castOther.getNotesBlood() != null && this
						.getNotesBlood().equals(castOther.getNotesBlood())))
				&& ((this.getPhelbotomist() == castOther.getPhelbotomist()) || (this
						.getPhelbotomist() != null
						&& castOther.getPhelbotomist() != null && this
						.getPhelbotomist().equals(castOther.getPhelbotomist())))
				&& ((this.getDateBloodTaken() == castOther.getDateBloodTaken()) || (this
						.getDateBloodTaken() != null
						&& castOther.getDateBloodTaken() != null && this
						.getDateBloodTaken().equals(
								castOther.getDateBloodTaken())))
				&& ((this.getTimeBloodTaken() == castOther.getTimeBloodTaken()) || (this
						.getTimeBloodTaken() != null
						&& castOther.getTimeBloodTaken() != null && this
						.getTimeBloodTaken().equals(
								castOther.getTimeBloodTaken())))
				&& ((this.getComments() == castOther.getComments()) || (this
						.getComments() != null
						&& castOther.getComments() != null && this
						.getComments().equals(castOther.getComments())))
				&& ((this.getTestedHiv() == castOther.getTestedHiv()) || (this
						.getTestedHiv() != null
						&& castOther.getTestedHiv() != null && this
						.getTestedHiv().equals(castOther.getTestedHiv())))
				&& ((this.getHivStatus() == castOther.getHivStatus()) || (this
						.getHivStatus() != null
						&& castOther.getHivStatus() != null && this
						.getHivStatus().equals(castOther.getHivStatus())))
				&& ((this.getHivPositive() == castOther.getHivPositive()) || (this
						.getHivPositive() != null
						&& castOther.getHivPositive() != null && this
						.getHivPositive().equals(castOther.getHivPositive())))
				&& ((this.getHivMedication() == castOther.getHivMedication()) || (this
						.getHivMedication() != null
						&& castOther.getHivMedication() != null && this
						.getHivMedication()
						.equals(castOther.getHivMedication())))
				&& ((this.getTraditionalMedHiv() == castOther
						.getTraditionalMedHiv()) || (this
						.getTraditionalMedHiv() != null
						&& castOther.getTraditionalMedHiv() != null && this
						.getTraditionalMedHiv().equals(
								castOther.getTraditionalMedHiv())))
				&& ((this.getAgreeHivtest() == castOther.getAgreeHivtest()) || (this
						.getAgreeHivtest() != null
						&& castOther.getAgreeHivtest() != null && this
						.getAgreeHivtest().equals(castOther.getAgreeHivtest())))
				&& ((this.getResultHiv() == castOther.getResultHiv()) || (this
						.getResultHiv() != null
						&& castOther.getResultHiv() != null && this
						.getResultHiv().equals(castOther.getResultHiv())))
				&& ((this.getPlasmaBatch() == castOther.getPlasmaBatch()) || (this
						.getPlasmaBatch() != null
						&& castOther.getPlasmaBatch() != null && this
						.getPlasmaBatch().equals(castOther.getPlasmaBatch())))
				&& ((this.getPlasmaBox() == castOther.getPlasmaBox()) || (this
						.getPlasmaBox() != null
						&& castOther.getPlasmaBox() != null && this
						.getPlasmaBox().equals(castOther.getPlasmaBox())))
				&& ((this.getDatePlasmaReceived() == castOther
						.getDatePlasmaReceived()) || (this
						.getDatePlasmaReceived() != null
						&& castOther.getDatePlasmaReceived() != null && this
						.getDatePlasmaReceived().equals(
								castOther.getDatePlasmaReceived())))
				&& ((this.getIsHaemolysed() == castOther.getIsHaemolysed()) || (this
						.getIsHaemolysed() != null
						&& castOther.getIsHaemolysed() != null && this
						.getIsHaemolysed().equals(castOther.getIsHaemolysed())))
				&& ((this.getBiomarkerNotes() == castOther.getBiomarkerNotes()) || (this
						.getBiomarkerNotes() != null
						&& castOther.getBiomarkerNotes() != null && this
						.getBiomarkerNotes().equals(
								castOther.getBiomarkerNotes())))
				&& ((this.getSerumTechName() == castOther.getSerumTechName()) || (this
						.getSerumTechName() != null
						&& castOther.getSerumTechName() != null && this
						.getSerumTechName()
						.equals(castOther.getSerumTechName())))
				&& ((this.getGlucose() == castOther.getGlucose()) || (this
						.getGlucose() != null && castOther.getGlucose() != null && this
						.getGlucose().equals(castOther.getGlucose())))
				&& ((this.getGlucose2() == castOther.getGlucose2()) || (this
						.getGlucose2() != null
						&& castOther.getGlucose2() != null && this
						.getGlucose2().equals(castOther.getGlucose2())))
				&& ((this.getGlucose3() == castOther.getGlucose3()) || (this
						.getGlucose3() != null
						&& castOther.getGlucose3() != null && this
						.getGlucose3().equals(castOther.getGlucose3())))
				&& ((this.getDateGlucose() == castOther.getDateGlucose()) || (this
						.getDateGlucose() != null
						&& castOther.getDateGlucose() != null && this
						.getDateGlucose().equals(castOther.getDateGlucose())))
				&& ((this.getGlucoseComments() == castOther
						.getGlucoseComments()) || (this.getGlucoseComments() != null
						&& castOther.getGlucoseComments() != null && this
						.getGlucoseComments().equals(
								castOther.getGlucoseComments())))
				&& ((this.getSerumBatch() == castOther.getSerumBatch()) || (this
						.getSerumBatch() != null
						&& castOther.getSerumBatch() != null && this
						.getSerumBatch().equals(castOther.getSerumBatch())))
				&& ((this.getSerumBox() == castOther.getSerumBox()) || (this
						.getSerumBox() != null
						&& castOther.getSerumBox() != null && this
						.getSerumBox().equals(castOther.getSerumBox())))
				&& ((this.getDateSerumReceived() == castOther
						.getDateSerumReceived()) || (this
						.getDateSerumReceived() != null
						&& castOther.getDateSerumReceived() != null && this
						.getDateSerumReceived().equals(
								castOther.getDateSerumReceived())))
				&& ((this.getIsSerumTestable() == castOther
						.getIsSerumTestable()) || (this.getIsSerumTestable() != null
						&& castOther.getIsSerumTestable() != null && this
						.getIsSerumTestable().equals(
								castOther.getIsSerumTestable())))
				&& ((this.getSerumComments() == castOther.getSerumComments()) || (this
						.getSerumComments() != null
						&& castOther.getSerumComments() != null && this
						.getSerumComments()
						.equals(castOther.getSerumComments())))
				&& ((this.getSCreatinine() == castOther.getSCreatinine()) || (this
						.getSCreatinine() != null
						&& castOther.getSCreatinine() != null && this
						.getSCreatinine().equals(castOther.getSCreatinine())))
				&& ((this.getPlasmaTechName() == castOther.getPlasmaTechName()) || (this
						.getPlasmaTechName() != null
						&& castOther.getPlasmaTechName() != null && this
						.getPlasmaTechName().equals(
								castOther.getPlasmaTechName())))
				&& ((this.getInsulin() == castOther.getInsulin()) || (this
						.getInsulin() != null && castOther.getInsulin() != null && this
						.getInsulin().equals(castOther.getInsulin())))
				&& ((this.getInsulin2() == castOther.getInsulin2()) || (this
						.getInsulin2() != null
						&& castOther.getInsulin2() != null && this
						.getInsulin2().equals(castOther.getInsulin2())))
				&& ((this.getInsulin3() == castOther.getInsulin3()) || (this
						.getInsulin3() != null
						&& castOther.getInsulin3() != null && this
						.getInsulin3().equals(castOther.getInsulin3())))
				&& ((this.getDateInsulinTested() == castOther
						.getDateInsulinTested()) || (this
						.getDateInsulinTested() != null
						&& castOther.getDateInsulinTested() != null && this
						.getDateInsulinTested().equals(
								castOther.getDateInsulinTested())))
				&& ((this.getInsulinComments() == castOther
						.getInsulinComments()) || (this.getInsulinComments() != null
						&& castOther.getInsulinComments() != null && this
						.getInsulinComments().equals(
								castOther.getInsulinComments())))
				&& ((this.getHdl() == castOther.getHdl()) || (this.getHdl() != null
						&& castOther.getHdl() != null && this.getHdl().equals(
						castOther.getHdl())))
				&& ((this.getHdl2() == castOther.getHdl2()) || (this.getHdl2() != null
						&& castOther.getHdl2() != null && this.getHdl2()
						.equals(castOther.getHdl2())))
				&& ((this.getHdl3() == castOther.getHdl3()) || (this.getHdl3() != null
						&& castOther.getHdl3() != null && this.getHdl3()
						.equals(castOther.getHdl3())))
				&& ((this.getLdl() == castOther.getLdl()) || (this.getLdl() != null
						&& castOther.getLdl() != null && this.getLdl().equals(
						castOther.getLdl())))
				&& ((this.getLdl2() == castOther.getLdl2()) || (this.getLdl2() != null
						&& castOther.getLdl2() != null && this.getLdl2()
						.equals(castOther.getLdl2())))
				&& ((this.getLdl3() == castOther.getLdl3()) || (this.getLdl3() != null
						&& castOther.getLdl3() != null && this.getLdl3()
						.equals(castOther.getLdl3())))
				&& ((this.getCholesterol1() == castOther.getCholesterol1()) || (this
						.getCholesterol1() != null
						&& castOther.getCholesterol1() != null && this
						.getCholesterol1().equals(castOther.getCholesterol1())))
				&& ((this.getCholesterol2() == castOther.getCholesterol2()) || (this
						.getCholesterol2() != null
						&& castOther.getCholesterol2() != null && this
						.getCholesterol2().equals(castOther.getCholesterol2())))
				&& ((this.getCholesterol3() == castOther.getCholesterol3()) || (this
						.getCholesterol3() != null
						&& castOther.getCholesterol3() != null && this
						.getCholesterol3().equals(castOther.getCholesterol3())))
				&& ((this.getTriglycerides() == castOther.getTriglycerides()) || (this
						.getTriglycerides() != null
						&& castOther.getTriglycerides() != null && this
						.getTriglycerides()
						.equals(castOther.getTriglycerides())))
				&& ((this.getTriglycerides2() == castOther.getTriglycerides2()) || (this
						.getTriglycerides2() != null
						&& castOther.getTriglycerides2() != null && this
						.getTriglycerides2().equals(
								castOther.getTriglycerides2())))
				&& ((this.getTriglycerides3() == castOther.getTriglycerides3()) || (this
						.getTriglycerides3() != null
						&& castOther.getTriglycerides3() != null && this
						.getTriglycerides3().equals(
								castOther.getTriglycerides3())))
				&& ((this.getDateLipidsTested() == castOther
						.getDateLipidsTested()) || (this.getDateLipidsTested() != null
						&& castOther.getDateLipidsTested() != null && this
						.getDateLipidsTested().equals(
								castOther.getDateLipidsTested())))
				&& ((this.getLipidComments() == castOther.getLipidComments()) || (this
						.getLipidComments() != null
						&& castOther.getLipidComments() != null && this
						.getLipidComments()
						.equals(castOther.getLipidComments())))
				&& ((this.getUrineBatch() == castOther.getUrineBatch()) || (this
						.getUrineBatch() != null
						&& castOther.getUrineBatch() != null && this
						.getUrineBatch().equals(castOther.getUrineBatch())))
				&& ((this.getUrineBox() == castOther.getUrineBox()) || (this
						.getUrineBox() != null
						&& castOther.getUrineBox() != null && this
						.getUrineBox().equals(castOther.getUrineBox())))
				&& ((this.getDateUrineReceived() == castOther
						.getDateUrineReceived()) || (this
						.getDateUrineReceived() != null
						&& castOther.getDateUrineReceived() != null && this
						.getDateUrineReceived().equals(
								castOther.getDateUrineReceived())))
				&& ((this.getUrineTechName() == castOther.getUrineTechName()) || (this
						.getUrineTechName() != null
						&& castOther.getUrineTechName() != null && this
						.getUrineTechName()
						.equals(castOther.getUrineTechName())))
				&& ((this.getUrCreatinine() == castOther.getUrCreatinine()) || (this
						.getUrCreatinine() != null
						&& castOther.getUrCreatinine() != null && this
						.getUrCreatinine().equals(castOther.getUrCreatinine())))
				&& ((this.getUrAlbumin() == castOther.getUrAlbumin()) || (this
						.getUrAlbumin() != null
						&& castOther.getUrAlbumin() != null && this
						.getUrAlbumin().equals(castOther.getUrAlbumin())))
				&& ((this.getAcr() == castOther.getAcr()) || (this.getAcr() != null
						&& castOther.getAcr() != null && this.getAcr().equals(
						castOther.getAcr())))
				&& ((this.getUrProtein() == castOther.getUrProtein()) || (this
						.getUrProtein() != null
						&& castOther.getUrProtein() != null && this
						.getUrProtein().equals(castOther.getUrProtein())))
				&& ((this.getDateUrineTested() == castOther
						.getDateUrineTested()) || (this.getDateUrineTested() != null
						&& castOther.getDateUrineTested() != null && this
						.getDateUrineTested().equals(
								castOther.getDateUrineTested())))
				&& ((this.getUrineComments() == castOther.getUrineComments()) || (this
						.getUrineComments() != null
						&& castOther.getUrineComments() != null && this
						.getUrineComments()
						.equals(castOther.getUrineComments())))
				&& ((this.getUrineSample() == castOther.getUrineSample()) || (this
						.getUrineSample() != null
						&& castOther.getUrineSample() != null && this
						.getUrineSample().equals(castOther.getUrineSample())))
				&& ((this.getInformedConsent() == castOther
						.getInformedConsent()) || (this.getInformedConsent() != null
						&& castOther.getInformedConsent() != null && this
						.getInformedConsent().equals(
								castOther.getInformedConsent())))
				&& ((this.getQuestionnaire() == castOther.getQuestionnaire()) || (this
						.getQuestionnaire() != null
						&& castOther.getQuestionnaire() != null && this
						.getQuestionnaire()
						.equals(castOther.getQuestionnaire())))
				&& ((this.getAnthropometrics() == castOther
						.getAnthropometrics()) || (this.getAnthropometrics() != null
						&& castOther.getAnthropometrics() != null && this
						.getAnthropometrics().equals(
								castOther.getAnthropometrics())))
				&& ((this.getBloodPressureDone() == castOther
						.getBloodPressureDone()) || (this
						.getBloodPressureDone() != null
						&& castOther.getBloodPressureDone() != null && this
						.getBloodPressureDone().equals(
								castOther.getBloodPressureDone())))
				&& ((this.getPulseDone() == castOther.getPulseDone()) || (this
						.getPulseDone() != null
						&& castOther.getPulseDone() != null && this
						.getPulseDone().equals(castOther.getPulseDone())))
				&& ((this.getBloodSamples() == castOther.getBloodSamples()) || (this
						.getBloodSamples() != null
						&& castOther.getBloodSamples() != null && this
						.getBloodSamples().equals(castOther.getBloodSamples())))
				&& ((this.getAbdominalUltrasound() == castOther
						.getAbdominalUltrasound()) || (this
						.getAbdominalUltrasound() != null
						&& castOther.getAbdominalUltrasound() != null && this
						.getAbdominalUltrasound().equals(
								castOther.getAbdominalUltrasound())))
				&& ((this.getTableCimt() == castOther.getTableCimt()) || (this
						.getTableCimt() != null
						&& castOther.getTableCimt() != null && this
						.getTableCimt().equals(castOther.getTableCimt())))
				&& ((this.getHivTest() == castOther.getHivTest()) || (this
						.getHivTest() != null && castOther.getHivTest() != null && this
						.getHivTest().equals(castOther.getHivTest())))
				&& ((this.getUrine() == castOther.getUrine()) || (this
						.getUrine() != null && castOther.getUrine() != null && this
						.getUrine().equals(castOther.getUrine())))
				&& ((this.getQualityControllerId() == castOther
						.getQualityControllerId()) || (this
						.getQualityControllerId() != null
						&& castOther.getQualityControllerId() != null && this
						.getQualityControllerId().equals(
								castOther.getQualityControllerId())))
				&& ((this.getReimbursement() == castOther.getReimbursement()) || (this
						.getReimbursement() != null
						&& castOther.getReimbursement() != null && this
						.getReimbursement()
						.equals(castOther.getReimbursement())))
				&& ((this.getTestResultsNotes() == castOther
						.getTestResultsNotes()) || (this.getTestResultsNotes() != null
						&& castOther.getTestResultsNotes() != null && this
						.getTestResultsNotes().equals(
								castOther.getTestResultsNotes())))
				&& ((this.getBmiC() == castOther.getBmiC()) || (this.getBmiC() != null
						&& castOther.getBmiC() != null && this.getBmiC()
						.equals(castOther.getBmiC())))
				&& ((this.getFastingGlucose() == castOther.getFastingGlucose()) || (this
						.getFastingGlucose() != null
						&& castOther.getFastingGlucose() != null && this
						.getFastingGlucose().equals(
								castOther.getFastingGlucose())))
				&& ((this.getDmPresentC() == castOther.getDmPresentC()) || (this
						.getDmPresentC() != null
						&& castOther.getDmPresentC() != null && this
						.getDmPresentC().equals(castOther.getDmPresentC())))
				&& ((this.getHtnPresentC() == castOther.getHtnPresentC()) || (this
						.getHtnPresentC() != null
						&& castOther.getHtnPresentC() != null && this
						.getHtnPresentC().equals(castOther.getHtnPresentC())))
				&& ((this.getMvpaC() == castOther.getMvpaC()) || (this
						.getMvpaC() != null && castOther.getMvpaC() != null && this
						.getMvpaC().equals(castOther.getMvpaC())))
				&& ((this.getMvpaCatC() == castOther.getMvpaCatC()) || (this
						.getMvpaCatC() != null
						&& castOther.getMvpaCatC() != null && this
						.getMvpaCatC().equals(castOther.getMvpaCatC())))
				&& ((this.getWstHipRC() == castOther.getWstHipRC()) || (this
						.getWstHipRC() != null
						&& castOther.getWstHipRC() != null && this
						.getWstHipRC().equals(castOther.getWstHipRC())))
				&& ((this.getBmiCatC() == castOther.getBmiCatC()) || (this
						.getBmiCatC() != null && castOther.getBmiCatC() != null && this
						.getBmiCatC().equals(castOther.getBmiCatC())))
				&& ((this.getHouseholdDensityC() == castOther
						.getHouseholdDensityC()) || (this
						.getHouseholdDensityC() != null
						&& castOther.getHouseholdDensityC() != null && this
						.getHouseholdDensityC().equals(
								castOther.getHouseholdDensityC())))
				&& ((this.getHivFinalStatusC() == castOther
						.getHivFinalStatusC()) || (this.getHivFinalStatusC() != null
						&& castOther.getHivFinalStatusC() != null && this
						.getHivFinalStatusC().equals(
								castOther.getHivFinalStatusC())))
				&& ((this.getSesC() == castOther.getSesC()) || (this.getSesC() != null
						&& castOther.getSesC() != null && this.getSesC()
						.equals(castOther.getSesC())))
				&& ((this.getSesSiteQuintileC() == castOther
						.getSesSiteQuintileC()) || (this.getSesSiteQuintileC() != null
						&& castOther.getSesSiteQuintileC() != null && this
						.getSesSiteQuintileC().equals(
								castOther.getSesSiteQuintileC())))
				&& ((this.getOtherLanguage() == castOther.getOtherLanguage()) || (this
						.getOtherLanguage() != null
						&& castOther.getOtherLanguage() != null && this
						.getOtherLanguage()
						.equals(castOther.getOtherLanguage())))
				&& ((this.getNumInHouseC() == castOther.getNumInHouseC()) || (this
						.getNumInHouseC() != null
						&& castOther.getNumInHouseC() != null && this
						.getNumInHouseC().equals(castOther.getNumInHouseC())))
				&& ((this.getPeopleToRoomsDensityC() == castOther
						.getPeopleToRoomsDensityC()) || (this
						.getPeopleToRoomsDensityC() != null
						&& castOther.getPeopleToRoomsDensityC() != null && this
						.getPeopleToRoomsDensityC().equals(
								castOther.getPeopleToRoomsDensityC())))
				&& ((this.getPeopleToBedroomsDensityC() == castOther
						.getPeopleToBedroomsDensityC()) || (this
						.getPeopleToBedroomsDensityC() != null
						&& castOther.getPeopleToBedroomsDensityC() != null && this
						.getPeopleToBedroomsDensityC().equals(
								castOther.getPeopleToBedroomsDensityC())))
				&& ((this.getPartnershipStatusC() == castOther
						.getPartnershipStatusC()) || (this
						.getPartnershipStatusC() != null
						&& castOther.getPartnershipStatusC() != null && this
						.getPartnershipStatusC().equals(
								castOther.getPartnershipStatusC())))
				&& ((this.getEmploymentStatusC() == castOther
						.getEmploymentStatusC()) || (this
						.getEmploymentStatusC() != null
						&& castOther.getEmploymentStatusC() != null && this
						.getEmploymentStatusC().equals(
								castOther.getEmploymentStatusC())))
				&& ((this.getSmokingStatusC() == castOther.getSmokingStatusC()) || (this
						.getSmokingStatusC() != null
						&& castOther.getSmokingStatusC() != null && this
						.getSmokingStatusC().equals(
								castOther.getSmokingStatusC())))
				&& ((this.getAlcoholStatusC() == castOther.getAlcoholStatusC()) || (this
						.getAlcoholStatusC() != null
						&& castOther.getAlcoholStatusC() != null && this
						.getAlcoholStatusC().equals(
								castOther.getAlcoholStatusC())))
				&& ((this.getAvgSleepPerNightC() == castOther
						.getAvgSleepPerNightC()) || (this
						.getAvgSleepPerNightC() != null
						&& castOther.getAvgSleepPerNightC() != null && this
						.getAvgSleepPerNightC().equals(
								castOther.getAvgSleepPerNightC())))
				&& ((this.getNumberOfSiblingsC() == castOther
						.getNumberOfSiblingsC()) || (this
						.getNumberOfSiblingsC() != null
						&& castOther.getNumberOfSiblingsC() != null && this
						.getNumberOfSiblingsC().equals(
								castOther.getNumberOfSiblingsC())))
				&& ((this.getNumberOfChildrenC() == castOther
						.getNumberOfChildrenC()) || (this
						.getNumberOfChildrenC() != null
						&& castOther.getNumberOfChildrenC() != null && this
						.getNumberOfChildrenC().equals(
								castOther.getNumberOfChildrenC())))
				&& ((this.getMonthsSinceLastPeriodC() == castOther
						.getMonthsSinceLastPeriodC()) || (this
						.getMonthsSinceLastPeriodC() != null
						&& castOther.getMonthsSinceLastPeriodC() != null && this
						.getMonthsSinceLastPeriodC().equals(
								castOther.getMonthsSinceLastPeriodC())))
				&& ((this.getMenopausalStatusC() == castOther
						.getMenopausalStatusC()) || (this
						.getMenopausalStatusC() != null
						&& castOther.getMenopausalStatusC() != null && this
						.getMenopausalStatusC().equals(
								castOther.getMenopausalStatusC())))
				&& ((this.getLastPeriodComments() == castOther
						.getLastPeriodComments()) || (this
						.getLastPeriodComments() != null
						&& castOther.getLastPeriodComments() != null && this
						.getLastPeriodComments().equals(
								castOther.getLastPeriodComments())))
				&& ((this.getMonthsLastPeriodC() == castOther
						.getMonthsLastPeriodC()) || (this
						.getMonthsLastPeriodC() != null
						&& castOther.getMonthsLastPeriodC() != null && this
						.getMonthsLastPeriodC().equals(
								castOther.getMonthsLastPeriodC())))
				&& ((this.getDateGlucose2() == castOther.getDateGlucose2()) || (this
						.getDateGlucose2() != null
						&& castOther.getDateGlucose2() != null && this
						.getDateGlucose2().equals(castOther.getDateGlucose2())))
				&& ((this.getSCreatinine2() == castOther.getSCreatinine2()) || (this
						.getSCreatinine2() != null
						&& castOther.getSCreatinine2() != null && this
						.getSCreatinine2().equals(castOther.getSCreatinine2())))
				&& ((this.getDateInsulinTested2() == castOther
						.getDateInsulinTested2()) || (this
						.getDateInsulinTested2() != null
						&& castOther.getDateInsulinTested2() != null && this
						.getDateInsulinTested2().equals(
								castOther.getDateInsulinTested2())))
				&& ((this.getDateLipidsTested2() == castOther
						.getDateLipidsTested2()) || (this
						.getDateLipidsTested2() != null
						&& castOther.getDateLipidsTested2() != null && this
						.getDateLipidsTested2().equals(
								castOther.getDateLipidsTested2())))
				&& ((this.getAllResultsStatus() == castOther
						.getAllResultsStatus()) || (this.getAllResultsStatus() != null
						&& castOther.getAllResultsStatus() != null && this
						.getAllResultsStatus().equals(
								castOther.getAllResultsStatus())))
				&& ((this.getIsComplete() == castOther.getIsComplete()) || (this
						.getIsComplete() != null
						&& castOther.getIsComplete() != null && this
						.getIsComplete().equals(castOther.getIsComplete())))
				&& ((this.getMenopauseStatusC() == castOther
						.getMenopauseStatusC()) || (this.getMenopauseStatusC() != null
						&& castOther.getMenopauseStatusC() != null && this
						.getMenopauseStatusC().equals(
								castOther.getMenopauseStatusC())))
				&& ((this.getMenopauseManual() == castOther
						.getMenopauseManual()) || (this.getMenopauseManual() != null
						&& castOther.getMenopauseManual() != null && this
						.getMenopauseManual().equals(
								castOther.getMenopauseManual())))
				&& ((this.getHtnJnc7() == castOther.getHtnJnc7()) || (this
						.getHtnJnc7() != null && castOther.getHtnJnc7() != null && this
						.getHtnJnc7().equals(castOther.getHtnJnc7())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getStudyId() == null ? 0 : this.getStudyId().hashCode());
		result = 37 * result
				+ (getSiteId() == null ? 0 : this.getSiteId().hashCode());
		result = 37 * result
				+ (getSite() == null ? 0 : this.getSite().hashCode());
		result = 37
				* result
				+ (getEnrolmentDate() == null ? 0 : this.getEnrolmentDate()
						.hashCode());
		result = 37
				* result
				+ (getInterviewerCode() == null ? 0 : this.getInterviewerCode()
						.hashCode());
		result = 37 * result
				+ (getStartTime() == null ? 0 : this.getStartTime().hashCode());
		result = 37
				* result
				+ (getDateOfBirthKnown() == null ? 0 : this
						.getDateOfBirthKnown().hashCode());
		result = 37 * result
				+ (getAge() == null ? 0 : this.getAge().hashCode());
		result = 37 * result
				+ (getSex() == null ? 0 : this.getSex().hashCode());
		result = 37 * result
				+ (getCountry() == null ? 0 : this.getCountry().hashCode());
		result = 37
				* result
				+ (getHomeLanguage() == null ? 0 : this.getHomeLanguage()
						.hashCode());
		result = 37
				* result
				+ (getOtherEthnicity() == null ? 0 : this.getOtherEthnicity()
						.hashCode());
		result = 37 * result
				+ (getEthnicity() == null ? 0 : this.getEthnicity().hashCode());
		result = 37
				* result
				+ (getFatherEthnicity() == null ? 0 : this.getFatherEthnicity()
						.hashCode());
		result = 37
				* result
				+ (getFatherEthnicityOther() == null ? 0 : this
						.getFatherEthnicityOther().hashCode());
		result = 37
				* result
				+ (getFatherLanguage() == null ? 0 : this.getFatherLanguage()
						.hashCode());
		result = 37
				* result
				+ (getFatherLanguageOther() == null ? 0 : this
						.getFatherLanguageOther().hashCode());
		result = 37
				* result
				+ (getPatGfatherEthnicity() == null ? 0 : this
						.getPatGfatherEthnicity().hashCode());
		result = 37
				* result
				+ (getPatGfatherEthnicityOther() == null ? 0 : this
						.getPatGfatherEthnicityOther().hashCode());
		result = 37
				* result
				+ (getPatGfatherLanguage() == null ? 0 : this
						.getPatGfatherLanguage().hashCode());
		result = 37
				* result
				+ (getPatGfatherLanguageOther() == null ? 0 : this
						.getPatGfatherLanguageOther().hashCode());
		result = 37
				* result
				+ (getPatGmotherEthnicity() == null ? 0 : this
						.getPatGmotherEthnicity().hashCode());
		result = 37
				* result
				+ (getPatGmotherEthnicityOther() == null ? 0 : this
						.getPatGmotherEthnicityOther().hashCode());
		result = 37
				* result
				+ (getPatGmotherLanguage() == null ? 0 : this
						.getPatGmotherLanguage().hashCode());
		result = 37
				* result
				+ (getPatGmotherLanguageOther() == null ? 0 : this
						.getPatGmotherLanguageOther().hashCode());
		result = 37
				* result
				+ (getMotherEthnicity() == null ? 0 : this.getMotherEthnicity()
						.hashCode());
		result = 37
				* result
				+ (getMotherEthnicityOther() == null ? 0 : this
						.getMotherEthnicityOther().hashCode());
		result = 37
				* result
				+ (getMotherLanguage() == null ? 0 : this.getMotherLanguage()
						.hashCode());
		result = 37
				* result
				+ (getMotherLanguageOther() == null ? 0 : this
						.getMotherLanguageOther().hashCode());
		result = 37
				* result
				+ (getMatGfatherEthnicity() == null ? 0 : this
						.getMatGfatherEthnicity().hashCode());
		result = 37
				* result
				+ (getMatGfatherEthnicityOther() == null ? 0 : this
						.getMatGfatherEthnicityOther().hashCode());
		result = 37
				* result
				+ (getMatGfatherLanguage() == null ? 0 : this
						.getMatGfatherLanguage().hashCode());
		result = 37
				* result
				+ (getMatGfatherLanguageOther() == null ? 0 : this
						.getMatGfatherLanguageOther().hashCode());
		result = 37
				* result
				+ (getMatGmotherEthnicity() == null ? 0 : this
						.getMatGmotherEthnicity().hashCode());
		result = 37
				* result
				+ (getMatGmotherEthnicityOther() == null ? 0 : this
						.getMatGmotherEthnicityOther().hashCode());
		result = 37
				* result
				+ (getMatGmotherLanguage() == null ? 0 : this
						.getMatGmotherLanguage().hashCode());
		result = 37
				* result
				+ (getMatGmotherLanguageOther() == null ? 0 : this
						.getMatGmotherLanguageOther().hashCode());
		result = 37 * result
				+ (getSiblings() == null ? 0 : this.getSiblings().hashCode());
		result = 37
				* result
				+ (getNumberOfBrothers() == null ? 0 : this
						.getNumberOfBrothers().hashCode());
		result = 37
				* result
				+ (getNumberOfSisters() == null ? 0 : this.getNumberOfSisters()
						.hashCode());
		result = 37 * result
				+ (getChildren() == null ? 0 : this.getChildren().hashCode());
		result = 37
				* result
				+ (getNumberOfSons() == null ? 0 : this.getNumberOfSons()
						.hashCode());
		result = 37
				* result
				+ (getNumberOfDaughters() == null ? 0 : this
						.getNumberOfDaughters().hashCode());
		result = 37 * result
				+ (getPregnant() == null ? 0 : this.getPregnant().hashCode());
		result = 37
				* result
				+ (getNumberOfPregnancies() == null ? 0 : this
						.getNumberOfPregnancies().hashCode());
		result = 37
				* result
				+ (getNumberOfLiveBirths() == null ? 0 : this
						.getNumberOfLiveBirths().hashCode());
		result = 37
				* result
				+ (getRegularPeriods() == null ? 0 : this.getRegularPeriods()
						.hashCode());
		result = 37
				* result
				+ (getLastPeriod() == null ? 0 : this.getLastPeriod()
						.hashCode());
		result = 37
				* result
				+ (getMaritalStatus() == null ? 0 : this.getMaritalStatus()
						.hashCode());
		result = 37
				* result
				+ (getHighestLevelOfEducation() == null ? 0 : this
						.getHighestLevelOfEducation().hashCode());
		result = 37
				* result
				+ (getYearsHighestEducation() == null ? 0 : this
						.getYearsHighestEducation().hashCode());
		result = 37
				* result
				+ (getOccupation() == null ? 0 : this.getOccupation()
						.hashCode());
		result = 37
				* result
				+ (getHouseholdSize() == null ? 0 : this.getHouseholdSize()
						.hashCode());
		result = 37
				* result
				+ (getPerson1Sex() == null ? 0 : this.getPerson1Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson1Age() == null ? 0 : this.getPerson1Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson1Relationship() == null ? 0 : this
						.getPerson1Relationship().hashCode());
		result = 37
				* result
				+ (getPerson2Sex() == null ? 0 : this.getPerson2Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson2Age() == null ? 0 : this.getPerson2Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson2Relationship() == null ? 0 : this
						.getPerson2Relationship().hashCode());
		result = 37
				* result
				+ (getPerson3Sex() == null ? 0 : this.getPerson3Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson3Age() == null ? 0 : this.getPerson3Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson3Relationship() == null ? 0 : this
						.getPerson3Relationship().hashCode());
		result = 37
				* result
				+ (getPerson4Sex() == null ? 0 : this.getPerson4Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson4Age() == null ? 0 : this.getPerson4Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson4Relationship() == null ? 0 : this
						.getPerson4Relationship().hashCode());
		result = 37
				* result
				+ (getPerson5Sex() == null ? 0 : this.getPerson5Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson5Age() == null ? 0 : this.getPerson5Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson5Relationship() == null ? 0 : this
						.getPerson5Relationship().hashCode());
		result = 37
				* result
				+ (getPerson6Sex() == null ? 0 : this.getPerson6Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson6Age() == null ? 0 : this.getPerson6Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson6Relationship() == null ? 0 : this
						.getPerson6Relationship().hashCode());
		result = 37
				* result
				+ (getPerson7Sex() == null ? 0 : this.getPerson7Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson7Age() == null ? 0 : this.getPerson7Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson7Relationship() == null ? 0 : this
						.getPerson7Relationship().hashCode());
		result = 37
				* result
				+ (getPerson8Sex() == null ? 0 : this.getPerson8Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson8Age() == null ? 0 : this.getPerson8Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson8Relationship() == null ? 0 : this
						.getPerson8Relationship().hashCode());
		result = 37
				* result
				+ (getPerson9Sex() == null ? 0 : this.getPerson9Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson9Age() == null ? 0 : this.getPerson9Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson9Relationship() == null ? 0 : this
						.getPerson9Relationship().hashCode());
		result = 37
				* result
				+ (getPerson10Sex() == null ? 0 : this.getPerson10Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson10Age() == null ? 0 : this.getPerson10Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson10Relationship() == null ? 0 : this
						.getPerson10Relationship().hashCode());
		result = 37
				* result
				+ (getPerson11Sex() == null ? 0 : this.getPerson11Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson11Age() == null ? 0 : this.getPerson11Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson11Relationship() == null ? 0 : this
						.getPerson11Relationship().hashCode());
		result = 37
				* result
				+ (getPerson12Age() == null ? 0 : this.getPerson12Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson12Sex() == null ? 0 : this.getPerson12Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson12Relationship() == null ? 0 : this
						.getPerson12Relationship().hashCode());
		result = 37
				* result
				+ (getPerson13Age() == null ? 0 : this.getPerson13Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson13Sex() == null ? 0 : this.getPerson13Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson13Relationship() == null ? 0 : this
						.getPerson13Relationship().hashCode());
		result = 37
				* result
				+ (getPerson14Age() == null ? 0 : this.getPerson14Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson14Sex() == null ? 0 : this.getPerson14Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson14Relationship() == null ? 0 : this
						.getPerson14Relationship().hashCode());
		result = 37
				* result
				+ (getPerson15Age() == null ? 0 : this.getPerson15Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson15Sex() == null ? 0 : this.getPerson15Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson15Relationship() == null ? 0 : this
						.getPerson15Relationship().hashCode());
		result = 37
				* result
				+ (getPerson16Age() == null ? 0 : this.getPerson16Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson16Sex() == null ? 0 : this.getPerson16Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson16Relationship() == null ? 0 : this
						.getPerson16Relationship().hashCode());
		result = 37
				* result
				+ (getPerson17Age() == null ? 0 : this.getPerson17Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson17Sex() == null ? 0 : this.getPerson17Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson17Relationship() == null ? 0 : this
						.getPerson17Relationship().hashCode());
		result = 37
				* result
				+ (getPerson18Age() == null ? 0 : this.getPerson18Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson18Sex() == null ? 0 : this.getPerson18Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson18Relationship() == null ? 0 : this
						.getPerson18Relationship().hashCode());
		result = 37
				* result
				+ (getPerson19Age() == null ? 0 : this.getPerson19Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson19Sex() == null ? 0 : this.getPerson19Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson19Relationship() == null ? 0 : this
						.getPerson19Relationship().hashCode());
		result = 37
				* result
				+ (getPerson20Age() == null ? 0 : this.getPerson20Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson20Sex() == null ? 0 : this.getPerson20Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson20Relationship() == null ? 0 : this
						.getPerson20Relationship().hashCode());
		result = 37
				* result
				+ (getPerson21Age() == null ? 0 : this.getPerson21Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson21Sex() == null ? 0 : this.getPerson21Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson21Relationship() == null ? 0 : this
						.getPerson21Relationship().hashCode());
		result = 37
				* result
				+ (getPerson22Age() == null ? 0 : this.getPerson22Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson22Sex() == null ? 0 : this.getPerson22Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson22Relationship() == null ? 0 : this
						.getPerson22Relationship().hashCode());
		result = 37
				* result
				+ (getPerson23Age() == null ? 0 : this.getPerson23Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson23Sex() == null ? 0 : this.getPerson23Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson23Relationship() == null ? 0 : this
						.getPerson23Relationship().hashCode());
		result = 37
				* result
				+ (getPerson24Age() == null ? 0 : this.getPerson24Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson24Sex() == null ? 0 : this.getPerson24Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson24Relationship() == null ? 0 : this
						.getPerson24Relationship().hashCode());
		result = 37
				* result
				+ (getPerson25Age() == null ? 0 : this.getPerson25Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson25Sex() == null ? 0 : this.getPerson25Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson25Relationship() == null ? 0 : this
						.getPerson25Relationship().hashCode());
		result = 37
				* result
				+ (getPerson26Age() == null ? 0 : this.getPerson26Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson26Sex() == null ? 0 : this.getPerson26Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson26Relationship() == null ? 0 : this
						.getPerson26Relationship().hashCode());
		result = 37
				* result
				+ (getPerson27Age() == null ? 0 : this.getPerson27Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson27Sex() == null ? 0 : this.getPerson27Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson27Relationship() == null ? 0 : this
						.getPerson27Relationship().hashCode());
		result = 37
				* result
				+ (getPerson28Age() == null ? 0 : this.getPerson28Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson28Sex() == null ? 0 : this.getPerson28Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson28Relationship() == null ? 0 : this
						.getPerson28Relationship().hashCode());
		result = 37
				* result
				+ (getPerson29Age() == null ? 0 : this.getPerson29Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson29Sex() == null ? 0 : this.getPerson29Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson29Relationship() == null ? 0 : this
						.getPerson29Relationship().hashCode());
		result = 37
				* result
				+ (getPerson30Age() == null ? 0 : this.getPerson30Age()
						.hashCode());
		result = 37
				* result
				+ (getPerson30Sex() == null ? 0 : this.getPerson30Sex()
						.hashCode());
		result = 37
				* result
				+ (getPerson30Relationship() == null ? 0 : this
						.getPerson30Relationship().hashCode());
		result = 37
				* result
				+ (getNumberOfRooms() == null ? 0 : this.getNumberOfRooms()
						.hashCode());
		result = 37
				* result
				+ (getNumberOfBedrooms() == null ? 0 : this
						.getNumberOfBedrooms().hashCode());
		result = 37
				* result
				+ (getElectricity() == null ? 0 : this.getElectricity()
						.hashCode());
		result = 37
				* result
				+ (getSolarEnergy() == null ? 0 : this.getSolarEnergy()
						.hashCode());
		result = 37
				* result
				+ (getPowerGenerator() == null ? 0 : this.getPowerGenerator()
						.hashCode());
		result = 37
				* result
				+ (getAlternativePowerSource() == null ? 0 : this
						.getAlternativePowerSource().hashCode());
		result = 37
				* result
				+ (getTelevision() == null ? 0 : this.getTelevision()
						.hashCode());
		result = 37 * result
				+ (getRadio() == null ? 0 : this.getRadio().hashCode());
		result = 37
				* result
				+ (getMotorVehicle() == null ? 0 : this.getMotorVehicle()
						.hashCode());
		result = 37
				* result
				+ (getMotorcycle() == null ? 0 : this.getMotorcycle()
						.hashCode());
		result = 37 * result
				+ (getBicycle() == null ? 0 : this.getBicycle().hashCode());
		result = 37
				* result
				+ (getRefrigerator() == null ? 0 : this.getRefrigerator()
						.hashCode());
		result = 37
				* result
				+ (getWashingMachine() == null ? 0 : this.getWashingMachine()
						.hashCode());
		result = 37
				* result
				+ (getSewingMachine() == null ? 0 : this.getSewingMachine()
						.hashCode());
		result = 37 * result
				+ (getTelephone() == null ? 0 : this.getTelephone().hashCode());
		result = 37
				* result
				+ (getMobilePhone() == null ? 0 : this.getMobilePhone()
						.hashCode());
		result = 37 * result
				+ (getMicrowave() == null ? 0 : this.getMicrowave().hashCode());
		result = 37 * result
				+ (getDvdPlayer() == null ? 0 : this.getDvdPlayer().hashCode());
		result = 37
				* result
				+ (getSatelliteTvOrDstv() == null ? 0 : this
						.getSatelliteTvOrDstv().hashCode());
		result = 37
				* result
				+ (getComputerOrLaptop() == null ? 0 : this
						.getComputerOrLaptop().hashCode());
		result = 37
				* result
				+ (getInternetByComputer() == null ? 0 : this
						.getInternetByComputer().hashCode());
		result = 37
				* result
				+ (getInternetByMobilePhone() == null ? 0 : this
						.getInternetByMobilePhone().hashCode());
		result = 37
				* result
				+ (getElectricIron() == null ? 0 : this.getElectricIron()
						.hashCode());
		result = 37 * result
				+ (getFan() == null ? 0 : this.getFan().hashCode());
		result = 37
				* result
				+ (getElectricOrGasStove() == null ? 0 : this
						.getElectricOrGasStove().hashCode());
		result = 37
				* result
				+ (getKeroseneStove() == null ? 0 : this.getKeroseneStove()
						.hashCode());
		result = 37 * result
				+ (getPlateGas() == null ? 0 : this.getPlateGas().hashCode());
		result = 37
				* result
				+ (getElectricPlate() == null ? 0 : this.getElectricPlate()
						.hashCode());
		result = 37 * result
				+ (getTorch() == null ? 0 : this.getTorch().hashCode());
		result = 37 * result
				+ (getGasLamp() == null ? 0 : this.getGasLamp().hashCode());
		result = 37
				* result
				+ (getKeroseneLampWithGlass() == null ? 0 : this
						.getKeroseneLampWithGlass().hashCode());
		result = 37
				* result
				+ (getToiletFacilities() == null ? 0 : this
						.getToiletFacilities().hashCode());
		result = 37
				* result
				+ (getPortableWater() == null ? 0 : this.getPortableWater()
						.hashCode());
		result = 37
				* result
				+ (getGrindingMill() == null ? 0 : this.getGrindingMill()
						.hashCode());
		result = 37 * result
				+ (getTableh() == null ? 0 : this.getTableh().hashCode());
		result = 37 * result
				+ (getSofaSet() == null ? 0 : this.getSofaSet().hashCode());
		result = 37 * result
				+ (getWallClock() == null ? 0 : this.getWallClock().hashCode());
		result = 37 * result
				+ (getBed() == null ? 0 : this.getBed().hashCode());
		result = 37 * result
				+ (getMattress() == null ? 0 : this.getMattress().hashCode());
		result = 37 * result
				+ (getBlankets() == null ? 0 : this.getBlankets().hashCode());
		result = 37 * result
				+ (getCattle() == null ? 0 : this.getCattle().hashCode());
		result = 37
				* result
				+ (getOtherLivestock() == null ? 0 : this.getOtherLivestock()
						.hashCode());
		result = 37 * result
				+ (getPoultry() == null ? 0 : this.getPoultry().hashCode());
		result = 37 * result
				+ (getTractor() == null ? 0 : this.getTractor().hashCode());
		result = 37 * result
				+ (getPlough() == null ? 0 : this.getPlough().hashCode());
		result = 37
				* result
				+ (getTobaccoUse() == null ? 0 : this.getTobaccoUse()
						.hashCode());
		result = 37
				* result
				+ (getCurrentSmoker() == null ? 0 : this.getCurrentSmoker()
						.hashCode());
		result = 37
				* result
				+ (getWhatSmokeCigarettes() == null ? 0 : this
						.getWhatSmokeCigarettes().hashCode());
		result = 37
				* result
				+ (getWhatSmokePipe() == null ? 0 : this.getWhatSmokePipe()
						.hashCode());
		result = 37
				* result
				+ (getWhatSmokeHandRolled() == null ? 0 : this
						.getWhatSmokeHandRolled().hashCode());
		result = 37
				* result
				+ (getWhatSmokeCigars() == null ? 0 : this.getWhatSmokeCigars()
						.hashCode());
		result = 37
				* result
				+ (getWhatSmokeECigarettes() == null ? 0 : this
						.getWhatSmokeECigarettes().hashCode());
		result = 37
				* result
				+ (getSmokingFrequence() == null ? 0 : this
						.getSmokingFrequence().hashCode());
		result = 37
				* result
				+ (getSmokePerDay() == null ? 0 : this.getSmokePerDay()
						.hashCode());
		result = 37
				* result
				+ (getAgeStartSmoking() == null ? 0 : this.getAgeStartSmoking()
						.hashCode());
		result = 37
				* result
				+ (getYearStopSmoking() == null ? 0 : this.getYearStopSmoking()
						.hashCode());
		result = 37
				* result
				+ (getSmokelessTobaccoUse() == null ? 0 : this
						.getSmokelessTobaccoUse().hashCode());
		result = 37 * result
				+ (getSnuffUse() == null ? 0 : this.getSnuffUse().hashCode());
		result = 37
				* result
				+ (getSnuffMethodNose() == null ? 0 : this.getSnuffMethodNose()
						.hashCode());
		result = 37
				* result
				+ (getSnuffMethodMouth() == null ? 0 : this
						.getSnuffMethodMouth().hashCode());
		result = 37
				* result
				+ (getFrequenceOfSnuffUse() == null ? 0 : this
						.getFrequenceOfSnuffUse().hashCode());
		result = 37
				* result
				+ (getFrequenceOfSnuffUsePerDay() == null ? 0 : this
						.getFrequenceOfSnuffUsePerDay().hashCode());
		result = 37
				* result
				+ (getChewingTobaccoUse() == null ? 0 : this
						.getChewingTobaccoUse().hashCode());
		result = 37
				* result
				+ (getFrequenceOfChewingTobaccoUse() == null ? 0 : this
						.getFrequenceOfChewingTobaccoUse().hashCode());
		result = 37
				* result
				+ (getFrequenceOfChewingTobaccoUsePerDay() == null ? 0 : this
						.getFrequenceOfChewingTobaccoUsePerDay().hashCode());
		result = 37
				* result
				+ (getConsumeAlcohol() == null ? 0 : this.getConsumeAlcohol()
						.hashCode());
		result = 37
				* result
				+ (getCurrentAlcoholConsumer() == null ? 0 : this
						.getCurrentAlcoholConsumer().hashCode());
		result = 37
				* result
				+ (getFrequenceOfAlcoholConsumption() == null ? 0 : this
						.getFrequenceOfAlcoholConsumption().hashCode());
		result = 37
				* result
				+ (getAmountOfAlcoholConsumedPerDay() == null ? 0 : this
						.getAmountOfAlcoholConsumedPerDay().hashCode());
		result = 37
				* result
				+ (getConsiderAlcoholCutdown() == null ? 0 : this
						.getConsiderAlcoholCutdown().hashCode());
		result = 37
				* result
				+ (getCriticisedForDrinking() == null ? 0 : this
						.getCriticisedForDrinking().hashCode());
		result = 37
				* result
				+ (getGuiltyForDrinking() == null ? 0 : this
						.getGuiltyForDrinking().hashCode());
		result = 37
				* result
				+ (getHadHangover() == null ? 0 : this.getHadHangover()
						.hashCode());
		result = 37
				* result
				+ (getDrinkingPastYear() == null ? 0 : this
						.getDrinkingPastYear().hashCode());
		result = 37
				* result
				+ (getAlcoholTypeConsumedBeer() == null ? 0 : this
						.getAlcoholTypeConsumedBeer().hashCode());
		result = 37
				* result
				+ (getAlcoholTypeConsumedWine() == null ? 0 : this
						.getAlcoholTypeConsumedWine().hashCode());
		result = 37
				* result
				+ (getAlcoholTypeConsumedSpirits() == null ? 0 : this
						.getAlcoholTypeConsumedSpirits().hashCode());
		result = 37
				* result
				+ (getAlcoholTypeConsumedHomeBrew() == null ? 0 : this
						.getAlcoholTypeConsumedHomeBrew().hashCode());
		result = 37
				* result
				+ (getAlcoholTypeConsumedOther() == null ? 0 : this
						.getAlcoholTypeConsumedOther().hashCode());
		result = 37
				* result
				+ (getSpecifyAlcoholTypeConsumed() == null ? 0 : this
						.getSpecifyAlcoholTypeConsumed().hashCode());
		result = 37 * result
				+ (getUseDrug() == null ? 0 : this.getUseDrug().hashCode());
		result = 37
				* result
				+ (getBreastCancer() == null ? 0 : this.getBreastCancer()
						.hashCode());
		result = 37
				* result
				+ (getCervicalCancer() == null ? 0 : this.getCervicalCancer()
						.hashCode());
		result = 37
				* result
				+ (getProstateCancer() == null ? 0 : this.getProstateCancer()
						.hashCode());
		result = 37 * result
				+ (getAsthma() == null ? 0 : this.getAsthma().hashCode());
		result = 37
				* result
				+ (getTreatmentGenHealth() == null ? 0 : this
						.getTreatmentGenHealth().hashCode());
		result = 37
				* result
				+ (getMedication() == null ? 0 : this.getMedication()
						.hashCode());
		result = 37
				* result
				+ (getListMedication() == null ? 0 : this.getListMedication()
						.hashCode());
		result = 37
				* result
				+ (getTraditionalMed() == null ? 0 : this.getTraditionalMed()
						.hashCode());
		result = 37
				* result
				+ (getObesityMom() == null ? 0 : this.getObesityMom()
						.hashCode());
		result = 37
				* result
				+ (getHBloodPressureMom() == null ? 0 : this
						.getHBloodPressureMom().hashCode());
		result = 37
				* result
				+ (getHCholesterolMom() == null ? 0 : this.getHCholesterolMom()
						.hashCode());
		result = 37
				* result
				+ (getBreastCancerMom() == null ? 0 : this.getBreastCancerMom()
						.hashCode());
		result = 37
				* result
				+ (getCervicalCancerMom() == null ? 0 : this
						.getCervicalCancerMom().hashCode());
		result = 37
				* result
				+ (getOtherCancersMom() == null ? 0 : this.getOtherCancersMom()
						.hashCode());
		result = 37 * result
				+ (getAsthmaMom() == null ? 0 : this.getAsthmaMom().hashCode());
		result = 37
				* result
				+ (getObesityDad() == null ? 0 : this.getObesityDad()
						.hashCode());
		result = 37
				* result
				+ (getHBloodPressureDad() == null ? 0 : this
						.getHBloodPressureDad().hashCode());
		result = 37
				* result
				+ (getHCholesterolDad() == null ? 0 : this.getHCholesterolDad()
						.hashCode());
		result = 37
				* result
				+ (getProstateCancerDad() == null ? 0 : this
						.getProstateCancerDad().hashCode());
		result = 37
				* result
				+ (getOtherCancersDad() == null ? 0 : this.getOtherCancersDad()
						.hashCode());
		result = 37 * result
				+ (getAsthmaDad() == null ? 0 : this.getAsthmaDad().hashCode());
		result = 37 * result
				+ (getDaysFruit() == null ? 0 : this.getDaysFruit().hashCode());
		result = 37
				* result
				+ (getFruitServings() == null ? 0 : this.getFruitServings()
						.hashCode());
		result = 37 * result
				+ (getDaysVeg() == null ? 0 : this.getDaysVeg().hashCode());
		result = 37
				* result
				+ (getServingsVeg() == null ? 0 : this.getServingsVeg()
						.hashCode());
		result = 37
				* result
				+ (getVendorMeals() == null ? 0 : this.getVendorMeals()
						.hashCode());
		result = 37 * result
				+ (getDaysBread() == null ? 0 : this.getDaysBread().hashCode());
		result = 37
				* result
				+ (getSlicesBread() == null ? 0 : this.getSlicesBread()
						.hashCode());
		result = 37
				* result
				+ (getSugardrinks() == null ? 0 : this.getSugardrinks()
						.hashCode());
		result = 37 * result
				+ (getJuice() == null ? 0 : this.getJuice().hashCode());
		result = 37
				* result
				+ (getChangeDiet() == null ? 0 : this.getChangeDiet()
						.hashCode());
		result = 37
				* result
				+ (getLoseWeight() == null ? 0 : this.getLoseWeight()
						.hashCode());
		result = 37 * result
				+ (getPesticide() == null ? 0 : this.getPesticide().hashCode());
		result = 37
				* result
				+ (getYearsPesticide() == null ? 0 : this.getYearsPesticide()
						.hashCode());
		result = 37
				* result
				+ (getRegionPesticide() == null ? 0 : this.getRegionPesticide()
						.hashCode());
		result = 37
				* result
				+ (getPesticideType() == null ? 0 : this.getPesticideType()
						.hashCode());
		result = 37
				* result
				+ (getPesticideList() == null ? 0 : this.getPesticideList()
						.hashCode());
		result = 37 * result
				+ (getMalaria() == null ? 0 : this.getMalaria().hashCode());
		result = 37
				* result
				+ (getMalariaMonth() == null ? 0 : this.getMalariaMonth()
						.hashCode());
		result = 37
				* result
				+ (getMalariaArea() == null ? 0 : this.getMalariaArea()
						.hashCode());
		result = 37 * result + (getTb() == null ? 0 : this.getTb().hashCode());
		result = 37
				* result
				+ (getTb12months() == null ? 0 : this.getTb12months()
						.hashCode());
		result = 37
				* result
				+ (getTbDiagnosed() == null ? 0 : this.getTbDiagnosed()
						.hashCode());
		result = 37
				* result
				+ (getTbTreatment() == null ? 0 : this.getTbTreatment()
						.hashCode());
		result = 37 * result
				+ (getTbMeds() == null ? 0 : this.getTbMeds().hashCode());
		result = 37
				* result
				+ (getTbCounselling() == null ? 0 : this.getTbCounselling()
						.hashCode());
		result = 37
				* result
				+ (getTbTraditionalMed() == null ? 0 : this
						.getTbTraditionalMed().hashCode());
		result = 37
				* result
				+ (getBloodSugar() == null ? 0 : this.getBloodSugar()
						.hashCode());
		result = 37 * result
				+ (getDiabetes() == null ? 0 : this.getDiabetes().hashCode());
		result = 37
				* result
				+ (getDiabetes12months() == null ? 0 : this
						.getDiabetes12months().hashCode());
		result = 37
				* result
				+ (getDiabetesTreatment() == null ? 0 : this
						.getDiabetesTreatment().hashCode());
		result = 37
				* result
				+ (getDiabetesTreatCurr() == null ? 0 : this
						.getDiabetesTreatCurr().hashCode());
		result = 37
				* result
				+ (getDiabetesTreatInsulin() == null ? 0 : this
						.getDiabetesTreatInsulin().hashCode());
		result = 37
				* result
				+ (getDiabetesTreatPills() == null ? 0 : this
						.getDiabetesTreatPills().hashCode());
		result = 37
				* result
				+ (getDiabetesTreatDiet() == null ? 0 : this
						.getDiabetesTreatDiet().hashCode());
		result = 37
				* result
				+ (getDiabetesTreatWeightLoss() == null ? 0 : this
						.getDiabetesTreatWeightLoss().hashCode());
		result = 37
				* result
				+ (getDiabetesTreatOther() == null ? 0 : this
						.getDiabetesTreatOther().hashCode());
		result = 37
				* result
				+ (getDiabetesMedsSpecify() == null ? 0 : this
						.getDiabetesMedsSpecify().hashCode());
		result = 37
				* result
				+ (getDiabetesTraditional() == null ? 0 : this
						.getDiabetesTraditional().hashCode());
		result = 37
				* result
				+ (getDiabetesHistory() == null ? 0 : this.getDiabetesHistory()
						.hashCode());
		result = 37
				* result
				+ (getMotherDiabetes() == null ? 0 : this.getMotherDiabetes()
						.hashCode());
		result = 37
				* result
				+ (getFatherDiabetes() == null ? 0 : this.getFatherDiabetes()
						.hashCode());
		result = 37
				* result
				+ (getBrotherDiabetes() == null ? 0 : this.getBrotherDiabetes()
						.hashCode());
		result = 37
				* result
				+ (getBrother2Diabetes() == null ? 0 : this
						.getBrother2Diabetes().hashCode());
		result = 37
				* result
				+ (getBrother3Diabetes() == null ? 0 : this
						.getBrother3Diabetes().hashCode());
		result = 37
				* result
				+ (getBrother4Diabetes() == null ? 0 : this
						.getBrother4Diabetes().hashCode());
		result = 37
				* result
				+ (getSisterDiabetes() == null ? 0 : this.getSisterDiabetes()
						.hashCode());
		result = 37
				* result
				+ (getSister2Diabetes() == null ? 0 : this.getSister2Diabetes()
						.hashCode());
		result = 37
				* result
				+ (getSister3Diabetes() == null ? 0 : this.getSister3Diabetes()
						.hashCode());
		result = 37
				* result
				+ (getSister4Diabetes() == null ? 0 : this.getSister4Diabetes()
						.hashCode());
		result = 37
				* result
				+ (getSonDiabetes() == null ? 0 : this.getSonDiabetes()
						.hashCode());
		result = 37
				* result
				+ (getSon2Diabetes() == null ? 0 : this.getSon2Diabetes()
						.hashCode());
		result = 37
				* result
				+ (getSon3Diabetes() == null ? 0 : this.getSon3Diabetes()
						.hashCode());
		result = 37
				* result
				+ (getSon4Diabetes() == null ? 0 : this.getSon4Diabetes()
						.hashCode());
		result = 37
				* result
				+ (getDaughterDiabetes() == null ? 0 : this
						.getDaughterDiabetes().hashCode());
		result = 37
				* result
				+ (getDaughter2Diabetes() == null ? 0 : this
						.getDaughter2Diabetes().hashCode());
		result = 37
				* result
				+ (getDaughter3Diabetes() == null ? 0 : this
						.getDaughter3Diabetes().hashCode());
		result = 37
				* result
				+ (getDaughter4Diabetes() == null ? 0 : this
						.getDaughter4Diabetes().hashCode());
		result = 37
				* result
				+ (getOtherDiabetes() == null ? 0 : this.getOtherDiabetes()
						.hashCode());
		result = 37
				* result
				+ (getOtherDiabetesSpecify() == null ? 0 : this
						.getOtherDiabetesSpecify().hashCode());
		result = 37 * result
				+ (getStroke() == null ? 0 : this.getStroke().hashCode());
		result = 37
				* result
				+ (getStrokeDiagnosed() == null ? 0 : this.getStrokeDiagnosed()
						.hashCode());
		result = 37
				* result
				+ (getTransientIschemicAttack() == null ? 0 : this
						.getTransientIschemicAttack().hashCode());
		result = 37 * result
				+ (getWeakness() == null ? 0 : this.getWeakness().hashCode());
		result = 37 * result
				+ (getNumbness() == null ? 0 : this.getNumbness().hashCode());
		result = 37 * result
				+ (getBlindness() == null ? 0 : this.getBlindness().hashCode());
		result = 37
				* result
				+ (getHalfVisionLoss() == null ? 0 : this.getHalfVisionLoss()
						.hashCode());
		result = 37
				* result
				+ (getUnderstandingLoss() == null ? 0 : this
						.getUnderstandingLoss().hashCode());
		result = 37
				* result
				+ (getExpressionLoss() == null ? 0 : this.getExpressionLoss()
						.hashCode());
		result = 37 * result
				+ (getBpMeasure() == null ? 0 : this.getBpMeasure().hashCode());
		result = 37
				* result
				+ (getHypertension() == null ? 0 : this.getHypertension()
						.hashCode());
		result = 37
				* result
				+ (getHypertension12monthsYn() == null ? 0 : this
						.getHypertension12monthsYn().hashCode());
		result = 37
				* result
				+ (getHypertensionTreatmentYn() == null ? 0 : this
						.getHypertensionTreatmentYn().hashCode());
		result = 37
				* result
				+ (getHypertensionMedsYn() == null ? 0 : this
						.getHypertensionMedsYn().hashCode());
		result = 37
				* result
				+ (getHypertensionMeds() == null ? 0 : this
						.getHypertensionMeds().hashCode());
		result = 37
				* result
				+ (getHypertensionTraditional() == null ? 0 : this
						.getHypertensionTraditional().hashCode());
		result = 37 * result
				+ (getAngina() == null ? 0 : this.getAngina().hashCode());
		result = 37
				* result
				+ (getAnginaTreatmentYn() == null ? 0 : this
						.getAnginaTreatmentYn().hashCode());
		result = 37
				* result
				+ (getAnginaTreatNow() == null ? 0 : this.getAnginaTreatNow()
						.hashCode());
		result = 37
				* result
				+ (getAnginaMeds() == null ? 0 : this.getAnginaMeds()
						.hashCode());
		result = 37
				* result
				+ (getAnginaTraditional() == null ? 0 : this
						.getAnginaTraditional().hashCode());
		result = 37 * result
				+ (getPain() == null ? 0 : this.getPain().hashCode());
		result = 37 * result
				+ (getPain2() == null ? 0 : this.getPain2().hashCode());
		result = 37
				* result
				+ (getPainActionStopOrSlow() == null ? 0 : this
						.getPainActionStopOrSlow().hashCode());
		result = 37
				* result
				+ (getPainActionRest() == null ? 0 : this.getPainActionRest()
						.hashCode());
		result = 37
				* result
				+ (getPainActionMedicine() == null ? 0 : this
						.getPainActionMedicine().hashCode());
		result = 37
				* result
				+ (getPainActionCarryOn() == null ? 0 : this
						.getPainActionCarryOn().hashCode());
		result = 37
				* result
				+ (getReliefStandstill() == null ? 0 : this
						.getReliefStandstill().hashCode());
		result = 37
				* result
				+ (getPainLocation1() == null ? 0 : this.getPainLocation1()
						.hashCode());
		result = 37
				* result
				+ (getPainLocation2() == null ? 0 : this.getPainLocation2()
						.hashCode());
		result = 37
				* result
				+ (getPainLocation3() == null ? 0 : this.getPainLocation3()
						.hashCode());
		result = 37
				* result
				+ (getPainLocation4() == null ? 0 : this.getPainLocation4()
						.hashCode());
		result = 37
				* result
				+ (getPainLocation5() == null ? 0 : this.getPainLocation5()
						.hashCode());
		result = 37
				* result
				+ (getPainLocation6() == null ? 0 : this.getPainLocation6()
						.hashCode());
		result = 37
				* result
				+ (getPainLocation7() == null ? 0 : this.getPainLocation7()
						.hashCode());
		result = 37
				* result
				+ (getPainLocation8() == null ? 0 : this.getPainLocation8()
						.hashCode());
		result = 37
				* result
				+ (getPainLocation9() == null ? 0 : this.getPainLocation9()
						.hashCode());
		result = 37
				* result
				+ (getPainLocation10() == null ? 0 : this.getPainLocation10()
						.hashCode());
		result = 37
				* result
				+ (getPainLocation11() == null ? 0 : this.getPainLocation11()
						.hashCode());
		result = 37
				* result
				+ (getPainLocation12() == null ? 0 : this.getPainLocation12()
						.hashCode());
		result = 37
				* result
				+ (getPainLocation13() == null ? 0 : this.getPainLocation13()
						.hashCode());
		result = 37
				* result
				+ (getPainLocation14() == null ? 0 : this.getPainLocation14()
						.hashCode());
		result = 37
				* result
				+ (getPainLocation15() == null ? 0 : this.getPainLocation15()
						.hashCode());
		result = 37
				* result
				+ (getPainLocation16() == null ? 0 : this.getPainLocation16()
						.hashCode());
		result = 37
				* result
				+ (getPainLocation17() == null ? 0 : this.getPainLocation17()
						.hashCode());
		result = 37
				* result
				+ (getPainLocation18() == null ? 0 : this.getPainLocation18()
						.hashCode());
		result = 37
				* result
				+ (getHeartattack() == null ? 0 : this.getHeartattack()
						.hashCode());
		result = 37
				* result
				+ (getHeartattackTreatment() == null ? 0 : this
						.getHeartattackTreatment().hashCode());
		result = 37
				* result
				+ (getHeartattackTraditional() == null ? 0 : this
						.getHeartattackTraditional().hashCode());
		result = 37
				* result
				+ (getCongestiveHeartFailure() == null ? 0 : this
						.getCongestiveHeartFailure().hashCode());
		result = 37
				* result
				+ (getChfTreatmentYn() == null ? 0 : this.getChfTreatmentYn()
						.hashCode());
		result = 37
				* result
				+ (getChfTreatNow() == null ? 0 : this.getChfTreatNow()
						.hashCode());
		result = 37 * result
				+ (getChfMeds() == null ? 0 : this.getChfMeds().hashCode());
		result = 37
				* result
				+ (getChfTraditional() == null ? 0 : this.getChfTraditional()
						.hashCode());
		result = 37
				* result
				+ (getCholesterol() == null ? 0 : this.getCholesterol()
						.hashCode());
		result = 37
				* result
				+ (getHCholesterol() == null ? 0 : this.getHCholesterol()
						.hashCode());
		result = 37
				* result
				+ (getCholesterolTreatment() == null ? 0 : this
						.getCholesterolTreatment().hashCode());
		result = 37
				* result
				+ (getCholesterolMedsSpecialDiet() == null ? 0 : this
						.getCholesterolMedsSpecialDiet().hashCode());
		result = 37
				* result
				+ (getCholesterolMedsWeightLoss() == null ? 0 : this
						.getCholesterolMedsWeightLoss().hashCode());
		result = 37
				* result
				+ (getCholesterolMedsMedicine() == null ? 0 : this
						.getCholesterolMedsMedicine().hashCode());
		result = 37
				* result
				+ (getCholesterolMedsOther() == null ? 0 : this
						.getCholesterolMedsOther().hashCode());
		result = 37
				* result
				+ (getCholesterolTraditional() == null ? 0 : this
						.getCholesterolTraditional().hashCode());
		result = 37 * result
				+ (getThyroid() == null ? 0 : this.getThyroid().hashCode());
		result = 37
				* result
				+ (getThyroidType() == null ? 0 : this.getThyroidType()
						.hashCode());
		result = 37
				* result
				+ (getThryroidSpecify() == null ? 0 : this.getThryroidSpecify()
						.hashCode());
		result = 37
				* result
				+ (getThyroidTreatmentYn() == null ? 0 : this
						.getThyroidTreatmentYn().hashCode());
		result = 37
				* result
				+ (getThyroidTreatmentHormone() == null ? 0 : this
						.getThyroidTreatmentHormone().hashCode());
		result = 37
				* result
				+ (getThyroidTreatmentSurgery() == null ? 0 : this
						.getThyroidTreatmentSurgery().hashCode());
		result = 37
				* result
				+ (getThyroidTreatmentIodine() == null ? 0 : this
						.getThyroidTreatmentIodine().hashCode());
		result = 37
				* result
				+ (getThyroidTreatmentDrugs() == null ? 0 : this
						.getThyroidTreatmentDrugs().hashCode());
		result = 37
				* result
				+ (getParentsThyroid() == null ? 0 : this.getParentsThyroid()
						.hashCode());
		result = 37
				* result
				+ (getSpecifyThyroidParent() == null ? 0 : this
						.getSpecifyThyroidParent().hashCode());
		result = 37
				* result
				+ (getKidneyDisease() == null ? 0 : this.getKidneyDisease()
						.hashCode());
		result = 37
				* result
				+ (getKnowTypeKidneyDisease() == null ? 0 : this
						.getKnowTypeKidneyDisease().hashCode());
		result = 37
				* result
				+ (getTypeKidneyDisease() == null ? 0 : this
						.getTypeKidneyDisease().hashCode());
		result = 37
				* result
				+ (getLowKidneyFunction() == null ? 0 : this
						.getLowKidneyFunction().hashCode());
		result = 37
				* result
				+ (getKidneyFamily() == null ? 0 : this.getKidneyFamily()
						.hashCode());
		result = 37
				* result
				+ (getFamilyKidneyMother() == null ? 0 : this
						.getFamilyKidneyMother().hashCode());
		result = 37
				* result
				+ (getFamilyKidneyFather() == null ? 0 : this
						.getFamilyKidneyFather().hashCode());
		result = 37
				* result
				+ (getFamilyKidneyOther() == null ? 0 : this
						.getFamilyKidneyOther().hashCode());
		result = 37
				* result
				+ (getFamilyKidneyOtherSpecify() == null ? 0 : this
						.getFamilyKidneyOtherSpecify().hashCode());
		result = 37
				* result
				+ (getKidneyFamilyType() == null ? 0 : this
						.getKidneyFamilyType().hashCode());
		result = 37
				* result
				+ (getFamilyKidneyType() == null ? 0 : this
						.getFamilyKidneyType().hashCode());
		result = 37 * result
				+ (getWorkDays() == null ? 0 : this.getWorkDays().hashCode());
		result = 37
				* result
				+ (getWorkWeekend() == null ? 0 : this.getWorkWeekend()
						.hashCode());
		result = 37
				* result
				+ (getWorkSedentary() == null ? 0 : this.getWorkSedentary()
						.hashCode());
		result = 37
				* result
				+ (getWorkVigorous() == null ? 0 : this.getWorkVigorous()
						.hashCode());
		result = 37
				* result
				+ (getWorkVigorousDays() == null ? 0 : this
						.getWorkVigorousDays().hashCode());
		result = 37
				* result
				+ (getWorkVigorousHours() == null ? 0 : this
						.getWorkVigorousHours().hashCode());
		result = 37
				* result
				+ (getWorkVigorousMinutes() == null ? 0 : this
						.getWorkVigorousMinutes().hashCode());
		result = 37
				* result
				+ (getWorkVigorousTotal() == null ? 0 : this
						.getWorkVigorousTotal().hashCode());
		result = 37
				* result
				+ (getWorkModerate() == null ? 0 : this.getWorkModerate()
						.hashCode());
		result = 37
				* result
				+ (getWorkModerateDays() == null ? 0 : this
						.getWorkModerateDays().hashCode());
		result = 37
				* result
				+ (getWorkModerateHours() == null ? 0 : this
						.getWorkModerateHours().hashCode());
		result = 37
				* result
				+ (getWorkModerateMins() == null ? 0 : this
						.getWorkModerateMins().hashCode());
		result = 37
				* result
				+ (getWorkModerateTotal() == null ? 0 : this
						.getWorkModerateTotal().hashCode());
		result = 37
				* result
				+ (getWorkDayHours() == null ? 0 : this.getWorkDayHours()
						.hashCode());
		result = 37
				* result
				+ (getWorkDayMins() == null ? 0 : this.getWorkDayMins()
						.hashCode());
		result = 37
				* result
				+ (getWorkDayTotal() == null ? 0 : this.getWorkDayTotal()
						.hashCode());
		result = 37
				* result
				+ (getTransportPhysical() == null ? 0 : this
						.getTransportPhysical().hashCode());
		result = 37
				* result
				+ (getTransportPhysicalDays() == null ? 0 : this
						.getTransportPhysicalDays().hashCode());
		result = 37
				* result
				+ (getTransportPhysicalHours() == null ? 0 : this
						.getTransportPhysicalHours().hashCode());
		result = 37
				* result
				+ (getTransportPhysicalMins() == null ? 0 : this
						.getTransportPhysicalMins().hashCode());
		result = 37
				* result
				+ (getTransportPhysicalTotal() == null ? 0 : this
						.getTransportPhysicalTotal().hashCode());
		result = 37
				* result
				+ (getLeisurePhysical() == null ? 0 : this.getLeisurePhysical()
						.hashCode());
		result = 37
				* result
				+ (getLeisureVigorous() == null ? 0 : this.getLeisureVigorous()
						.hashCode());
		result = 37
				* result
				+ (getLeisureVigorousDays() == null ? 0 : this
						.getLeisureVigorousDays().hashCode());
		result = 37
				* result
				+ (getLeisureVigorousHours() == null ? 0 : this
						.getLeisureVigorousHours().hashCode());
		result = 37
				* result
				+ (getLeisureVigorousMins() == null ? 0 : this
						.getLeisureVigorousMins().hashCode());
		result = 37
				* result
				+ (getLeisureVigorousTotal() == null ? 0 : this
						.getLeisureVigorousTotal().hashCode());
		result = 37
				* result
				+ (getLeisureModerate() == null ? 0 : this.getLeisureModerate()
						.hashCode());
		result = 37
				* result
				+ (getLeisureModerateDays() == null ? 0 : this
						.getLeisureModerateDays().hashCode());
		result = 37
				* result
				+ (getLeisureModerateHours() == null ? 0 : this
						.getLeisureModerateHours().hashCode());
		result = 37
				* result
				+ (getLeisureModerateMins() == null ? 0 : this
						.getLeisureModerateMins().hashCode());
		result = 37
				* result
				+ (getLeisureModerateTotal() == null ? 0 : this
						.getLeisureModerateTotal().hashCode());
		result = 37
				* result
				+ (getSittingHours() == null ? 0 : this.getSittingHours()
						.hashCode());
		result = 37
				* result
				+ (getSittingWorkHours() == null ? 0 : this
						.getSittingWorkHours().hashCode());
		result = 37
				* result
				+ (getSittingWorkMins() == null ? 0 : this.getSittingWorkMins()
						.hashCode());
		result = 37
				* result
				+ (getSittingWorkTotal() == null ? 0 : this
						.getSittingWorkTotal().hashCode());
		result = 37
				* result
				+ (getTvWeekHours() == null ? 0 : this.getTvWeekHours()
						.hashCode());
		result = 37
				* result
				+ (getTvWeekMins() == null ? 0 : this.getTvWeekMins()
						.hashCode());
		result = 37
				* result
				+ (getTvWeekTotal() == null ? 0 : this.getTvWeekTotal()
						.hashCode());
		result = 37
				* result
				+ (getTvWeekendHours() == null ? 0 : this.getTvWeekendHours()
						.hashCode());
		result = 37
				* result
				+ (getTvWeekendMins() == null ? 0 : this.getTvWeekendMins()
						.hashCode());
		result = 37
				* result
				+ (getTvWeekendTotal() == null ? 0 : this.getTvWeekendTotal()
						.hashCode());
		result = 37
				* result
				+ (getPcWeekHours() == null ? 0 : this.getPcWeekHours()
						.hashCode());
		result = 37
				* result
				+ (getPcWeekMins() == null ? 0 : this.getPcWeekMins()
						.hashCode());
		result = 37
				* result
				+ (getPcWeekTotal() == null ? 0 : this.getPcWeekTotal()
						.hashCode());
		result = 37
				* result
				+ (getPcWeekendHours() == null ? 0 : this.getPcWeekendHours()
						.hashCode());
		result = 37
				* result
				+ (getPcWeekendMins() == null ? 0 : this.getPcWeekendMins()
						.hashCode());
		result = 37
				* result
				+ (getPcWeekendTotal() == null ? 0 : this.getPcWeekendTotal()
						.hashCode());
		result = 37
				* result
				+ (getSitTravelWeekHours() == null ? 0 : this
						.getSitTravelWeekHours().hashCode());
		result = 37
				* result
				+ (getSitTravelWeekMins() == null ? 0 : this
						.getSitTravelWeekMins().hashCode());
		result = 37
				* result
				+ (getSitTravelWeekTotal() == null ? 0 : this
						.getSitTravelWeekTotal().hashCode());
		result = 37
				* result
				+ (getSitTravelWeekendHours() == null ? 0 : this
						.getSitTravelWeekendHours().hashCode());
		result = 37
				* result
				+ (getSitTravelWeekendMins() == null ? 0 : this
						.getSitTravelWeekendMins().hashCode());
		result = 37
				* result
				+ (getSitTravelWeekendTotal() == null ? 0 : this
						.getSitTravelWeekendTotal().hashCode());
		result = 37
				* result
				+ (getSitSocialWeekHours() == null ? 0 : this
						.getSitSocialWeekHours().hashCode());
		result = 37
				* result
				+ (getSitSocialWeekMins() == null ? 0 : this
						.getSitSocialWeekMins().hashCode());
		result = 37
				* result
				+ (getSitSocialWeekTotal() == null ? 0 : this
						.getSitSocialWeekTotal().hashCode());
		result = 37
				* result
				+ (getSitSocialWeekendHours() == null ? 0 : this
						.getSitSocialWeekendHours().hashCode());
		result = 37
				* result
				+ (getSitSocialWeekendMins() == null ? 0 : this
						.getSitSocialWeekendMins().hashCode());
		result = 37
				* result
				+ (getSitSocialWeekendTotal() == null ? 0 : this
						.getSitSocialWeekendTotal().hashCode());
		result = 37
				* result
				+ (getHoursRelaxWeek() == null ? 0 : this.getHoursRelaxWeek()
						.hashCode());
		result = 37
				* result
				+ (getMinsRelaxWeek() == null ? 0 : this.getMinsRelaxWeek()
						.hashCode());
		result = 37
				* result
				+ (getTotalRelaxWeek() == null ? 0 : this.getTotalRelaxWeek()
						.hashCode());
		result = 37
				* result
				+ (getHoursRelaxWeekend() == null ? 0 : this
						.getHoursRelaxWeekend().hashCode());
		result = 37
				* result
				+ (getMinsRelaxWeekend() == null ? 0 : this
						.getMinsRelaxWeekend().hashCode());
		result = 37
				* result
				+ (getTotalRelaxWeekend() == null ? 0 : this
						.getTotalRelaxWeekend().hashCode());
		result = 37
				* result
				+ (getHoursChurch() == null ? 0 : this.getHoursChurch()
						.hashCode());
		result = 37
				* result
				+ (getMinsChurch() == null ? 0 : this.getMinsChurch()
						.hashCode());
		result = 37
				* result
				+ (getTotalChurchWeek() == null ? 0 : this.getTotalChurchWeek()
						.hashCode());
		result = 37
				* result
				+ (getHoursChurchWeekend() == null ? 0 : this
						.getHoursChurchWeekend().hashCode());
		result = 37
				* result
				+ (getMinsChurchWeekend() == null ? 0 : this
						.getMinsChurchWeekend().hashCode());
		result = 37
				* result
				+ (getTotalChurchWeekend() == null ? 0 : this
						.getTotalChurchWeekend().hashCode());
		result = 37
				* result
				+ (getSleepTimeWeek() == null ? 0 : this.getSleepTimeWeek()
						.hashCode());
		result = 37
				* result
				+ (getWakeupTimeWeek() == null ? 0 : this.getWakeupTimeWeek()
						.hashCode());
		result = 37
				* result
				+ (getHoursSleepWeek() == null ? 0 : this.getHoursSleepWeek()
						.hashCode());
		result = 37
				* result
				+ (getSleepTimeWeekend() == null ? 0 : this
						.getSleepTimeWeekend().hashCode());
		result = 37
				* result
				+ (getWakeupTimeWeekend() == null ? 0 : this
						.getWakeupTimeWeekend().hashCode());
		result = 37
				* result
				+ (getHoursSleepWeekend() == null ? 0 : this
						.getHoursSleepWeekend().hashCode());
		result = 37 * result
				+ (getEndTime() == null ? 0 : this.getEndTime().hashCode());
		result = 37
				* result
				+ (getStandingHeightMm() == null ? 0 : this
						.getStandingHeightMm().hashCode());
		result = 37 * result
				+ (getWeightKg() == null ? 0 : this.getWeightKg().hashCode());
		result = 37
				* result
				+ (getWaistCircumferenceMm() == null ? 0 : this
						.getWaistCircumferenceMm().hashCode());
		result = 37
				* result
				+ (getHipCircumferenceMm() == null ? 0 : this
						.getHipCircumferenceMm().hashCode());
		result = 37 * result
				+ (getSystolic1() == null ? 0 : this.getSystolic1().hashCode());
		result = 37 * result
				+ (getSystolic2() == null ? 0 : this.getSystolic2().hashCode());
		result = 37 * result
				+ (getSystolic3() == null ? 0 : this.getSystolic3().hashCode());
		result = 37 * result
				+ (getBpSysAvg() == null ? 0 : this.getBpSysAvg().hashCode());
		result = 37
				* result
				+ (getDiastolic1() == null ? 0 : this.getDiastolic1()
						.hashCode());
		result = 37
				* result
				+ (getDiastolic2() == null ? 0 : this.getDiastolic2()
						.hashCode());
		result = 37
				* result
				+ (getDiastolic3() == null ? 0 : this.getDiastolic3()
						.hashCode());
		result = 37 * result
				+ (getBpDiaAvg() == null ? 0 : this.getBpDiaAvg().hashCode());
		result = 37 * result
				+ (getTimeBp() == null ? 0 : this.getTimeBp().hashCode());
		result = 37 * result
				+ (getPulse1() == null ? 0 : this.getPulse1().hashCode());
		result = 37 * result
				+ (getPulse2() == null ? 0 : this.getPulse2().hashCode());
		result = 37 * result
				+ (getPulse3() == null ? 0 : this.getPulse3().hashCode());
		result = 37 * result
				+ (getPulseAvg() == null ? 0 : this.getPulseAvg().hashCode());
		result = 37
				* result
				+ (getCollectorMeasurements() == null ? 0 : this
						.getCollectorMeasurements().hashCode());
		result = 37
				* result
				+ (getNotesAnthropometry() == null ? 0 : this
						.getNotesAnthropometry().hashCode());
		result = 37
				* result
				+ (getUltrasound() == null ? 0 : this.getUltrasound()
						.hashCode());
		result = 37
				* result
				+ (getVisceralFat() == null ? 0 : this.getVisceralFat()
						.hashCode());
		result = 37
				* result
				+ (getSubcutaneousFat() == null ? 0 : this.getSubcutaneousFat()
						.hashCode());
		result = 37
				* result
				+ (getUltrasoundOperator() == null ? 0 : this
						.getUltrasoundOperator().hashCode());
		result = 37
				* result
				+ (getDateUltrasoundTaken() == null ? 0 : this
						.getDateUltrasoundTaken().hashCode());
		result = 37 * result
				+ (getCimt() == null ? 0 : this.getCimt().hashCode());
		result = 37
				* result
				+ (getMinCimtRight() == null ? 0 : this.getMinCimtRight()
						.hashCode());
		result = 37
				* result
				+ (getMaxCimtRight() == null ? 0 : this.getMaxCimtRight()
						.hashCode());
		result = 37
				* result
				+ (getMeanCimtRight() == null ? 0 : this.getMeanCimtRight()
						.hashCode());
		result = 37
				* result
				+ (getMinCimtLeft() == null ? 0 : this.getMinCimtLeft()
						.hashCode());
		result = 37
				* result
				+ (getMaxCimtLeft() == null ? 0 : this.getMaxCimtLeft()
						.hashCode());
		result = 37
				* result
				+ (getMeanCimtLeft() == null ? 0 : this.getMeanCimtLeft()
						.hashCode());
		result = 37
				* result
				+ (getUltrasoundNotes() == null ? 0 : this.getUltrasoundNotes()
						.hashCode());
		result = 37 * result
				+ (getFasting() == null ? 0 : this.getFasting().hashCode());
		result = 37 * result
				+ (getTimeAte() == null ? 0 : this.getTimeAte().hashCode());
		result = 37
				* result
				+ (getFastingConfirmation() == null ? 0 : this
						.getFastingConfirmation().hashCode());
		result = 37 * result
				+ (getRed() == null ? 0 : this.getRed().hashCode());
		result = 37
				* result
				+ (getNoRedTubes() == null ? 0 : this.getNoRedTubes()
						.hashCode());
		result = 37 * result
				+ (getPurple() == null ? 0 : this.getPurple().hashCode());
		result = 37
				* result
				+ (getNoPurpleTubes() == null ? 0 : this.getNoPurpleTubes()
						.hashCode());
		result = 37 * result
				+ (getGrey() == null ? 0 : this.getGrey().hashCode());
		result = 37
				* result
				+ (getNoGreyTubes() == null ? 0 : this.getNoGreyTubes()
						.hashCode());
		result = 37
				* result
				+ (getNotesBlood() == null ? 0 : this.getNotesBlood()
						.hashCode());
		result = 37
				* result
				+ (getPhelbotomist() == null ? 0 : this.getPhelbotomist()
						.hashCode());
		result = 37
				* result
				+ (getDateBloodTaken() == null ? 0 : this.getDateBloodTaken()
						.hashCode());
		result = 37
				* result
				+ (getTimeBloodTaken() == null ? 0 : this.getTimeBloodTaken()
						.hashCode());
		result = 37 * result
				+ (getComments() == null ? 0 : this.getComments().hashCode());
		result = 37 * result
				+ (getTestedHiv() == null ? 0 : this.getTestedHiv().hashCode());
		result = 37 * result
				+ (getHivStatus() == null ? 0 : this.getHivStatus().hashCode());
		result = 37
				* result
				+ (getHivPositive() == null ? 0 : this.getHivPositive()
						.hashCode());
		result = 37
				* result
				+ (getHivMedication() == null ? 0 : this.getHivMedication()
						.hashCode());
		result = 37
				* result
				+ (getTraditionalMedHiv() == null ? 0 : this
						.getTraditionalMedHiv().hashCode());
		result = 37
				* result
				+ (getAgreeHivtest() == null ? 0 : this.getAgreeHivtest()
						.hashCode());
		result = 37 * result
				+ (getResultHiv() == null ? 0 : this.getResultHiv().hashCode());
		result = 37
				* result
				+ (getPlasmaBatch() == null ? 0 : this.getPlasmaBatch()
						.hashCode());
		result = 37 * result
				+ (getPlasmaBox() == null ? 0 : this.getPlasmaBox().hashCode());
		result = 37
				* result
				+ (getDatePlasmaReceived() == null ? 0 : this
						.getDatePlasmaReceived().hashCode());
		result = 37
				* result
				+ (getIsHaemolysed() == null ? 0 : this.getIsHaemolysed()
						.hashCode());
		result = 37
				* result
				+ (getBiomarkerNotes() == null ? 0 : this.getBiomarkerNotes()
						.hashCode());
		result = 37
				* result
				+ (getSerumTechName() == null ? 0 : this.getSerumTechName()
						.hashCode());
		result = 37 * result
				+ (getGlucose() == null ? 0 : this.getGlucose().hashCode());
		result = 37 * result
				+ (getGlucose2() == null ? 0 : this.getGlucose2().hashCode());
		result = 37 * result
				+ (getGlucose3() == null ? 0 : this.getGlucose3().hashCode());
		result = 37
				* result
				+ (getDateGlucose() == null ? 0 : this.getDateGlucose()
						.hashCode());
		result = 37
				* result
				+ (getGlucoseComments() == null ? 0 : this.getGlucoseComments()
						.hashCode());
		result = 37
				* result
				+ (getSerumBatch() == null ? 0 : this.getSerumBatch()
						.hashCode());
		result = 37 * result
				+ (getSerumBox() == null ? 0 : this.getSerumBox().hashCode());
		result = 37
				* result
				+ (getDateSerumReceived() == null ? 0 : this
						.getDateSerumReceived().hashCode());
		result = 37
				* result
				+ (getIsSerumTestable() == null ? 0 : this.getIsSerumTestable()
						.hashCode());
		result = 37
				* result
				+ (getSerumComments() == null ? 0 : this.getSerumComments()
						.hashCode());
		result = 37
				* result
				+ (getSCreatinine() == null ? 0 : this.getSCreatinine()
						.hashCode());
		result = 37
				* result
				+ (getPlasmaTechName() == null ? 0 : this.getPlasmaTechName()
						.hashCode());
		result = 37 * result
				+ (getInsulin() == null ? 0 : this.getInsulin().hashCode());
		result = 37 * result
				+ (getInsulin2() == null ? 0 : this.getInsulin2().hashCode());
		result = 37 * result
				+ (getInsulin3() == null ? 0 : this.getInsulin3().hashCode());
		result = 37
				* result
				+ (getDateInsulinTested() == null ? 0 : this
						.getDateInsulinTested().hashCode());
		result = 37
				* result
				+ (getInsulinComments() == null ? 0 : this.getInsulinComments()
						.hashCode());
		result = 37 * result
				+ (getHdl() == null ? 0 : this.getHdl().hashCode());
		result = 37 * result
				+ (getHdl2() == null ? 0 : this.getHdl2().hashCode());
		result = 37 * result
				+ (getHdl3() == null ? 0 : this.getHdl3().hashCode());
		result = 37 * result
				+ (getLdl() == null ? 0 : this.getLdl().hashCode());
		result = 37 * result
				+ (getLdl2() == null ? 0 : this.getLdl2().hashCode());
		result = 37 * result
				+ (getLdl3() == null ? 0 : this.getLdl3().hashCode());
		result = 37
				* result
				+ (getCholesterol1() == null ? 0 : this.getCholesterol1()
						.hashCode());
		result = 37
				* result
				+ (getCholesterol2() == null ? 0 : this.getCholesterol2()
						.hashCode());
		result = 37
				* result
				+ (getCholesterol3() == null ? 0 : this.getCholesterol3()
						.hashCode());
		result = 37
				* result
				+ (getTriglycerides() == null ? 0 : this.getTriglycerides()
						.hashCode());
		result = 37
				* result
				+ (getTriglycerides2() == null ? 0 : this.getTriglycerides2()
						.hashCode());
		result = 37
				* result
				+ (getTriglycerides3() == null ? 0 : this.getTriglycerides3()
						.hashCode());
		result = 37
				* result
				+ (getDateLipidsTested() == null ? 0 : this
						.getDateLipidsTested().hashCode());
		result = 37
				* result
				+ (getLipidComments() == null ? 0 : this.getLipidComments()
						.hashCode());
		result = 37
				* result
				+ (getUrineBatch() == null ? 0 : this.getUrineBatch()
						.hashCode());
		result = 37 * result
				+ (getUrineBox() == null ? 0 : this.getUrineBox().hashCode());
		result = 37
				* result
				+ (getDateUrineReceived() == null ? 0 : this
						.getDateUrineReceived().hashCode());
		result = 37
				* result
				+ (getUrineTechName() == null ? 0 : this.getUrineTechName()
						.hashCode());
		result = 37
				* result
				+ (getUrCreatinine() == null ? 0 : this.getUrCreatinine()
						.hashCode());
		result = 37 * result
				+ (getUrAlbumin() == null ? 0 : this.getUrAlbumin().hashCode());
		result = 37 * result
				+ (getAcr() == null ? 0 : this.getAcr().hashCode());
		result = 37 * result
				+ (getUrProtein() == null ? 0 : this.getUrProtein().hashCode());
		result = 37
				* result
				+ (getDateUrineTested() == null ? 0 : this.getDateUrineTested()
						.hashCode());
		result = 37
				* result
				+ (getUrineComments() == null ? 0 : this.getUrineComments()
						.hashCode());
		result = 37
				* result
				+ (getUrineSample() == null ? 0 : this.getUrineSample()
						.hashCode());
		result = 37
				* result
				+ (getInformedConsent() == null ? 0 : this.getInformedConsent()
						.hashCode());
		result = 37
				* result
				+ (getQuestionnaire() == null ? 0 : this.getQuestionnaire()
						.hashCode());
		result = 37
				* result
				+ (getAnthropometrics() == null ? 0 : this.getAnthropometrics()
						.hashCode());
		result = 37
				* result
				+ (getBloodPressureDone() == null ? 0 : this
						.getBloodPressureDone().hashCode());
		result = 37 * result
				+ (getPulseDone() == null ? 0 : this.getPulseDone().hashCode());
		result = 37
				* result
				+ (getBloodSamples() == null ? 0 : this.getBloodSamples()
						.hashCode());
		result = 37
				* result
				+ (getAbdominalUltrasound() == null ? 0 : this
						.getAbdominalUltrasound().hashCode());
		result = 37 * result
				+ (getTableCimt() == null ? 0 : this.getTableCimt().hashCode());
		result = 37 * result
				+ (getHivTest() == null ? 0 : this.getHivTest().hashCode());
		result = 37 * result
				+ (getUrine() == null ? 0 : this.getUrine().hashCode());
		result = 37
				* result
				+ (getQualityControllerId() == null ? 0 : this
						.getQualityControllerId().hashCode());
		result = 37
				* result
				+ (getReimbursement() == null ? 0 : this.getReimbursement()
						.hashCode());
		result = 37
				* result
				+ (getTestResultsNotes() == null ? 0 : this
						.getTestResultsNotes().hashCode());
		result = 37 * result
				+ (getBmiC() == null ? 0 : this.getBmiC().hashCode());
		result = 37
				* result
				+ (getFastingGlucose() == null ? 0 : this.getFastingGlucose()
						.hashCode());
		result = 37
				* result
				+ (getDmPresentC() == null ? 0 : this.getDmPresentC()
						.hashCode());
		result = 37
				* result
				+ (getHtnPresentC() == null ? 0 : this.getHtnPresentC()
						.hashCode());
		result = 37 * result
				+ (getMvpaC() == null ? 0 : this.getMvpaC().hashCode());
		result = 37 * result
				+ (getMvpaCatC() == null ? 0 : this.getMvpaCatC().hashCode());
		result = 37 * result
				+ (getWstHipRC() == null ? 0 : this.getWstHipRC().hashCode());
		result = 37 * result
				+ (getBmiCatC() == null ? 0 : this.getBmiCatC().hashCode());
		result = 37
				* result
				+ (getHouseholdDensityC() == null ? 0 : this
						.getHouseholdDensityC().hashCode());
		result = 37
				* result
				+ (getHivFinalStatusC() == null ? 0 : this.getHivFinalStatusC()
						.hashCode());
		result = 37 * result
				+ (getSesC() == null ? 0 : this.getSesC().hashCode());
		result = 37
				* result
				+ (getSesSiteQuintileC() == null ? 0 : this
						.getSesSiteQuintileC().hashCode());
		result = 37
				* result
				+ (getOtherLanguage() == null ? 0 : this.getOtherLanguage()
						.hashCode());
		result = 37
				* result
				+ (getNumInHouseC() == null ? 0 : this.getNumInHouseC()
						.hashCode());
		result = 37
				* result
				+ (getPeopleToRoomsDensityC() == null ? 0 : this
						.getPeopleToRoomsDensityC().hashCode());
		result = 37
				* result
				+ (getPeopleToBedroomsDensityC() == null ? 0 : this
						.getPeopleToBedroomsDensityC().hashCode());
		result = 37
				* result
				+ (getPartnershipStatusC() == null ? 0 : this
						.getPartnershipStatusC().hashCode());
		result = 37
				* result
				+ (getEmploymentStatusC() == null ? 0 : this
						.getEmploymentStatusC().hashCode());
		result = 37
				* result
				+ (getSmokingStatusC() == null ? 0 : this.getSmokingStatusC()
						.hashCode());
		result = 37
				* result
				+ (getAlcoholStatusC() == null ? 0 : this.getAlcoholStatusC()
						.hashCode());
		result = 37
				* result
				+ (getAvgSleepPerNightC() == null ? 0 : this
						.getAvgSleepPerNightC().hashCode());
		result = 37
				* result
				+ (getNumberOfSiblingsC() == null ? 0 : this
						.getNumberOfSiblingsC().hashCode());
		result = 37
				* result
				+ (getNumberOfChildrenC() == null ? 0 : this
						.getNumberOfChildrenC().hashCode());
		result = 37
				* result
				+ (getMonthsSinceLastPeriodC() == null ? 0 : this
						.getMonthsSinceLastPeriodC().hashCode());
		result = 37
				* result
				+ (getMenopausalStatusC() == null ? 0 : this
						.getMenopausalStatusC().hashCode());
		result = 37
				* result
				+ (getLastPeriodComments() == null ? 0 : this
						.getLastPeriodComments().hashCode());
		result = 37
				* result
				+ (getMonthsLastPeriodC() == null ? 0 : this
						.getMonthsLastPeriodC().hashCode());
		result = 37
				* result
				+ (getDateGlucose2() == null ? 0 : this.getDateGlucose2()
						.hashCode());
		result = 37
				* result
				+ (getSCreatinine2() == null ? 0 : this.getSCreatinine2()
						.hashCode());
		result = 37
				* result
				+ (getDateInsulinTested2() == null ? 0 : this
						.getDateInsulinTested2().hashCode());
		result = 37
				* result
				+ (getDateLipidsTested2() == null ? 0 : this
						.getDateLipidsTested2().hashCode());
		result = 37
				* result
				+ (getAllResultsStatus() == null ? 0 : this
						.getAllResultsStatus().hashCode());
		result = 37
				* result
				+ (getIsComplete() == null ? 0 : this.getIsComplete()
						.hashCode());
		result = 37
				* result
				+ (getMenopauseStatusC() == null ? 0 : this
						.getMenopauseStatusC().hashCode());
		result = 37
				* result
				+ (getMenopauseManual() == null ? 0 : this.getMenopauseManual()
						.hashCode());
		result = 37 * result
				+ (getHtnJnc7() == null ? 0 : this.getHtnJnc7().hashCode());
		return result;
	}

}
