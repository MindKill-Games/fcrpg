;Economy and general shops.

Include "health.bb"

;This requires health.bb to properly work, obviously.
;This takes a string parameter that will be the name of the doctor.
;All mentions of "The patient" must be replaced by the player´s name once that exists.
Function MediShop (d_vname$) 
	
	Case 0 health<50

		Print "Doctor "+d_vname$+" says: Yes, you look like you need my help, what is it?"

		Goto medishop

	Case 1 health>=50

		Print "Doctor "+d_vname$+" says: You look fine on the outside, but looks deceive, tell me what´s the problem."

		Goto medishop

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

	;gotta finish this one reeeeeeeeeeeeee

	