Classe_NP
=========

Question Certificat :
=====================
Q1)
---
Le certificat sera un tableau de taille n, les données en entrée sont de taille
n+3 (liste d'objets + 3 constantes).

Q2)
---
Algo de vérification déterministe :
	// Créer liste de "sacs" (entiers)
	for(int i = 0 ; i < n ; i++) :
		sac[certif[i]] -= x[i]
		if(sac[certif[i]] < 0):
			return false
	return true

Q3)
---
Un algo Non-Deterministe (certificat aléatoire) :
On fait le test précédent.
On définit un certificat aléatoirement de valeurs comprises entre 1 et k.

Q3.1)
Il y a k^n valeurs de certificats possible.

Q3.2)
1. On commence avec un sac initialisé à 0.
2. On teste ce certificat, si vrai, on retourne vrai
3. si faux on incrémente le certificat.
4. Retour à 2.

Pour incrémenter le certificat :
	- on vérifie que l'élément le plus à droite est < à k, si oui on
	  l'incrémente
	- sinon on le remet à 0 et on incrémente la case précédente
	- Si la case actuelle == k && la case actuelle est la première case du
	  tableau on retourne faux (tout les certificats ont été testés)


Implémentation :
================
La résolution du problème BinPack n'est possible
qu'automatiquement avec les fichiers d'exemple fournis.
Il faut pour cela exécuter le main de la classe Test_BinPack (sous
Eclipse) qui va rechercher une solution pour chaque fichier d'exemple
(1 à 6) et afficher le résultat (ainsi qu'un certificat valide si
possible).

Questions Reduction :
=====================
Q4)
---
Q4.1)
On peut réduire la Partition en cas BIN PACK :
	- la capacité des sacs sera la somme des entiers en entrée / 2
	- il y aura 2 sacs
	- il y aura n objets
	- chaque objet aura comme poid son indice + 1.

Q4.2)
	BIN PACK est au moins NP-dur.

Q4.3)
	Réduction implémentée.

Q5)
---
Q5.1)
Partition est un cas particulier de Sum. Partition peut être réduit dans Sum

Q5.2)
	- la capacité des sacs sera c
	- il y aura 2 sacs
	- il y aura n entiers de poid xn

(fin du travail réalisé)
