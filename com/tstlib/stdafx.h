// stdafx.h : Fichier Include pour les fichiers Include syst�me standard,
// ou les fichiers Include sp�cifiques aux projets qui sont utilis�s fr�quemment,
// et sont rarement modifi�s

#pragma once

#ifndef STRICT
#define STRICT
#endif

// Modifiez les d�finitions suivantes si vous devez cibler une plate-forme avant celles sp�cifi�es ci-dessous.
// Reportez-vous � MSDN pour obtenir les derni�res informations sur les valeurs correspondantes pour les diff�rentes plates-formes.
#ifndef WINVER				// Autorise l'utilisation des fonctionnalit�s sp�cifiques � Windows�95 et Windows NT�4 ou version ult�rieure.
#define WINVER 0x0400		// Attribuez la valeur appropri�e � cet �l�ment pour cibler Windows�98 et Windows�2000 ou version ult�rieure.
#endif

#ifndef _WIN32_WINNT		// Autorise l'utilisation des fonctionnalit�s sp�cifiques � Windows NT�4 ou version ult�rieure.
#define _WIN32_WINNT 0x0400	// Attribuez la valeur appropri�e � cet �l�ment pour cibler Windows�2000 ou version ult�rieure.
#endif						

#ifndef _WIN32_WINDOWS		// Autorise l'utilisation des fonctionnalit�s sp�cifiques � Windows�98 ou version ult�rieure.
#define _WIN32_WINDOWS 0x0410 // Attribuez la valeur appropri�e � cet �l�ment pour cibler Windows�Me ou version ult�rieure.
#endif

#ifndef _WIN32_IE			// Autorise l'utilisation des fonctionnalit�s sp�cifiques � IE�4.0 ou version ult�rieure.
#define _WIN32_IE 0x0400	// Attribuez la valeur appropri�e � cet �l�ment pour cibler IE�5.0 ou version ult�rieure.
#endif

#define _ATL_APARTMENT_THREADED
#define _ATL_NO_AUTOMATIC_NAMESPACE

#define _ATL_CSTRING_EXPLICIT_CONSTRUCTORS	// certains constructeurs CString seront explicites

// d�sactive le masquage ATL de certains messages d'avertissement courants et souvent ignor�s
#define _ATL_ALL_WARNINGS

#include <atlbase.h>
#include <atlcom.h>
#include <atlwin.h>
#include <atltypes.h>
#include <atlctl.h>
#include <atlhost.h>

using namespace ATL;
