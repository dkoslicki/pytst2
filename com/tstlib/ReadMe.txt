========================================================================
    BIBLIOTH�QUE ATL : vue d'ensemble du projet tstlib
========================================================================

AppWizard a cr�� ce projet tstlib pour vous afin que vous l'utilisiez comme point de d�part pour l'�criture
de votre DLL.
Ce projet est impl�ment� avec des attributs Visual C++.

Ce fichier contient un r�sum� du contenu de chacun des fichiers qui
constituent votre projet.

tstlib.vcproj
    Il s'agit du fichier projet principal pour les projets VC++ g�n�r�s � l'aide d'un Assistant Application. 
    Il contient les informations sur la version de Visual C++ qui a g�n�r� le fichier et 
    des informations sur les plates-formes, configurations et fonctionnalit�s du projet s�lectionn�es avec
    l'Assistant Application.

_tstlib.idl
    Ce fichier sera g�n�r� par le compilateur lorsque le projet est g�n�r�. Il contiendra les d�finitions IDL 
    de la biblioth�que de types, les interfaces et les co-classes d�finies dans votre projet.
    Ce fichier sera trait� par le compilateur MIDL pour g�n�rer�:
        les d�finitions d'interface C++ et les d�clarations GUID (_tstlib.h)
        D�finitions GUID                                (_tstlib_i.c)
        Une biblioth�que de types                                  (_tstlib.tlb)
        Code de marshaling                                 (_tstlib_p.c et dlldata.c)
tstlib.cpp
    Ce fichier contient la table d'objets et l'impl�mentation des exportations de votre DLL.
tstlib.rc
    Il s'agit de la liste de toutes les ressources Microsoft Windows que le
    programme utilise.

tstlib.def
    Ce fichier de d�finition de module fournit � l'�diteur de liens des informations sur les exportations
    requises par votre DLL. Il contient les exportations pour�:
        DllGetClassObject  
        DllCanUnloadNow    
        GetProxyDllInfo    
        DllRegisterServer	
        DllUnregisterServer

/////////////////////////////////////////////////////////////////////////////
Autres fichiers standard�:

StdAfx.h, StdAfx.cpp
    Ces fichiers sont utilis�s pour g�n�rer un fichier d'en-t�te pr�compil� (PCH) 
    nomm� tstlib.pch et un fichier de type pr�compil� nomm� StdAfx.obj.

Resource.h
    Il s'agit du fichier d'en-t�te standard qui d�finit les ID de ressources.

/////////////////////////////////////////////////////////////////////////////
Fichier de d�finition de module et projet de DLL proxy/stub�:

tstlibps.vcproj
    Ce fichier est le fichier projet pour la g�n�ration d'une DLL proxy/stub DLL si n�cessaire.
	Le fichier IDL du projet principal doit contenir au moins une interface et vous devez 
	compiler en premier le fichier IDL avant de g�n�rer la DLL proxy/stub.	Ce processus g�n�re
	dlldata.c, tstlib_i.c et tstlib_p.c qui sont requis
	pour g�n�rer la DLL proxy/stub.

tstlibps.def
    Ce fichier de d�finition de module fournit � l'�diteur de liens les informations sur les exportations
    requises par proxy/stub.
/////////////////////////////////////////////////////////////////////////////
