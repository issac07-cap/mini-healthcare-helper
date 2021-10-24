package com.healthcare.databasemodule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/healthcare/databasemodule/Database;", "", "()V", "Companion", "databaseModule_debug"})
public final class Database {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> doctorDegreeList = null;
    private static final java.util.List<models.Doctor> registeredDoctorList = null;
    private static final java.util.List<models.Patient> registeredPatientList = null;
    private static final java.util.ArrayList<models.Appointment> appointmentList = null;
    public static final com.healthcare.databasemodule.Database.Companion Companion = null;
    
    public Database() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0013J\u0016\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bJ\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0016\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bJ\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eJ\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\"J\u0014\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020%0$H\u0002J\u0010\u0010&\u001a\u0004\u0018\u00010\r2\u0006\u0010\'\u001a\u00020\bJ\u0010\u0010(\u001a\u0004\u0018\u00010\u000f2\u0006\u0010 \u001a\u00020\bJ\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\u0007J\u000e\u0010*\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0005JH\u0010+\u001a\u00020,2\u0006\u0010\'\u001a\u00020\b28\u0010-\u001a4\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00040.j\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020/0\u0004j\b\u0012\u0004\u0012\u00020/`1`0R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/healthcare/databasemodule/Database$Companion;", "", "()V", "appointmentList", "Ljava/util/ArrayList;", "Lmodels/Appointment;", "doctorDegreeList", "", "", "getDoctorDegreeList", "()Ljava/util/List;", "registeredDoctorList", "", "Lmodels/Doctor;", "registeredPatientList", "Lmodels/Patient;", "addPatientToRegisteredList", "", "dataMap", "", "adminCheck", "username", "password", "alreadyAppointmentBooked", "appointment", "checkPatientLogin", "phone", "getAllAppointmentOnADate", "doctor", "date", "Ljava/time/LocalDate;", "getAllRespectiveAppointmentForPatient", "patientCredential", "pastOrUpcoming", "", "getCurrentDateTimePair", "Lkotlin/Pair;", "Ljava/time/LocalTime;", "getDoctorWithCredentials", "doctorCredentials", "getPatientWithCredentials", "getRegisteredDoctorList", "saveAppointmentDataForPatient", "updateDoctorTimingDetails", "", "availableDateTimeMap", "Ljava/util/HashMap;", "Lmodels/AvailableTimingSlot;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "databaseModule_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getDoctorDegreeList() {
            return null;
        }
        
        public final boolean adminCheck(@org.jetbrains.annotations.NotNull()
        java.lang.String username, @org.jetbrains.annotations.NotNull()
        java.lang.String password) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<models.Doctor> getRegisteredDoctorList() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final models.Doctor getDoctorWithCredentials(@org.jetbrains.annotations.NotNull()
        java.lang.String doctorCredentials) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final models.Patient getPatientWithCredentials(@org.jetbrains.annotations.NotNull()
        java.lang.String patientCredential) {
            return null;
        }
        
        public final void updateDoctorTimingDetails(@org.jetbrains.annotations.NotNull()
        java.lang.String doctorCredentials, @org.jetbrains.annotations.NotNull()
        java.util.HashMap<java.time.LocalDate, java.util.ArrayList<models.AvailableTimingSlot>> availableDateTimeMap) {
        }
        
        public final boolean addPatientToRegisteredList(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.String> dataMap) {
            return false;
        }
        
        public final boolean checkPatientLogin(@org.jetbrains.annotations.NotNull()
        java.lang.String phone, @org.jetbrains.annotations.NotNull()
        java.lang.String password) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<models.Appointment> getAllAppointmentOnADate(@org.jetbrains.annotations.NotNull()
        models.Doctor doctor, @org.jetbrains.annotations.NotNull()
        java.time.LocalDate date) {
            return null;
        }
        
        private final kotlin.Pair<java.time.LocalDate, java.time.LocalTime> getCurrentDateTimePair() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<models.Appointment> getAllRespectiveAppointmentForPatient(@org.jetbrains.annotations.NotNull()
        java.lang.String patientCredential, int pastOrUpcoming) {
            return null;
        }
        
        private final boolean alreadyAppointmentBooked(models.Appointment appointment) {
            return false;
        }
        
        public final boolean saveAppointmentDataForPatient(@org.jetbrains.annotations.NotNull()
        models.Appointment appointment) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}