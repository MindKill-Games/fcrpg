;Economy and general shops.

Include "health.bb"

;This requires health.bb to properly work, obviously.
;This takes a string parameter that will be the name of the doctor.
;All mentions of "The patient" must be replaced by the player´s name once that exists.
Function MediShop (d_vname$)

	
	If health<50

		Print "Doctor "+d_vname$+" says: Yes, you look like you need my help, what is it?"

		Goto medishop
	
	EndIf 

	If health>=50

		Print "Doctor "+d_vname$+" says: You look fine on the outside, but looks deceive, tell me what´s the problem."

		Goto medishop

	EndIf 

	.medishop

	Print "Doctor "+d_vname$+" says: Let´s get to work, shall we, would you like an examination, or just to buy medical supplies?"

	Print "1. Examination."

	Print "2. Buy supplies."

	shopselect$=Input("Select: ")

	If shopselect$=1 Then Goto examination

	If shopselect$=2 

		Goto meds

		Else

			Print "Invalid input"

	EndIf

	.examination

	Print "The doctor prepares his tools."

	Print "DOCTOR´S REPORT: "

	If bleedout=1 Then Print "The patient suffers from fatal bloodloss."

	If limball=1 Then Print "One or more of the patient´s limbs are hurt."

	If health<50 Then Print "The patient´s health is not in an ideal condition."

	Print "Press any key to finish reviewing Dr. "+d_vname$+"`s report."

	WaitKey 

	Print "Doctor "+d_vname$+" says: I can cure all of that for around 300 USD, do you want to procceed?"; need  to make the costs add up ffs

	Print "1. Yes"

	Print "2. No"

	treatmentchoice$=Input("Select: ")

	If treatmentchoice$=1 And money>=300 Then Goto treatment Else Print "You do not have enough money."

	If treatmentchoice$=2 Then Print "You denied."

	.treatment

	If limb1=1 Then limb1=limb1-1

	If limb2=1 Then limb2=limb2-1

	If limb3=1 Then limb3=limb3-1

	If limb4=1 Then limb4=limb4-1

	If limb5=1 Then limb5=limb5-1

	If bleedout=1 Then bleedout=bleedout-1

	If health<50 Then health=50

	Print "You´re treated."

	.meds

	Print "Doctor "+d_vname$+" says: I am going to show you my catalogue of medical supplies."

	Print "Catalogue: "

	Print "1. 5 Bandages - 50 USD"

	Print "2. 1 Healthkit - 75 USD "

	Print "3. Exit"

	choosebuymedisupplies$=Input("Select: ")

	If choosebuymedisupplies$=1 And money>=50 Then bandages=bandages+5
	
	If choosebuymedisupplies$=2 And money>=75 Then healthkits=healthkits+1

	If choosebuymedisupplies$=3 Then Print "You denied"

End Function 
