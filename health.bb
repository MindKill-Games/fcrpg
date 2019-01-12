;The hell

Global limb1=0,limb2=0,limb3=0,limb4=0,limb5=0 ;Goes in the following order: Right arm, left arm, right leg, left leg, torso.
Global bleedout=0 ;how can we do this pls help
Global limball=0 ;Use this as a streamlining option for interactions that require all limbs.
Global health=50
Global hurt=0 ;For the sake of streamlining
Include "items.bb"
;Reminder of state numbers.
;1 - Bad/Hurt, 0 - Good/Healthy


If limb1=1 Or limb2=1 Or limb3=1 Or limb4=1 Or limb5=1 Or bleedout=1 And hurt=0

	hurt+1

EndIf 

;---REPLACE THIS LATER---
;Reason: A far better system can be used for this, probable solution would be creating
;string variables for states and limb names and using them instead.
;Comment 2: Now, you might be asking, can´t we just streamline this?, yes, we can, but i´m not in my bethesda mood today.
Function HealthMenu ()

	If limb1=1

		Print "Your right arm is injured."

		Else

			Print "Your right arm is healthy."

	EndIf 

	If  limb2=1

		Print "Your left arm is injured."

		Else 

			Print "Your left arm is healthy."

	EndIf 

	If limb3=1 

		Print "Your right leg is injured."

		Else

			Print "Your right leg is healthy."

	EndIf

	If limb4=1

		Print "Your left leg is injured."

		Else

			Print "Your left leg is healthy."

	EndIf

	If limb5=1

		Print "Your torso is injured."

		Else

			Print "Your torso is healthy."

	EndIf

	If bleedout=1 

		Print "You are bleeding out!"

	EndIf

	Print "Health: "+health+"."

End Function 

While KeyDown(REPLACE_ME)

	HealthMenu ()

Wend

If limb1=1 Or limb2=1 Or limb3=1 Or limb4=1 Or limb5=1 And limball=0 

	limball=1

EndIf

;Heal attempts.

;THIS shit is another reason why we need vars for body part and state names.

Function HealingMenu ()

	Print "Healing Menu: "

	Print "Please type an ID to select which body part to heal."

	Print "1. Right arm."
	
	Print "2. Left arm."

	Print "3. Right leg."

	Print "4. Left Leg.

	Print "5. Exit."

	healprompt$=Input("Select: ")

	If healprompt$ = 1 And limb1=1 And healthkits>=1

		healthkits - 1
		
		limb1 - 1

		Print "Your right arm has been healed successfully."

		Else

			Print "You can´t do that right now."

	EndIf  

	If healprompt$ = 2 And limb2=1 And healthkits>=1

		healthkits - 1

		limb2 - 1

		Print "Your left arm has been healed successfully."

		Else

			Print "You can´t do that right now."

	EndIf

	If healthprompt$ = 3 And limb3=1 And healthkits>=1

		healthkits - 1

		limb2 - 1

		Print "Your right leg has been healed successfully."

		Else

			Print "You can´t do that right now."

	EndIf 

	If healthprompt$=4 And limb4=1 And healthkits>=1

		healthkits - 1

		limb2 - 1

		Print "Your left leg has been healed successfully."

		Else

			Print "You can´t do that right now."

	EndIf 

	If healthprompt$=5 Then Print "Ok."
	
End Function 



	
		

		







