package de.fraunhofer.ipa.componentInterface.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.componentInterface.services.ComponentInterfaceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentInterfaceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentInterface'", "'{'", "'name'", "'NameSpace'", "'RosPublishers'", "','", "'}'", "'RosSubscribers'", "'RosSrvServers'", "'RosSrvClients'", "'RosPublisher'", "'ns'", "'RefPublisher'", "'RosSubscriber'", "'RefSubscriber'", "'RosServiceServer'", "'RefServer'", "'RosServiceClient'", "'RefClient'", "'GlobalNamespace'", "'parts'", "'RelativeNamespace'", "'PrivateNamespace'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalComponentInterfaceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentInterfaceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentInterfaceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentInterface.g"; }



     	private ComponentInterfaceGrammarAccess grammarAccess;

        public InternalComponentInterfaceParser(TokenStream input, ComponentInterfaceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ComponentInterface";
       	}

       	@Override
       	protected ComponentInterfaceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentInterface"
    // InternalComponentInterface.g:64:1: entryRuleComponentInterface returns [EObject current=null] : iv_ruleComponentInterface= ruleComponentInterface EOF ;
    public final EObject entryRuleComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInterface = null;


        try {
            // InternalComponentInterface.g:64:59: (iv_ruleComponentInterface= ruleComponentInterface EOF )
            // InternalComponentInterface.g:65:2: iv_ruleComponentInterface= ruleComponentInterface EOF
            {
             newCompositeNode(grammarAccess.getComponentInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentInterface=ruleComponentInterface();

            state._fsp--;

             current =iv_ruleComponentInterface; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentInterface"


    // $ANTLR start "ruleComponentInterface"
    // InternalComponentInterface.g:71:1: ruleComponentInterface returns [EObject current=null] : (otherlv_0= 'ComponentInterface' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleComponentInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_5_0 = null;

        EObject lv_rospublisher_8_0 = null;

        EObject lv_rospublisher_10_0 = null;

        EObject lv_rossubscriber_14_0 = null;

        EObject lv_rossubscriber_16_0 = null;

        EObject lv_rosserviceserver_20_0 = null;

        EObject lv_rosserviceserver_22_0 = null;

        EObject lv_rosserviceclient_26_0 = null;

        EObject lv_rosserviceclient_28_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:77:2: ( (otherlv_0= 'ComponentInterface' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // InternalComponentInterface.g:79:3: otherlv_0= 'ComponentInterface' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalComponentInterface.g:87:3: (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentInterface.g:88:4: otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentInterfaceAccess().getNameKeyword_2_0());
                    			
                    // InternalComponentInterface.g:92:4: ( (lv_name_3_0= ruleEString ) )
                    // InternalComponentInterface.g:93:5: (lv_name_3_0= ruleEString )
                    {
                    // InternalComponentInterface.g:93:5: (lv_name_3_0= ruleEString )
                    // InternalComponentInterface.g:94:6: lv_name_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:112:3: (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponentInterface.g:113:4: otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentInterfaceAccess().getNameSpaceKeyword_3_0());
                    			
                    // InternalComponentInterface.g:117:4: ( (lv_namespace_5_0= ruleNamespace ) )
                    // InternalComponentInterface.g:118:5: (lv_namespace_5_0= ruleNamespace )
                    {
                    // InternalComponentInterface.g:118:5: (lv_namespace_5_0= ruleNamespace )
                    // InternalComponentInterface.g:119:6: lv_namespace_5_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getNamespaceNamespaceParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_namespace_5_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:137:3: (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentInterface.g:138:4: otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalComponentInterface.g:146:4: ( (lv_rospublisher_8_0= ruleRosPublisher ) )
                    // InternalComponentInterface.g:147:5: (lv_rospublisher_8_0= ruleRosPublisher )
                    {
                    // InternalComponentInterface.g:147:5: (lv_rospublisher_8_0= ruleRosPublisher )
                    // InternalComponentInterface.g:148:6: lv_rospublisher_8_0= ruleRosPublisher
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_rospublisher_8_0=ruleRosPublisher();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rospublisher",
                    							lv_rospublisher_8_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosPublisher");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:165:4: (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalComponentInterface.g:166:5: otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_9); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalComponentInterface.g:170:5: ( (lv_rospublisher_10_0= ruleRosPublisher ) )
                    	    // InternalComponentInterface.g:171:6: (lv_rospublisher_10_0= ruleRosPublisher )
                    	    {
                    	    // InternalComponentInterface.g:171:6: (lv_rospublisher_10_0= ruleRosPublisher )
                    	    // InternalComponentInterface.g:172:7: lv_rospublisher_10_0= ruleRosPublisher
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_rospublisher_10_0=ruleRosPublisher();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rospublisher",
                    	    								lv_rospublisher_10_0,
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosPublisher");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:195:3: (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentInterface.g:196:4: otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_5_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalComponentInterface.g:204:4: ( (lv_rossubscriber_14_0= ruleRosSubscriber ) )
                    // InternalComponentInterface.g:205:5: (lv_rossubscriber_14_0= ruleRosSubscriber )
                    {
                    // InternalComponentInterface.g:205:5: (lv_rossubscriber_14_0= ruleRosSubscriber )
                    // InternalComponentInterface.g:206:6: lv_rossubscriber_14_0= ruleRosSubscriber
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_rossubscriber_14_0=ruleRosSubscriber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rossubscriber",
                    							lv_rossubscriber_14_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosSubscriber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:223:4: (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalComponentInterface.g:224:5: otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_12); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalComponentInterface.g:228:5: ( (lv_rossubscriber_16_0= ruleRosSubscriber ) )
                    	    // InternalComponentInterface.g:229:6: (lv_rossubscriber_16_0= ruleRosSubscriber )
                    	    {
                    	    // InternalComponentInterface.g:229:6: (lv_rossubscriber_16_0= ruleRosSubscriber )
                    	    // InternalComponentInterface.g:230:7: lv_rossubscriber_16_0= ruleRosSubscriber
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_rossubscriber_16_0=ruleRosSubscriber();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rossubscriber",
                    	    								lv_rossubscriber_16_0,
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosSubscriber");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_17, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:253:3: (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentInterface.g:254:4: otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_6_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_19, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalComponentInterface.g:262:4: ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) )
                    // InternalComponentInterface.g:263:5: (lv_rosserviceserver_20_0= ruleRosServiceServer )
                    {
                    // InternalComponentInterface.g:263:5: (lv_rosserviceserver_20_0= ruleRosServiceServer )
                    // InternalComponentInterface.g:264:6: lv_rosserviceserver_20_0= ruleRosServiceServer
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_rosserviceserver_20_0=ruleRosServiceServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosserviceserver",
                    							lv_rosserviceserver_20_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:281:4: (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalComponentInterface.g:282:5: otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) )
                    	    {
                    	    otherlv_21=(Token)match(input,16,FOLLOW_14); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalComponentInterface.g:286:5: ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) )
                    	    // InternalComponentInterface.g:287:6: (lv_rosserviceserver_22_0= ruleRosServiceServer )
                    	    {
                    	    // InternalComponentInterface.g:287:6: (lv_rosserviceserver_22_0= ruleRosServiceServer )
                    	    // InternalComponentInterface.g:288:7: lv_rosserviceserver_22_0= ruleRosServiceServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_rosserviceserver_22_0=ruleRosServiceServer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rosserviceserver",
                    	    								lv_rosserviceserver_22_0,
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceServer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_23, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:311:3: (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentInterface.g:312:4: otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_7_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_25, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalComponentInterface.g:320:4: ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) )
                    // InternalComponentInterface.g:321:5: (lv_rosserviceclient_26_0= ruleRosServiceClient )
                    {
                    // InternalComponentInterface.g:321:5: (lv_rosserviceclient_26_0= ruleRosServiceClient )
                    // InternalComponentInterface.g:322:6: lv_rosserviceclient_26_0= ruleRosServiceClient
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_rosserviceclient_26_0=ruleRosServiceClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosserviceclient",
                    							lv_rosserviceclient_26_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:339:4: (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalComponentInterface.g:340:5: otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) )
                    	    {
                    	    otherlv_27=(Token)match(input,16,FOLLOW_16); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalComponentInterface.g:344:5: ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) )
                    	    // InternalComponentInterface.g:345:6: (lv_rosserviceclient_28_0= ruleRosServiceClient )
                    	    {
                    	    // InternalComponentInterface.g:345:6: (lv_rosserviceclient_28_0= ruleRosServiceClient )
                    	    // InternalComponentInterface.g:346:7: lv_rosserviceclient_28_0= ruleRosServiceClient
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_rosserviceclient_28_0=ruleRosServiceClient();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rosserviceclient",
                    	    								lv_rosserviceclient_28_0,
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceClient");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_29, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentInterface"


    // $ANTLR start "entryRuleNamespace"
    // InternalComponentInterface.g:377:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalComponentInterface.g:377:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalComponentInterface.g:378:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalComponentInterface.g:384:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:390:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalComponentInterface.g:391:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalComponentInterface.g:391:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 32:
                {
                alt11=2;
                }
                break;
            case 33:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalComponentInterface.g:392:3: this_GlobalNamespace_0= ruleGlobalNamespace
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getGlobalNamespaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GlobalNamespace_0=ruleGlobalNamespace();

                    state._fsp--;


                    			current = this_GlobalNamespace_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:401:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getRelativeNamespace_ImplParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelativeNamespace_Impl_1=ruleRelativeNamespace_Impl();

                    state._fsp--;


                    			current = this_RelativeNamespace_Impl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentInterface.g:410:3: this_PrivateNamespace_2= rulePrivateNamespace
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getPrivateNamespaceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrivateNamespace_2=rulePrivateNamespace();

                    state._fsp--;


                    			current = this_PrivateNamespace_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleRosPublisher"
    // InternalComponentInterface.g:422:1: entryRuleRosPublisher returns [EObject current=null] : iv_ruleRosPublisher= ruleRosPublisher EOF ;
    public final EObject entryRuleRosPublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosPublisher = null;


        try {
            // InternalComponentInterface.g:422:53: (iv_ruleRosPublisher= ruleRosPublisher EOF )
            // InternalComponentInterface.g:423:2: iv_ruleRosPublisher= ruleRosPublisher EOF
            {
             newCompositeNode(grammarAccess.getRosPublisherRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosPublisher=ruleRosPublisher();

            state._fsp--;

             current =iv_ruleRosPublisher; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosPublisher"


    // $ANTLR start "ruleRosPublisher"
    // InternalComponentInterface.g:429:1: ruleRosPublisher returns [EObject current=null] : ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefPublisher' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleRosPublisher() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:435:2: ( ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefPublisher' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalComponentInterface.g:436:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefPublisher' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalComponentInterface.g:436:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefPublisher' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalComponentInterface.g:437:3: () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefPublisher' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalComponentInterface.g:437:3: ()
            // InternalComponentInterface.g:438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosPublisherAccess().getRosPublisherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1());
            		
            // InternalComponentInterface.g:448:3: ( (lv_name_2_0= ruleEString ) )
            // InternalComponentInterface.g:449:4: (lv_name_2_0= ruleEString )
            {
            // InternalComponentInterface.g:449:4: (lv_name_2_0= ruleEString )
            // InternalComponentInterface.g:450:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosPublisherAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRosPublisherRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:471:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentInterface.g:472:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosPublisherAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:476:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:477:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:477:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:478:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosPublisherAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosPublisherRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:496:3: (otherlv_6= 'RefPublisher' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentInterface.g:497:4: otherlv_6= 'RefPublisher' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getRosPublisherAccess().getRefPublisherKeyword_5_0());
                    			
                    // InternalComponentInterface.g:501:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:502:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:502:5: ( ruleEString )
                    // InternalComponentInterface.g:503:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRosPublisherRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRosPublisherAccess().getPublisherPublisherCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRosPublisherAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosPublisher"


    // $ANTLR start "entryRuleRosSubscriber"
    // InternalComponentInterface.g:526:1: entryRuleRosSubscriber returns [EObject current=null] : iv_ruleRosSubscriber= ruleRosSubscriber EOF ;
    public final EObject entryRuleRosSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSubscriber = null;


        try {
            // InternalComponentInterface.g:526:54: (iv_ruleRosSubscriber= ruleRosSubscriber EOF )
            // InternalComponentInterface.g:527:2: iv_ruleRosSubscriber= ruleRosSubscriber EOF
            {
             newCompositeNode(grammarAccess.getRosSubscriberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosSubscriber=ruleRosSubscriber();

            state._fsp--;

             current =iv_ruleRosSubscriber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosSubscriber"


    // $ANTLR start "ruleRosSubscriber"
    // InternalComponentInterface.g:533:1: ruleRosSubscriber returns [EObject current=null] : ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleRosSubscriber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:539:2: ( ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalComponentInterface.g:540:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalComponentInterface.g:540:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalComponentInterface.g:541:3: () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalComponentInterface.g:541:3: ()
            // InternalComponentInterface.g:542:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1());
            		
            // InternalComponentInterface.g:552:3: ( (lv_name_2_0= ruleEString ) )
            // InternalComponentInterface.g:553:4: (lv_name_2_0= ruleEString )
            {
            // InternalComponentInterface.g:553:4: (lv_name_2_0= ruleEString )
            // InternalComponentInterface.g:554:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosSubscriberAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRosSubscriberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:575:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentInterface.g:576:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:580:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:581:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:581:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:582:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosSubscriberAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosSubscriberRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:600:3: (otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentInterface.g:601:4: otherlv_6= 'RefSubscriber' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getRosSubscriberAccess().getRefSubscriberKeyword_5_0());
                    			
                    // InternalComponentInterface.g:605:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:606:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:606:5: ( ruleEString )
                    // InternalComponentInterface.g:607:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRosSubscriberRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRosSubscriberAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosSubscriber"


    // $ANTLR start "entryRuleRosServiceServer"
    // InternalComponentInterface.g:630:1: entryRuleRosServiceServer returns [EObject current=null] : iv_ruleRosServiceServer= ruleRosServiceServer EOF ;
    public final EObject entryRuleRosServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceServer = null;


        try {
            // InternalComponentInterface.g:630:57: (iv_ruleRosServiceServer= ruleRosServiceServer EOF )
            // InternalComponentInterface.g:631:2: iv_ruleRosServiceServer= ruleRosServiceServer EOF
            {
             newCompositeNode(grammarAccess.getRosServiceServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosServiceServer=ruleRosServiceServer();

            state._fsp--;

             current =iv_ruleRosServiceServer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosServiceServer"


    // $ANTLR start "ruleRosServiceServer"
    // InternalComponentInterface.g:637:1: ruleRosServiceServer returns [EObject current=null] : ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefServer' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleRosServiceServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:643:2: ( ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefServer' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) )
            // InternalComponentInterface.g:644:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefServer' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            {
            // InternalComponentInterface.g:644:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefServer' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            // InternalComponentInterface.g:645:3: () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefServer' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}'
            {
            // InternalComponentInterface.g:645:3: ()
            // InternalComponentInterface.g:646:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1());
            		
            // InternalComponentInterface.g:656:3: ( (lv_name_2_0= ruleEString ) )
            // InternalComponentInterface.g:657:4: (lv_name_2_0= ruleEString )
            {
            // InternalComponentInterface.g:657:4: (lv_name_2_0= ruleEString )
            // InternalComponentInterface.g:658:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosServiceServerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRosServiceServerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:679:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentInterface.g:680:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:684:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:685:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:685:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:686:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosServiceServerRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:704:3: (otherlv_6= 'RefServer' ( (otherlv_7= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentInterface.g:705:4: otherlv_6= 'RefServer' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getRosServiceServerAccess().getRefServerKeyword_5_0());
                    			
                    // InternalComponentInterface.g:709:4: ( (otherlv_7= RULE_ID ) )
                    // InternalComponentInterface.g:710:5: (otherlv_7= RULE_ID )
                    {
                    // InternalComponentInterface.g:710:5: (otherlv_7= RULE_ID )
                    // InternalComponentInterface.g:711:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRosServiceServerRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_7, grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRosServiceServerAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosServiceServer"


    // $ANTLR start "entryRuleRosServiceClient"
    // InternalComponentInterface.g:731:1: entryRuleRosServiceClient returns [EObject current=null] : iv_ruleRosServiceClient= ruleRosServiceClient EOF ;
    public final EObject entryRuleRosServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceClient = null;


        try {
            // InternalComponentInterface.g:731:57: (iv_ruleRosServiceClient= ruleRosServiceClient EOF )
            // InternalComponentInterface.g:732:2: iv_ruleRosServiceClient= ruleRosServiceClient EOF
            {
             newCompositeNode(grammarAccess.getRosServiceClientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosServiceClient=ruleRosServiceClient();

            state._fsp--;

             current =iv_ruleRosServiceClient; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosServiceClient"


    // $ANTLR start "ruleRosServiceClient"
    // InternalComponentInterface.g:738:1: ruleRosServiceClient returns [EObject current=null] : ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefClient' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleRosServiceClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:744:2: ( ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefClient' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) )
            // InternalComponentInterface.g:745:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefClient' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            {
            // InternalComponentInterface.g:745:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefClient' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            // InternalComponentInterface.g:746:3: () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? (otherlv_6= 'RefClient' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}'
            {
            // InternalComponentInterface.g:746:3: ()
            // InternalComponentInterface.g:747:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1());
            		
            // InternalComponentInterface.g:757:3: ( (lv_name_2_0= ruleEString ) )
            // InternalComponentInterface.g:758:4: (lv_name_2_0= ruleEString )
            {
            // InternalComponentInterface.g:758:4: (lv_name_2_0= ruleEString )
            // InternalComponentInterface.g:759:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosServiceClientAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRosServiceClientRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:780:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentInterface.g:781:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:785:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:786:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:786:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:787:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosServiceClientRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:805:3: (otherlv_6= 'RefClient' ( (otherlv_7= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:806:4: otherlv_6= 'RefClient' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getRosServiceClientAccess().getRefClientKeyword_5_0());
                    			
                    // InternalComponentInterface.g:810:4: ( (otherlv_7= RULE_ID ) )
                    // InternalComponentInterface.g:811:5: (otherlv_7= RULE_ID )
                    {
                    // InternalComponentInterface.g:811:5: (otherlv_7= RULE_ID )
                    // InternalComponentInterface.g:812:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRosServiceClientRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_7, grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRosServiceClientAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosServiceClient"


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalComponentInterface.g:832:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalComponentInterface.g:832:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalComponentInterface.g:833:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
            {
             newCompositeNode(grammarAccess.getGlobalNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalNamespace=ruleGlobalNamespace();

            state._fsp--;

             current =iv_ruleGlobalNamespace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalNamespace"


    // $ANTLR start "ruleGlobalNamespace"
    // InternalComponentInterface.g:839:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_parts_5_0 = null;

        AntlrDatatypeRuleToken lv_parts_7_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:845:2: ( ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:846:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:846:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalComponentInterface.g:847:3: () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:847:3: ()
            // InternalComponentInterface.g:848:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:862:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentInterface.g:863:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalComponentInterface.g:871:4: ( (lv_parts_5_0= ruleEString ) )
                    // InternalComponentInterface.g:872:5: (lv_parts_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:872:5: (lv_parts_5_0= ruleEString )
                    // InternalComponentInterface.g:873:6: lv_parts_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_parts_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:890:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==16) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalComponentInterface.g:891:5: otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalComponentInterface.g:895:5: ( (lv_parts_7_0= ruleEString ) )
                    	    // InternalComponentInterface.g:896:6: (lv_parts_7_0= ruleEString )
                    	    {
                    	    // InternalComponentInterface.g:896:6: (lv_parts_7_0= ruleEString )
                    	    // InternalComponentInterface.g:897:7: lv_parts_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_parts_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalNamespace"


    // $ANTLR start "entryRuleRelativeNamespace_Impl"
    // InternalComponentInterface.g:928:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalComponentInterface.g:928:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalComponentInterface.g:929:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
            {
             newCompositeNode(grammarAccess.getRelativeNamespace_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeNamespace_Impl=ruleRelativeNamespace_Impl();

            state._fsp--;

             current =iv_ruleRelativeNamespace_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelativeNamespace_Impl"


    // $ANTLR start "ruleRelativeNamespace_Impl"
    // InternalComponentInterface.g:935:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_parts_5_0 = null;

        AntlrDatatypeRuleToken lv_parts_7_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:941:2: ( ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:942:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:942:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalComponentInterface.g:943:3: () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:943:3: ()
            // InternalComponentInterface.g:944:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:958:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentInterface.g:959:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalComponentInterface.g:967:4: ( (lv_parts_5_0= ruleEString ) )
                    // InternalComponentInterface.g:968:5: (lv_parts_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:968:5: (lv_parts_5_0= ruleEString )
                    // InternalComponentInterface.g:969:6: lv_parts_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_parts_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:986:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==16) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalComponentInterface.g:987:5: otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalComponentInterface.g:991:5: ( (lv_parts_7_0= ruleEString ) )
                    	    // InternalComponentInterface.g:992:6: (lv_parts_7_0= ruleEString )
                    	    {
                    	    // InternalComponentInterface.g:992:6: (lv_parts_7_0= ruleEString )
                    	    // InternalComponentInterface.g:993:7: lv_parts_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_parts_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelativeNamespace_Impl"


    // $ANTLR start "entryRulePrivateNamespace"
    // InternalComponentInterface.g:1024:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalComponentInterface.g:1024:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalComponentInterface.g:1025:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
            {
             newCompositeNode(grammarAccess.getPrivateNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrivateNamespace=rulePrivateNamespace();

            state._fsp--;

             current =iv_rulePrivateNamespace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrivateNamespace"


    // $ANTLR start "rulePrivateNamespace"
    // InternalComponentInterface.g:1031:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject rulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_parts_5_0 = null;

        AntlrDatatypeRuleToken lv_parts_7_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1037:2: ( ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:1038:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:1038:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalComponentInterface.g:1039:3: () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:1039:3: ()
            // InternalComponentInterface.g:1040:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:1054:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentInterface.g:1055:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalComponentInterface.g:1063:4: ( (lv_parts_5_0= ruleEString ) )
                    // InternalComponentInterface.g:1064:5: (lv_parts_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1064:5: (lv_parts_5_0= ruleEString )
                    // InternalComponentInterface.g:1065:6: lv_parts_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_parts_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:1082:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==16) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalComponentInterface.g:1083:5: otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalComponentInterface.g:1087:5: ( (lv_parts_7_0= ruleEString ) )
                    	    // InternalComponentInterface.g:1088:6: (lv_parts_7_0= ruleEString )
                    	    {
                    	    // InternalComponentInterface.g:1088:6: (lv_parts_7_0= ruleEString )
                    	    // InternalComponentInterface.g:1089:7: lv_parts_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_parts_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrivateNamespace"


    // $ANTLR start "entryRuleEString"
    // InternalComponentInterface.g:1120:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentInterface.g:1120:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentInterface.g:1121:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalComponentInterface.g:1127:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1133:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalComponentInterface.g:1134:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalComponentInterface.g:1134:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentInterface.g:1135:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:1143:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001EE000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001EC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000340000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001E8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C20000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002420000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008420000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020420000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080020000L});

}